package com.entity.model;

import com.entity.FangyixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 防疫信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-11 10:17:46
 */
public class FangyixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 信息封面
	 */
	
	private String xinxifengmian;
		
	/**
	 * 疫情地址
	 */
	
	private String yiqingdizhi;
		
	/**
	 * 活动踪迹
	 */
	
	private String huodongzongji;
		
	/**
	 * 信息内容
	 */
	
	private String xinxineirong;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
	/**
	 * 设置：信息封面
	 */
	 
	public void setXinxifengmian(String xinxifengmian) {
		this.xinxifengmian = xinxifengmian;
	}
	
	/**
	 * 获取：信息封面
	 */
	public String getXinxifengmian() {
		return xinxifengmian;
	}
				
	
	/**
	 * 设置：疫情地址
	 */
	 
	public void setYiqingdizhi(String yiqingdizhi) {
		this.yiqingdizhi = yiqingdizhi;
	}
	
	/**
	 * 获取：疫情地址
	 */
	public String getYiqingdizhi() {
		return yiqingdizhi;
	}
				
	
	/**
	 * 设置：活动踪迹
	 */
	 
	public void setHuodongzongji(String huodongzongji) {
		this.huodongzongji = huodongzongji;
	}
	
	/**
	 * 获取：活动踪迹
	 */
	public String getHuodongzongji() {
		return huodongzongji;
	}
				
	
	/**
	 * 设置：信息内容
	 */
	 
	public void setXinxineirong(String xinxineirong) {
		this.xinxineirong = xinxineirong;
	}
	
	/**
	 * 获取：信息内容
	 */
	public String getXinxineirong() {
		return xinxineirong;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
			
}
