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
 * 野菜科普
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-24 09:15:24
 */
@TableName("yecaikepu")
public class YecaikepuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YecaikepuEntity() {
		
	}
	
	public YecaikepuEntity(T t) {
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
	 * 植物名称
	 */
					
	private String zhiwumingcheng;
	
	/**
	 * 野菜分类
	 */
					
	private String yecaifenlei;
	
	/**
	 * 科
	 */
					
	private String ke;
	
	/**
	 * 属
	 */
					
	private String shu;
	
	/**
	 * 种
	 */
					
	private String zhong;
	
	/**
	 * 毒性
	 */
					
	private String duxing;
	
	/**
	 * 形态特征
	 */
					
	private String xingtaitezheng;
	
	/**
	 * 生长环境
	 */
					
	private String shengzhanghuanjing;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 视频
	 */
					
	private String shipin;
	
	/**
	 * 分布范围
	 */
					
	private String fenbufanwei;
	
	/**
	 * 详细介绍
	 */
					
	private String xiangxijieshao;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
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
	 * 设置：植物名称
	 */
	public void setZhiwumingcheng(String zhiwumingcheng) {
		this.zhiwumingcheng = zhiwumingcheng;
	}
	/**
	 * 获取：植物名称
	 */
	public String getZhiwumingcheng() {
		return zhiwumingcheng;
	}
	/**
	 * 设置：野菜分类
	 */
	public void setYecaifenlei(String yecaifenlei) {
		this.yecaifenlei = yecaifenlei;
	}
	/**
	 * 获取：野菜分类
	 */
	public String getYecaifenlei() {
		return yecaifenlei;
	}
	/**
	 * 设置：科
	 */
	public void setKe(String ke) {
		this.ke = ke;
	}
	/**
	 * 获取：科
	 */
	public String getKe() {
		return ke;
	}
	/**
	 * 设置：属
	 */
	public void setShu(String shu) {
		this.shu = shu;
	}
	/**
	 * 获取：属
	 */
	public String getShu() {
		return shu;
	}
	/**
	 * 设置：种
	 */
	public void setZhong(String zhong) {
		this.zhong = zhong;
	}
	/**
	 * 获取：种
	 */
	public String getZhong() {
		return zhong;
	}
	/**
	 * 设置：毒性
	 */
	public void setDuxing(String duxing) {
		this.duxing = duxing;
	}
	/**
	 * 获取：毒性
	 */
	public String getDuxing() {
		return duxing;
	}
	/**
	 * 设置：形态特征
	 */
	public void setXingtaitezheng(String xingtaitezheng) {
		this.xingtaitezheng = xingtaitezheng;
	}
	/**
	 * 获取：形态特征
	 */
	public String getXingtaitezheng() {
		return xingtaitezheng;
	}
	/**
	 * 设置：生长环境
	 */
	public void setShengzhanghuanjing(String shengzhanghuanjing) {
		this.shengzhanghuanjing = shengzhanghuanjing;
	}
	/**
	 * 获取：生长环境
	 */
	public String getShengzhanghuanjing() {
		return shengzhanghuanjing;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：视频
	 */
	public void setShipin(String shipin) {
		this.shipin = shipin;
	}
	/**
	 * 获取：视频
	 */
	public String getShipin() {
		return shipin;
	}
	/**
	 * 设置：分布范围
	 */
	public void setFenbufanwei(String fenbufanwei) {
		this.fenbufanwei = fenbufanwei;
	}
	/**
	 * 获取：分布范围
	 */
	public String getFenbufanwei() {
		return fenbufanwei;
	}
	/**
	 * 设置：详细介绍
	 */
	public void setXiangxijieshao(String xiangxijieshao) {
		this.xiangxijieshao = xiangxijieshao;
	}
	/**
	 * 获取：详细介绍
	 */
	public String getXiangxijieshao() {
		return xiangxijieshao;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
