package com.dao;

import com.entity.FangyixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangyixinxiVO;
import com.entity.view.FangyixinxiView;


/**
 * 防疫信息
 * 
 * @author 
 * @email 
 * @date 2022-04-11 10:17:46
 */
public interface FangyixinxiDao extends BaseMapper<FangyixinxiEntity> {
	
	List<FangyixinxiVO> selectListVO(@Param("ew") Wrapper<FangyixinxiEntity> wrapper);
	
	FangyixinxiVO selectVO(@Param("ew") Wrapper<FangyixinxiEntity> wrapper);
	
	List<FangyixinxiView> selectListView(@Param("ew") Wrapper<FangyixinxiEntity> wrapper);

	List<FangyixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<FangyixinxiEntity> wrapper);
	
	FangyixinxiView selectView(@Param("ew") Wrapper<FangyixinxiEntity> wrapper);
	

}
