package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YecaikepuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YecaikepuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YecaikepuView;


/**
 * 野菜科普
 *
 * @author 
 * @email 
 * @date 2023-02-24 09:15:24
 */
public interface YecaikepuService extends IService<YecaikepuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YecaikepuVO> selectListVO(Wrapper<YecaikepuEntity> wrapper);
   	
   	YecaikepuVO selectVO(@Param("ew") Wrapper<YecaikepuEntity> wrapper);
   	
   	List<YecaikepuView> selectListView(Wrapper<YecaikepuEntity> wrapper);
   	
   	YecaikepuView selectView(@Param("ew") Wrapper<YecaikepuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YecaikepuEntity> wrapper);
   	

}

