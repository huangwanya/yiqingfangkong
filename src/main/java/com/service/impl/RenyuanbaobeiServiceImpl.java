package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.RenyuanbaobeiDao;
import com.entity.RenyuanbaobeiEntity;
import com.service.RenyuanbaobeiService;
import com.entity.vo.RenyuanbaobeiVO;
import com.entity.view.RenyuanbaobeiView;

@Service("renyuanbaobeiService")
public class RenyuanbaobeiServiceImpl extends ServiceImpl<RenyuanbaobeiDao, RenyuanbaobeiEntity> implements RenyuanbaobeiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenyuanbaobeiEntity> page = this.selectPage(
                new Query<RenyuanbaobeiEntity>(params).getPage(),
                new EntityWrapper<RenyuanbaobeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenyuanbaobeiEntity> wrapper) {
		  Page<RenyuanbaobeiView> page =new Query<RenyuanbaobeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenyuanbaobeiVO> selectListVO(Wrapper<RenyuanbaobeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenyuanbaobeiVO selectVO(Wrapper<RenyuanbaobeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenyuanbaobeiView> selectListView(Wrapper<RenyuanbaobeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenyuanbaobeiView selectView(Wrapper<RenyuanbaobeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
