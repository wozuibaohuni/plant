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


import com.dao.DiscussyecaikepuDao;
import com.entity.DiscussyecaikepuEntity;
import com.service.DiscussyecaikepuService;
import com.entity.vo.DiscussyecaikepuVO;
import com.entity.view.DiscussyecaikepuView;

@Service("discussyecaikepuService")
public class DiscussyecaikepuServiceImpl extends ServiceImpl<DiscussyecaikepuDao, DiscussyecaikepuEntity> implements DiscussyecaikepuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyecaikepuEntity> page = this.selectPage(
                new Query<DiscussyecaikepuEntity>(params).getPage(),
                new EntityWrapper<DiscussyecaikepuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyecaikepuEntity> wrapper) {
		  Page<DiscussyecaikepuView> page =new Query<DiscussyecaikepuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyecaikepuVO> selectListVO(Wrapper<DiscussyecaikepuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyecaikepuVO selectVO(Wrapper<DiscussyecaikepuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyecaikepuView> selectListView(Wrapper<DiscussyecaikepuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyecaikepuView selectView(Wrapper<DiscussyecaikepuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
