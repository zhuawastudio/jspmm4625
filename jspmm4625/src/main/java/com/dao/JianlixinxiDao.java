package com.dao;

import com.entity.JianlixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianlixinxiVO;
import com.entity.view.JianlixinxiView;


/**
 * 简历信息
 * 
 * @author 
 * @email 
 * @date 2023-03-06 12:17:33
 */
public interface JianlixinxiDao extends BaseMapper<JianlixinxiEntity> {
	
	List<JianlixinxiVO> selectListVO(@Param("ew") Wrapper<JianlixinxiEntity> wrapper);
	
	JianlixinxiVO selectVO(@Param("ew") Wrapper<JianlixinxiEntity> wrapper);
	
	List<JianlixinxiView> selectListView(@Param("ew") Wrapper<JianlixinxiEntity> wrapper);

	List<JianlixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JianlixinxiEntity> wrapper);
	
	JianlixinxiView selectView(@Param("ew") Wrapper<JianlixinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JianlixinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JianlixinxiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JianlixinxiEntity> wrapper);



}
