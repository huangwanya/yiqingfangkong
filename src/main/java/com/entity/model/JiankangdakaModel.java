package com.entity.model;

import com.entity.JiankangdakaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 健康打卡
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-11 10:17:46
 */
public class JiankangdakaModel  implements Serializable {
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
	 * 手机号码
	 */
	
	private String shoujihaoma;
		
	/**
	 * 家庭住址
	 */
	
	private String jiatingzhuzhi;
		
	/**
	 * 体温
	 */
	
	private Integer tiwen;
		
	/**
	 * 行程轨迹
	 */
	
	private String xingchengguiji;
		
	/**
	 * 健康码
	 */
	
	private String jiankangma;
		
	/**
	 * 打卡备注
	 */
	
	private String dakabeizhu;
		
	/**
	 * 打卡时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dakashijian;
				
	
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
	 * 设置：手机号码
	 */
	 
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
				
	
	/**
	 * 设置：家庭住址
	 */
	 
	public void setJiatingzhuzhi(String jiatingzhuzhi) {
		this.jiatingzhuzhi = jiatingzhuzhi;
	}
	
	/**
	 * 获取：家庭住址
	 */
	public String getJiatingzhuzhi() {
		return jiatingzhuzhi;
	}
				
	
	/**
	 * 设置：体温
	 */
	 
	public void setTiwen(Integer tiwen) {
		this.tiwen = tiwen;
	}
	
	/**
	 * 获取：体温
	 */
	public Integer getTiwen() {
		return tiwen;
	}
				
	
	/**
	 * 设置：行程轨迹
	 */
	 
	public void setXingchengguiji(String xingchengguiji) {
		this.xingchengguiji = xingchengguiji;
	}
	
	/**
	 * 获取：行程轨迹
	 */
	public String getXingchengguiji() {
		return xingchengguiji;
	}
				
	
	/**
	 * 设置：健康码
	 */
	 
	public void setJiankangma(String jiankangma) {
		this.jiankangma = jiankangma;
	}
	
	/**
	 * 获取：健康码
	 */
	public String getJiankangma() {
		return jiankangma;
	}
				
	
	/**
	 * 设置：打卡备注
	 */
	 
	public void setDakabeizhu(String dakabeizhu) {
		this.dakabeizhu = dakabeizhu;
	}
	
	/**
	 * 获取：打卡备注
	 */
	public String getDakabeizhu() {
		return dakabeizhu;
	}
				
	
	/**
	 * 设置：打卡时间
	 */
	 
	public void setDakashijian(Date dakashijian) {
		this.dakashijian = dakashijian;
	}
	
	/**
	 * 获取：打卡时间
	 */
	public Date getDakashijian() {
		return dakashijian;
	}
			
}
