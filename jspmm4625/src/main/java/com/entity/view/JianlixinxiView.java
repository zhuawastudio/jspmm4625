package com.entity.view;

import com.entity.JianlixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 简历信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-06 12:17:33
 */
@TableName("jianlixinxi")
public class JianlixinxiView  extends JianlixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianlixinxiView(){
	}
 
 	public JianlixinxiView(JianlixinxiEntity jianlixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jianlixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
