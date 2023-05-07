package com.entity.vo;

import com.entity.WuzixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 物资信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-11 10:17:46
 */
public class WuzixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 物资封面
	 */
	
	private String wuzifengmian;
		
	/**
	 * 物资分类
	 */
	
	private String wuzifenlei;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 储存位置
	 */
	
	private String chucunweizhi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 物资简介
	 */
	
	private String wuzijianjie;
				
	
	/**
	 * 设置：物资封面
	 */
	 
	public void setWuzifengmian(String wuzifengmian) {
		this.wuzifengmian = wuzifengmian;
	}
	
	/**
	 * 获取：物资封面
	 */
	public String getWuzifengmian() {
		return wuzifengmian;
	}
				
	
	/**
	 * 设置：物资分类
	 */
	 
	public void setWuzifenlei(String wuzifenlei) {
		this.wuzifenlei = wuzifenlei;
	}
	
	/**
	 * 获取：物资分类
	 */
	public String getWuzifenlei() {
		return wuzifenlei;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：储存位置
	 */
	 
	public void setChucunweizhi(String chucunweizhi) {
		this.chucunweizhi = chucunweizhi;
	}
	
	/**
	 * 获取：储存位置
	 */
	public String getChucunweizhi() {
		return chucunweizhi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：物资简介
	 */
	 
	public void setWuzijianjie(String wuzijianjie) {
		this.wuzijianjie = wuzijianjie;
	}
	
	/**
	 * 获取：物资简介
	 */
	public String getWuzijianjie() {
		return wuzijianjie;
	}
			
}
