package com.dao;

import com.entity.YecaifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YecaifenleiVO;
import com.entity.view.YecaifenleiView;


/**
 * 野菜分类
 * 
 * @author 
 * @email 
 * @date 2023-02-24 09:15:24
 */
public interface YecaifenleiDao extends BaseMapper<YecaifenleiEntity> {
	
	List<YecaifenleiVO> selectListVO(@Param("ew") Wrapper<YecaifenleiEntity> wrapper);
	
	YecaifenleiVO selectVO(@Param("ew") Wrapper<YecaifenleiEntity> wrapper);
	
	List<YecaifenleiView> selectListView(@Param("ew") Wrapper<YecaifenleiEntity> wrapper);

	List<YecaifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<YecaifenleiEntity> wrapper);
	
	YecaifenleiView selectView(@Param("ew") Wrapper<YecaifenleiEntity> wrapper);
	

}
