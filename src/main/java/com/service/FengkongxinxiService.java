package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FengkongxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FengkongxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FengkongxinxiView;


/**
 * 封控信息
 *
 * @author 
 * @email 
 * @date 2022-04-11 10:17:46
 */
public interface FengkongxinxiService extends IService<FengkongxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FengkongxinxiVO> selectListVO(Wrapper<FengkongxinxiEntity> wrapper);
   	
   	FengkongxinxiVO selectVO(@Param("ew") Wrapper<FengkongxinxiEntity> wrapper);
   	
   	List<FengkongxinxiView> selectListView(Wrapper<FengkongxinxiEntity> wrapper);
   	
   	FengkongxinxiView selectView(@Param("ew") Wrapper<FengkongxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FengkongxinxiEntity> wrapper);
   	

}

