package com.entity.view;

import com.entity.YecaifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 野菜分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-24 09:15:24
 */
@TableName("yecaifenlei")
public class YecaifenleiView  extends YecaifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YecaifenleiView(){
	}
 
 	public YecaifenleiView(YecaifenleiEntity yecaifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, yecaifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
