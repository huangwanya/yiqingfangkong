package com.dao;

import com.entity.FengkongxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FengkongxinxiVO;
import com.entity.view.FengkongxinxiView;


/**
 * 封控信息
 * 
 * @author 
 * @email 
 * @date 2022-04-11 10:17:46
 */
public interface FengkongxinxiDao extends BaseMapper<FengkongxinxiEntity> {
	
	List<FengkongxinxiVO> selectListVO(@Param("ew") Wrapper<FengkongxinxiEntity> wrapper);
	
	FengkongxinxiVO selectVO(@Param("ew") Wrapper<FengkongxinxiEntity> wrapper);
	
	List<FengkongxinxiView> selectListView(@Param("ew") Wrapper<FengkongxinxiEntity> wrapper);

	List<FengkongxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<FengkongxinxiEntity> wrapper);
	
	FengkongxinxiView selectView(@Param("ew") Wrapper<FengkongxinxiEntity> wrapper);
	

}
