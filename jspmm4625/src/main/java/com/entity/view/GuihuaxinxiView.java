package com.entity.view;

import com.entity.GuihuaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 规划信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-06 12:17:33
 */
@TableName("guihuaxinxi")
public class GuihuaxinxiView  extends GuihuaxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GuihuaxinxiView(){
	}
 
 	public GuihuaxinxiView(GuihuaxinxiEntity guihuaxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, guihuaxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
