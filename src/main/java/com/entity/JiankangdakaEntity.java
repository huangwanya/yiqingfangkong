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
 * 健康打卡
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-11 10:17:46
 */
@TableName("jiankangdaka")
public class JiankangdakaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiankangdakaEntity() {
		
	}
	
	public JiankangdakaEntity(T t) {
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
	 * 打卡编号
	 */
					
	private String dakabianhao;
	
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
	 * 设置：打卡编号
	 */
	public void setDakabianhao(String dakabianhao) {
		this.dakabianhao = dakabianhao;
	}
	/**
	 * 获取：打卡编号
	 */
	public String getDakabianhao() {
		return dakabianhao;
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
