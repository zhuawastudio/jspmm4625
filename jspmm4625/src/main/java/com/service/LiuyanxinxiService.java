package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LiuyanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LiuyanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LiuyanxinxiView;


/**
 * 留言信息
 *
 * @author 
 * @email 
 * @date 2023-03-06 12:17:33
 */
public interface LiuyanxinxiService extends IService<LiuyanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LiuyanxinxiVO> selectListVO(Wrapper<LiuyanxinxiEntity> wrapper);
   	
   	LiuyanxinxiVO selectVO(@Param("ew") Wrapper<LiuyanxinxiEntity> wrapper);
   	
   	List<LiuyanxinxiView> selectListView(Wrapper<LiuyanxinxiEntity> wrapper);
   	
   	LiuyanxinxiView selectView(@Param("ew") Wrapper<LiuyanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LiuyanxinxiEntity> wrapper);
   	

}

