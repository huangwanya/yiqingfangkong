package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenqingchuruEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenqingchuruVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenqingchuruView;


/**
 * 申请出入
 *
 * @author 
 * @email 
 * @date 2022-04-11 10:17:46
 */
public interface ShenqingchuruService extends IService<ShenqingchuruEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenqingchuruVO> selectListVO(Wrapper<ShenqingchuruEntity> wrapper);
   	
   	ShenqingchuruVO selectVO(@Param("ew") Wrapper<ShenqingchuruEntity> wrapper);
   	
   	List<ShenqingchuruView> selectListView(Wrapper<ShenqingchuruEntity> wrapper);
   	
   	ShenqingchuruView selectView(@Param("ew") Wrapper<ShenqingchuruEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenqingchuruEntity> wrapper);
   	

}

