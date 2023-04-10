package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyecaikepuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyecaikepuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyecaikepuView;


/**
 * 野菜科普评论表
 *
 * @author 
 * @email 
 * @date 2023-02-24 09:15:25
 */
public interface DiscussyecaikepuService extends IService<DiscussyecaikepuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyecaikepuVO> selectListVO(Wrapper<DiscussyecaikepuEntity> wrapper);
   	
   	DiscussyecaikepuVO selectVO(@Param("ew") Wrapper<DiscussyecaikepuEntity> wrapper);
   	
   	List<DiscussyecaikepuView> selectListView(Wrapper<DiscussyecaikepuEntity> wrapper);
   	
   	DiscussyecaikepuView selectView(@Param("ew") Wrapper<DiscussyecaikepuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyecaikepuEntity> wrapper);
   	

}

