package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiuzhixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiuzhixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiuzhixinxiView;


/**
 * 求职信息
 *
 * @author 
 * @email 
 * @date 2023-03-06 12:17:33
 */
public interface QiuzhixinxiService extends IService<QiuzhixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiuzhixinxiVO> selectListVO(Wrapper<QiuzhixinxiEntity> wrapper);
   	
   	QiuzhixinxiVO selectVO(@Param("ew") Wrapper<QiuzhixinxiEntity> wrapper);
   	
   	List<QiuzhixinxiView> selectListView(Wrapper<QiuzhixinxiEntity> wrapper);
   	
   	QiuzhixinxiView selectView(@Param("ew") Wrapper<QiuzhixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiuzhixinxiEntity> wrapper);
   	

}

