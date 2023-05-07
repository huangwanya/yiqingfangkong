package com.entity.model;

import com.entity.JubaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 举报信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-11 10:17:46
 */
public class JubaoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 举报名称
	 */
	
	private String jubaomingcheng;
		
	/**
	 * 举报内容
	 */
	
	private String jubaoneirong;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 举报日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jubaoriqi;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：举报名称
	 */
	 
	public void setJubaomingcheng(String jubaomingcheng) {
		this.jubaomingcheng = jubaomingcheng;
	}
	
	/**
	 * 获取：举报名称
	 */
	public String getJubaomingcheng() {
		return jubaomingcheng;
	}
				
	
	/**
	 * 设置：举报内容
	 */
	 
	public void setJubaoneirong(String jubaoneirong) {
		this.jubaoneirong = jubaoneirong;
	}
	
	/**
	 * 获取：举报内容
	 */
	public String getJubaoneirong() {
		return jubaoneirong;
	}
				
	
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
	 * 设置：举报日期
	 */
	 
	public void setJubaoriqi(Date jubaoriqi) {
		this.jubaoriqi = jubaoriqi;
	}
	
	/**
	 * 获取：举报日期
	 */
	public Date getJubaoriqi() {
		return jubaoriqi;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
