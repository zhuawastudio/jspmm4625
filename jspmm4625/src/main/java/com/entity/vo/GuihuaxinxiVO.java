package com.entity.vo;

import com.entity.GuihuaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 规划信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-06 12:17:33
 */
public class GuihuaxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 规划时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date guihuashijian;
		
	/**
	 * 规划内容
	 */
	
	private String guihuaneirong;
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：规划时间
	 */
	 
	public void setGuihuashijian(Date guihuashijian) {
		this.guihuashijian = guihuashijian;
	}
	
	/**
	 * 获取：规划时间
	 */
	public Date getGuihuashijian() {
		return guihuashijian;
	}
				
	
	/**
	 * 设置：规划内容
	 */
	 
	public void setGuihuaneirong(String guihuaneirong) {
		this.guihuaneirong = guihuaneirong;
	}
	
	/**
	 * 获取：规划内容
	 */
	public String getGuihuaneirong() {
		return guihuaneirong;
	}
			
}
