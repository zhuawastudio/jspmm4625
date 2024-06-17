package com.dao;

import com.entity.MianshitongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MianshitongzhiVO;
import com.entity.view.MianshitongzhiView;


/**
 * 面试通知
 * 
 * @author 
 * @email 
 * @date 2023-03-06 12:17:33
 */
public interface MianshitongzhiDao extends BaseMapper<MianshitongzhiEntity> {
	
	List<MianshitongzhiVO> selectListVO(@Param("ew") Wrapper<MianshitongzhiEntity> wrapper);
	
	MianshitongzhiVO selectVO(@Param("ew") Wrapper<MianshitongzhiEntity> wrapper);
	
	List<MianshitongzhiView> selectListView(@Param("ew") Wrapper<MianshitongzhiEntity> wrapper);

	List<MianshitongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<MianshitongzhiEntity> wrapper);
	
	MianshitongzhiView selectView(@Param("ew") Wrapper<MianshitongzhiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MianshitongzhiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MianshitongzhiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MianshitongzhiEntity> wrapper);



}
