package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangyixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangyixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangyixinxiView;


/**
 * 防疫信息
 *
 * @author 
 * @email 
 * @date 2022-04-11 10:17:46
 */
public interface FangyixinxiService extends IService<FangyixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangyixinxiVO> selectListVO(Wrapper<FangyixinxiEntity> wrapper);
   	
   	FangyixinxiVO selectVO(@Param("ew") Wrapper<FangyixinxiEntity> wrapper);
   	
   	List<FangyixinxiView> selectListView(Wrapper<FangyixinxiEntity> wrapper);
   	
   	FangyixinxiView selectView(@Param("ew") Wrapper<FangyixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangyixinxiEntity> wrapper);
   	

}

