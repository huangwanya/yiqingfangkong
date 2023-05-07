package com.entity.model;

import com.entity.YimiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 疫苗信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-11 10:17:46
 */
public class YimiaoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 生产商
	 */
	
	private String shengchanshang;
		
	/**
	 * 疫苗简介
	 */
	
	private String yimiaojianjie;
				
	
	/**
	 * 设置：生产商
	 */
	 
	public void setShengchanshang(String shengchanshang) {
		this.shengchanshang = shengchanshang;
	}
	
	/**
	 * 获取：生产商
	 */
	public String getShengchanshang() {
		return shengchanshang;
	}
				
	
	/**
	 * 设置：疫苗简介
	 */
	 
	public void setYimiaojianjie(String yimiaojianjie) {
		this.yimiaojianjie = yimiaojianjie;
	}
	
	/**
	 * 获取：疫苗简介
	 */
	public String getYimiaojianjie() {
		return yimiaojianjie;
	}
			
}
