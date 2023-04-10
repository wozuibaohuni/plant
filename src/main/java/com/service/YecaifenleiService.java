package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YecaifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YecaifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YecaifenleiView;


/**
 * 野菜分类
 *
 * @author 
 * @email 
 * @date 2023-02-24 09:15:24
 */
public interface YecaifenleiService extends IService<YecaifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YecaifenleiVO> selectListVO(Wrapper<YecaifenleiEntity> wrapper);
   	
   	YecaifenleiVO selectVO(@Param("ew") Wrapper<YecaifenleiEntity> wrapper);
   	
   	List<YecaifenleiView> selectListView(Wrapper<YecaifenleiEntity> wrapper);
   	
   	YecaifenleiView selectView(@Param("ew") Wrapper<YecaifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YecaifenleiEntity> wrapper);
   	

}

