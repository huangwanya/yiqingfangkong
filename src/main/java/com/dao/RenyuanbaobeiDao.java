package com.dao;

import com.entity.RenyuanbaobeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenyuanbaobeiVO;
import com.entity.view.RenyuanbaobeiView;


/**
 * 人员报备
 * 
 * @author 
 * @email 
 * @date 2022-04-11 10:17:46
 */
public interface RenyuanbaobeiDao extends BaseMapper<RenyuanbaobeiEntity> {
	
	List<RenyuanbaobeiVO> selectListVO(@Param("ew") Wrapper<RenyuanbaobeiEntity> wrapper);
	
	RenyuanbaobeiVO selectVO(@Param("ew") Wrapper<RenyuanbaobeiEntity> wrapper);
	
	List<RenyuanbaobeiView> selectListView(@Param("ew") Wrapper<RenyuanbaobeiEntity> wrapper);

	List<RenyuanbaobeiView> selectListView(Pagination page,@Param("ew") Wrapper<RenyuanbaobeiEntity> wrapper);
	
	RenyuanbaobeiView selectView(@Param("ew") Wrapper<RenyuanbaobeiEntity> wrapper);
	

}
