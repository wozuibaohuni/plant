package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YecaifenleiEntity;
import com.entity.view.YecaifenleiView;

import com.service.YecaifenleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 野菜分类
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-24 09:15:24
 */
@RestController
@RequestMapping("/yecaifenlei")
public class YecaifenleiController {
    @Autowired
    private YecaifenleiService yecaifenleiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YecaifenleiEntity yecaifenlei,
		HttpServletRequest request){
        EntityWrapper<YecaifenleiEntity> ew = new EntityWrapper<YecaifenleiEntity>();

		PageUtils page = yecaifenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yecaifenlei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YecaifenleiEntity yecaifenlei, 
		HttpServletRequest request){
        EntityWrapper<YecaifenleiEntity> ew = new EntityWrapper<YecaifenleiEntity>();

		PageUtils page = yecaifenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yecaifenlei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YecaifenleiEntity yecaifenlei){
       	EntityWrapper<YecaifenleiEntity> ew = new EntityWrapper<YecaifenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yecaifenlei, "yecaifenlei")); 
        return R.ok().put("data", yecaifenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YecaifenleiEntity yecaifenlei){
        EntityWrapper< YecaifenleiEntity> ew = new EntityWrapper< YecaifenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yecaifenlei, "yecaifenlei")); 
		YecaifenleiView yecaifenleiView =  yecaifenleiService.selectView(ew);
		return R.ok("查询野菜分类成功").put("data", yecaifenleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YecaifenleiEntity yecaifenlei = yecaifenleiService.selectById(id);
        return R.ok().put("data", yecaifenlei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YecaifenleiEntity yecaifenlei = yecaifenleiService.selectById(id);
        return R.ok().put("data", yecaifenlei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YecaifenleiEntity yecaifenlei, HttpServletRequest request){
    	yecaifenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yecaifenlei);
        yecaifenleiService.insert(yecaifenlei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YecaifenleiEntity yecaifenlei, HttpServletRequest request){
    	yecaifenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yecaifenlei);
        yecaifenleiService.insert(yecaifenlei);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YecaifenleiEntity yecaifenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yecaifenlei);
        yecaifenleiService.updateById(yecaifenlei);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yecaifenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YecaifenleiEntity> wrapper = new EntityWrapper<YecaifenleiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = yecaifenleiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
