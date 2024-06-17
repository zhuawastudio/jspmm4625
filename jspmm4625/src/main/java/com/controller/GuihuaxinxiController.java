package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.GuihuaxinxiEntity;
import com.entity.view.GuihuaxinxiView;

import com.service.GuihuaxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 规划信息
 * 后端接口
 * @author 
 * @email 
 * @date 2023-03-06 12:17:33
 */
@RestController
@RequestMapping("/guihuaxinxi")
public class GuihuaxinxiController {
    @Autowired
    private GuihuaxinxiService guihuaxinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GuihuaxinxiEntity guihuaxinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			guihuaxinxi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GuihuaxinxiEntity> ew = new EntityWrapper<GuihuaxinxiEntity>();

    	PageUtils page = guihuaxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guihuaxinxi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GuihuaxinxiEntity guihuaxinxi, 
		HttpServletRequest request){
        EntityWrapper<GuihuaxinxiEntity> ew = new EntityWrapper<GuihuaxinxiEntity>();

    	PageUtils page = guihuaxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guihuaxinxi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GuihuaxinxiEntity guihuaxinxi){
       	EntityWrapper<GuihuaxinxiEntity> ew = new EntityWrapper<GuihuaxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( guihuaxinxi, "guihuaxinxi")); 
        return R.ok().put("data", guihuaxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GuihuaxinxiEntity guihuaxinxi){
        EntityWrapper< GuihuaxinxiEntity> ew = new EntityWrapper< GuihuaxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( guihuaxinxi, "guihuaxinxi")); 
		GuihuaxinxiView guihuaxinxiView =  guihuaxinxiService.selectView(ew);
		return R.ok("查询规划信息成功").put("data", guihuaxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GuihuaxinxiEntity guihuaxinxi = guihuaxinxiService.selectById(id);
        return R.ok().put("data", guihuaxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GuihuaxinxiEntity guihuaxinxi = guihuaxinxiService.selectById(id);
        return R.ok().put("data", guihuaxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GuihuaxinxiEntity guihuaxinxi, HttpServletRequest request){
    	guihuaxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(guihuaxinxi);

        guihuaxinxiService.insert(guihuaxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GuihuaxinxiEntity guihuaxinxi, HttpServletRequest request){
    	guihuaxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(guihuaxinxi);

        guihuaxinxiService.insert(guihuaxinxi);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GuihuaxinxiEntity guihuaxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(guihuaxinxi);
        guihuaxinxiService.updateById(guihuaxinxi);//全部更新
        return R.ok();
    }

    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        guihuaxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<GuihuaxinxiEntity> wrapper = new EntityWrapper<GuihuaxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = guihuaxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	








}