package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GelixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GelixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GelixinxiView;


/**
 * 隔离信息
 *
 * @author 
 * @email 
 * @date 2022-04-11 10:17:46
 */
public interface GelixinxiService extends IService<GelixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GelixinxiVO> selectListVO(Wrapper<GelixinxiEntity> wrapper);
   	
   	GelixinxiVO selectVO(@Param("ew") Wrapper<GelixinxiEntity> wrapper);
   	
   	List<GelixinxiView> selectListView(Wrapper<GelixinxiEntity> wrapper);
   	
   	GelixinxiView selectView(@Param("ew") Wrapper<GelixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GelixinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<GelixinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<GelixinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<GelixinxiEntity> wrapper);
}

