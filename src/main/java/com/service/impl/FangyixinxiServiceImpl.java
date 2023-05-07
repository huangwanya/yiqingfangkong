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


import com.dao.FangyixinxiDao;
import com.entity.FangyixinxiEntity;
import com.service.FangyixinxiService;
import com.entity.vo.FangyixinxiVO;
import com.entity.view.FangyixinxiView;

@Service("fangyixinxiService")
public class FangyixinxiServiceImpl extends ServiceImpl<FangyixinxiDao, FangyixinxiEntity> implements FangyixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangyixinxiEntity> page = this.selectPage(
                new Query<FangyixinxiEntity>(params).getPage(),
                new EntityWrapper<FangyixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangyixinxiEntity> wrapper) {
		  Page<FangyixinxiView> page =new Query<FangyixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangyixinxiVO> selectListVO(Wrapper<FangyixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangyixinxiVO selectVO(Wrapper<FangyixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangyixinxiView> selectListView(Wrapper<FangyixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangyixinxiView selectView(Wrapper<FangyixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
