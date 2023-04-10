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


import com.dao.YecaifenleiDao;
import com.entity.YecaifenleiEntity;
import com.service.YecaifenleiService;
import com.entity.vo.YecaifenleiVO;
import com.entity.view.YecaifenleiView;

@Service("yecaifenleiService")
public class YecaifenleiServiceImpl extends ServiceImpl<YecaifenleiDao, YecaifenleiEntity> implements YecaifenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YecaifenleiEntity> page = this.selectPage(
                new Query<YecaifenleiEntity>(params).getPage(),
                new EntityWrapper<YecaifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YecaifenleiEntity> wrapper) {
		  Page<YecaifenleiView> page =new Query<YecaifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YecaifenleiVO> selectListVO(Wrapper<YecaifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YecaifenleiVO selectVO(Wrapper<YecaifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YecaifenleiView> selectListView(Wrapper<YecaifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YecaifenleiView selectView(Wrapper<YecaifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
