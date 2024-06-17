package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuihuaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuihuaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuihuaxinxiView;


/**
 * 规划信息
 *
 * @author 
 * @email 
 * @date 2023-03-06 12:17:33
 */
public interface GuihuaxinxiService extends IService<GuihuaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuihuaxinxiVO> selectListVO(Wrapper<GuihuaxinxiEntity> wrapper);
   	
   	GuihuaxinxiVO selectVO(@Param("ew") Wrapper<GuihuaxinxiEntity> wrapper);
   	
   	List<GuihuaxinxiView> selectListView(Wrapper<GuihuaxinxiEntity> wrapper);
   	
   	GuihuaxinxiView selectView(@Param("ew") Wrapper<GuihuaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuihuaxinxiEntity> wrapper);
   	

}

