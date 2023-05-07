package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 防疫信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-11 10:17:46
 */
@TableName("fangyixinxi")
public class FangyixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FangyixinxiEntity() {
		
	}
	
	public FangyixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 信息名称
	 */
					
	private String xinximingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：信息名称
	 */
	public void setXinximingcheng(String xinximingcheng) {
		this.xinximingcheng = xinximingcheng;
	}
	/**
	 * 获取：信息名称
	 */
	public String getXinximingcheng() {
		return xinximingcheng;
	}
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
