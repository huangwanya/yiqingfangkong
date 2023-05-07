package com.dao;

import com.entity.ShenqingchuruEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenqingchuruVO;
import com.entity.view.ShenqingchuruView;


/**
 * 申请出入
 * 
 * @author 
 * @email 
 * @date 2022-04-11 10:17:46
 */
public interface ShenqingchuruDao extends BaseMapper<ShenqingchuruEntity> {
	
	List<ShenqingchuruVO> selectListVO(@Param("ew") Wrapper<ShenqingchuruEntity> wrapper);
	
	ShenqingchuruVO selectVO(@Param("ew") Wrapper<ShenqingchuruEntity> wrapper);
	
	List<ShenqingchuruView> selectListView(@Param("ew") Wrapper<ShenqingchuruEntity> wrapper);

	List<ShenqingchuruView> selectListView(Pagination page,@Param("ew") Wrapper<ShenqingchuruEntity> wrapper);
	
	ShenqingchuruView selectView(@Param("ew") Wrapper<ShenqingchuruEntity> wrapper);
	

}
