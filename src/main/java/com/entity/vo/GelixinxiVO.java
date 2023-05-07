package com.entity.vo;

import com.entity.GelixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 隔离信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-11 10:17:46
 */
public class GelixinxiVO  implements Serializable {
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
	 * 家庭住址
	 */
	
	private String jiatingzhuzhi;
		
	/**
	 * 隔离类型
	 */
	
	private String gelileixing;
		
	/**
	 * 隔离时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gelishijian;
		
	/**
	 * 隔离备注
	 */
	
	private String gelibeizhu;
				
	
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
	 * 设置：隔离类型
	 */
	 
	public void setGelileixing(String gelileixing) {
		this.gelileixing = gelileixing;
	}
	
	/**
	 * 获取：隔离类型
	 */
	public String getGelileixing() {
		return gelileixing;
	}
				
	
	/**
	 * 设置：隔离时间
	 */
	 
	public void setGelishijian(Date gelishijian) {
		this.gelishijian = gelishijian;
	}
	
	/**
	 * 获取：隔离时间
	 */
	public Date getGelishijian() {
		return gelishijian;
	}
				
	
	/**
	 * 设置：隔离备注
	 */
	 
	public void setGelibeizhu(String gelibeizhu) {
		this.gelibeizhu = gelibeizhu;
	}
	
	/**
	 * 获取：隔离备注
	 */
	public String getGelibeizhu() {
		return gelibeizhu;
	}
			
}
