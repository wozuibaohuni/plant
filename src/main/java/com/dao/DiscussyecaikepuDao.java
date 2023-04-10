package com.dao;

import com.entity.DiscussyecaikepuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyecaikepuVO;
import com.entity.view.DiscussyecaikepuView;


/**
 * 野菜科普评论表
 * 
 * @author 
 * @email 
 * @date 2023-02-24 09:15:25
 */
public interface DiscussyecaikepuDao extends BaseMapper<DiscussyecaikepuEntity> {
	
	List<DiscussyecaikepuVO> selectListVO(@Param("ew") Wrapper<DiscussyecaikepuEntity> wrapper);
	
	DiscussyecaikepuVO selectVO(@Param("ew") Wrapper<DiscussyecaikepuEntity> wrapper);
	
	List<DiscussyecaikepuView> selectListView(@Param("ew") Wrapper<DiscussyecaikepuEntity> wrapper);

	List<DiscussyecaikepuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyecaikepuEntity> wrapper);
	
	DiscussyecaikepuView selectView(@Param("ew") Wrapper<DiscussyecaikepuEntity> wrapper);
	

}
