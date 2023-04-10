package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YecaikepuDao;
import com.entity.YecaikepuEntity;
import com.service.YecaikepuService;
import com.entity.vo.YecaikepuVO;
import com.entity.view.YecaikepuView;

@Service("yecaikepuService")
public class YecaikepuServiceImpl extends ServiceImpl<YecaikepuDao, YecaikepuEntity> implements YecaikepuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YecaikepuEntity> page = this.selectPage(
                new Query<YecaikepuEntity>(params).getPage(),
                new EntityWrapper<YecaikepuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YecaikepuEntity> wrapper) {
		  Page<YecaikepuView> page =new Query<YecaikepuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YecaikepuVO> selectListVO(Wrapper<YecaikepuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YecaikepuVO selectVO(Wrapper<YecaikepuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YecaikepuView> selectListView(Wrapper<YecaikepuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YecaikepuView selectView(Wrapper<YecaikepuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
