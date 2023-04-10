package com.entity.view;

import com.entity.DiscussyecaikepuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 野菜科普评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-24 09:15:25
 */
@TableName("discussyecaikepu")
public class DiscussyecaikepuView  extends DiscussyecaikepuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyecaikepuView(){
	}
 
 	public DiscussyecaikepuView(DiscussyecaikepuEntity discussyecaikepuEntity){
 	try {
			BeanUtils.copyProperties(this, discussyecaikepuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
