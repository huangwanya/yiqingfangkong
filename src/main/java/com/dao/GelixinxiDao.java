package com.dao;

import com.entity.GelixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GelixinxiVO;
import com.entity.view.GelixinxiView;


/**
 * 隔离信息
 * 
 * @author 
 * @email 
 * @date 2022-04-11 10:17:46
 */
public interface GelixinxiDao extends BaseMapper<GelixinxiEntity> {
	
	List<GelixinxiVO> selectListVO(@Param("ew") Wrapper<GelixinxiEntity> wrapper);
	
	GelixinxiVO selectVO(@Param("ew") Wrapper<GelixinxiEntity> wrapper);
	
	List<GelixinxiView> selectListView(@Param("ew") Wrapper<GelixinxiEntity> wrapper);

	List<GelixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GelixinxiEntity> wrapper);
	
	GelixinxiView selectView(@Param("ew") Wrapper<GelixinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<GelixinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GelixinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GelixinxiEntity> wrapper);
}
