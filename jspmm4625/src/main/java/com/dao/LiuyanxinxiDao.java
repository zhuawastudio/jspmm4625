package com.dao;

import com.entity.LiuyanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LiuyanxinxiVO;
import com.entity.view.LiuyanxinxiView;


/**
 * 留言信息
 * 
 * @author 
 * @email 
 * @date 2023-03-06 12:17:33
 */
public interface LiuyanxinxiDao extends BaseMapper<LiuyanxinxiEntity> {
	
	List<LiuyanxinxiVO> selectListVO(@Param("ew") Wrapper<LiuyanxinxiEntity> wrapper);
	
	LiuyanxinxiVO selectVO(@Param("ew") Wrapper<LiuyanxinxiEntity> wrapper);
	
	List<LiuyanxinxiView> selectListView(@Param("ew") Wrapper<LiuyanxinxiEntity> wrapper);

	List<LiuyanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LiuyanxinxiEntity> wrapper);
	
	LiuyanxinxiView selectView(@Param("ew") Wrapper<LiuyanxinxiEntity> wrapper);
	

}
