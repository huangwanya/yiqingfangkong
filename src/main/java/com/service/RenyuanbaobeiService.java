package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenyuanbaobeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenyuanbaobeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenyuanbaobeiView;


/**
 * 人员报备
 *
 * @author 
 * @email 
 * @date 2022-04-11 10:17:46
 */
public interface RenyuanbaobeiService extends IService<RenyuanbaobeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenyuanbaobeiVO> selectListVO(Wrapper<RenyuanbaobeiEntity> wrapper);
   	
   	RenyuanbaobeiVO selectVO(@Param("ew") Wrapper<RenyuanbaobeiEntity> wrapper);
   	
   	List<RenyuanbaobeiView> selectListView(Wrapper<RenyuanbaobeiEntity> wrapper);
   	
   	RenyuanbaobeiView selectView(@Param("ew") Wrapper<RenyuanbaobeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenyuanbaobeiEntity> wrapper);
   	

}

