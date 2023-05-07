package com.entity.vo;

import com.entity.GonggaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 公告信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-11 10:17:45
 */
public class GonggaoxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 公告封面
	 */
	
	private String gonggaofengmian;
		
	/**
	 * 公告简介
	 */
	
	private String gonggaojianjie;
		
	/**
	 * 公告内容
	 */
	
	private String gonggaoneirong;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
	/**
	 * 设置：公告封面
	 */
	 
	public void setGonggaofengmian(String gonggaofengmian) {
		this.gonggaofengmian = gonggaofengmian;
	}
	
	/**
	 * 获取：公告封面
	 */
	public String getGonggaofengmian() {
		return gonggaofengmian;
	}
				
	
	/**
	 * 设置：公告简介
	 */
	 
	public void setGonggaojianjie(String gonggaojianjie) {
		this.gonggaojianjie = gonggaojianjie;
	}
	
	/**
	 * 获取：公告简介
	 */
	public String getGonggaojianjie() {
		return gonggaojianjie;
	}
				
	
	/**
	 * 设置：公告内容
	 */
	 
	public void setGonggaoneirong(String gonggaoneirong) {
		this.gonggaoneirong = gonggaoneirong;
	}
	
	/**
	 * 获取：公告内容
	 */
	public String getGonggaoneirong() {
		return gonggaoneirong;
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
