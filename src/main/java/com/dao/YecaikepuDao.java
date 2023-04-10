package com.dao;

import com.entity.YecaikepuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YecaikepuVO;
import com.entity.view.YecaikepuView;


/**
 * 野菜科普
 * 
 * @author 
 * @email 
 * @date 2023-02-24 09:15:24
 */
public interface YecaikepuDao extends BaseMapper<YecaikepuEntity> {
	
	List<YecaikepuVO> selectListVO(@Param("ew") Wrapper<YecaikepuEntity> wrapper);
	
	YecaikepuVO selectVO(@Param("ew") Wrapper<YecaikepuEntity> wrapper);
	
	List<YecaikepuView> selectListView(@Param("ew") Wrapper<YecaikepuEntity> wrapper);

	List<YecaikepuView> selectListView(Pagination page,@Param("ew") Wrapper<YecaikepuEntity> wrapper);
	
	YecaikepuView selectView(@Param("ew") Wrapper<YecaikepuEntity> wrapper);
	

}
