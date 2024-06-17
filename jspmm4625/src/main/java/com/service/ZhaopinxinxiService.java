package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhaopinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhaopinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhaopinxinxiView;


/**
 * 招聘信息
 *
 * @author 
 * @email 
 * @date 2023-03-06 12:17:33
 */
public interface ZhaopinxinxiService extends IService<ZhaopinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhaopinxinxiVO> selectListVO(Wrapper<ZhaopinxinxiEntity> wrapper);
   	
   	ZhaopinxinxiVO selectVO(@Param("ew") Wrapper<ZhaopinxinxiEntity> wrapper);
   	
   	List<ZhaopinxinxiView> selectListView(Wrapper<ZhaopinxinxiEntity> wrapper);
   	
   	ZhaopinxinxiView selectView(@Param("ew") Wrapper<ZhaopinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhaopinxinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZhaopinxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZhaopinxinxiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZhaopinxinxiEntity> wrapper);



}

