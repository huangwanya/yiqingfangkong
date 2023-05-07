package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GanranxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GanranxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GanranxinxiView;


/**
 * 感染信息
 *
 * @author 
 * @email 
 * @date 2022-04-11 10:17:46
 */
public interface GanranxinxiService extends IService<GanranxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GanranxinxiVO> selectListVO(Wrapper<GanranxinxiEntity> wrapper);
   	
   	GanranxinxiVO selectVO(@Param("ew") Wrapper<GanranxinxiEntity> wrapper);
   	
   	List<GanranxinxiView> selectListView(Wrapper<GanranxinxiEntity> wrapper);
   	
   	GanranxinxiView selectView(@Param("ew") Wrapper<GanranxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GanranxinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<GanranxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<GanranxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<GanranxinxiEntity> wrapper);
}

