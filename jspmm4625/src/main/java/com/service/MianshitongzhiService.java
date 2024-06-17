package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MianshitongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MianshitongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MianshitongzhiView;


/**
 * 面试通知
 *
 * @author 
 * @email 
 * @date 2023-03-06 12:17:33
 */
public interface MianshitongzhiService extends IService<MianshitongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MianshitongzhiVO> selectListVO(Wrapper<MianshitongzhiEntity> wrapper);
   	
   	MianshitongzhiVO selectVO(@Param("ew") Wrapper<MianshitongzhiEntity> wrapper);
   	
   	List<MianshitongzhiView> selectListView(Wrapper<MianshitongzhiEntity> wrapper);
   	
   	MianshitongzhiView selectView(@Param("ew") Wrapper<MianshitongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MianshitongzhiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<MianshitongzhiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<MianshitongzhiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<MianshitongzhiEntity> wrapper);



}

