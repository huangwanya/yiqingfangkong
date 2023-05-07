package com.dao;

import com.entity.GanranxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GanranxinxiVO;
import com.entity.view.GanranxinxiView;


/**
 * 感染信息
 * 
 * @author 
 * @email 
 * @date 2022-04-11 10:17:46
 */
public interface GanranxinxiDao extends BaseMapper<GanranxinxiEntity> {
	
	List<GanranxinxiVO> selectListVO(@Param("ew") Wrapper<GanranxinxiEntity> wrapper);
	
	GanranxinxiVO selectVO(@Param("ew") Wrapper<GanranxinxiEntity> wrapper);
	
	List<GanranxinxiView> selectListView(@Param("ew") Wrapper<GanranxinxiEntity> wrapper);

	List<GanranxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GanranxinxiEntity> wrapper);
	
	GanranxinxiView selectView(@Param("ew") Wrapper<GanranxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<GanranxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GanranxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GanranxinxiEntity> wrapper);
}
