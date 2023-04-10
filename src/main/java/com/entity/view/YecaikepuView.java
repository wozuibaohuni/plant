package com.entity.view;

import com.entity.YecaikepuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 野菜科普
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-24 09:15:24
 */
@TableName("yecaikepu")
public class YecaikepuView  extends YecaikepuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YecaikepuView(){
	}
 
 	public YecaikepuView(YecaikepuEntity yecaikepuEntity){
 	try {
			BeanUtils.copyProperties(this, yecaikepuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
