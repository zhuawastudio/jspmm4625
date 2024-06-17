package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GuihuaxinxiDao;
import com.entity.GuihuaxinxiEntity;
import com.service.GuihuaxinxiService;
import com.entity.vo.GuihuaxinxiVO;
import com.entity.view.GuihuaxinxiView;

@Service("guihuaxinxiService")
public class GuihuaxinxiServiceImpl extends ServiceImpl<GuihuaxinxiDao, GuihuaxinxiEntity> implements GuihuaxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuihuaxinxiEntity> page = this.selectPage(
                new Query<GuihuaxinxiEntity>(params).getPage(),
                new EntityWrapper<GuihuaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuihuaxinxiEntity> wrapper) {
		  Page<GuihuaxinxiView> page =new Query<GuihuaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuihuaxinxiVO> selectListVO(Wrapper<GuihuaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuihuaxinxiVO selectVO(Wrapper<GuihuaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuihuaxinxiView> selectListView(Wrapper<GuihuaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuihuaxinxiView selectView(Wrapper<GuihuaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
