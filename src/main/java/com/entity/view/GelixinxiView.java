package com.entity.view;

import com.entity.GelixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 隔离信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-11 10:17:46
 */
@TableName("gelixinxi")
public class GelixinxiView  extends GelixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GelixinxiView(){
	}
 
 	public GelixinxiView(GelixinxiEntity gelixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, gelixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
