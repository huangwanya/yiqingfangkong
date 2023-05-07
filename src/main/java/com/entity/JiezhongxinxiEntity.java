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
 * 接种信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-11 10:17:46
 */
@TableName("jiezhongxinxi")
public class JiezhongxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiezhongxinxiEntity() {
		
	}
	
	public JiezhongxinxiEntity(T t) {
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
	 * 接种名称
	 */
					
	private String jiezhongmingcheng;
	
	/**
	 * 疫苗型号
	 */
					
	private String yimiaoxinghao;
	
	/**
	 * 接种次数
	 */
					
	private Integer jiezhongcishu;
	
	/**
	 * 接种时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date jiezhongshijian;
	
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
	 * 设置：接种名称
	 */
	public void setJiezhongmingcheng(String jiezhongmingcheng) {
		this.jiezhongmingcheng = jiezhongmingcheng;
	}
	/**
	 * 获取：接种名称
	 */
	public String getJiezhongmingcheng() {
		return jiezhongmingcheng;
	}
	/**
	 * 设置：疫苗型号
	 */
	public void setYimiaoxinghao(String yimiaoxinghao) {
		this.yimiaoxinghao = yimiaoxinghao;
	}
	/**
	 * 获取：疫苗型号
	 */
	public String getYimiaoxinghao() {
		return yimiaoxinghao;
	}
	/**
	 * 设置：接种次数
	 */
	public void setJiezhongcishu(Integer jiezhongcishu) {
		this.jiezhongcishu = jiezhongcishu;
	}
	/**
	 * 获取：接种次数
	 */
	public Integer getJiezhongcishu() {
		return jiezhongcishu;
	}
	/**
	 * 设置：接种时间
	 */
	public void setJiezhongshijian(Date jiezhongshijian) {
		this.jiezhongshijian = jiezhongshijian;
	}
	/**
	 * 获取：接种时间
	 */
	public Date getJiezhongshijian() {
		return jiezhongshijian;
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

}
