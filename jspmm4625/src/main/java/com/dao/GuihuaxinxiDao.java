package com.dao;

import com.entity.GuihuaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuihuaxinxiVO;
import com.entity.view.GuihuaxinxiView;


/**
 * 规划信息
 * 
 * @author 
 * @email 
 * @date 2023-03-06 12:17:33
 */
public interface GuihuaxinxiDao extends BaseMapper<GuihuaxinxiEntity> {
	
	List<GuihuaxinxiVO> selectListVO(@Param("ew") Wrapper<GuihuaxinxiEntity> wrapper);
	
	GuihuaxinxiVO selectVO(@Param("ew") Wrapper<GuihuaxinxiEntity> wrapper);
	
	List<GuihuaxinxiView> selectListView(@Param("ew") Wrapper<GuihuaxinxiEntity> wrapper);

	List<GuihuaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GuihuaxinxiEntity> wrapper);
	
	GuihuaxinxiView selectView(@Param("ew") Wrapper<GuihuaxinxiEntity> wrapper);
	

}
