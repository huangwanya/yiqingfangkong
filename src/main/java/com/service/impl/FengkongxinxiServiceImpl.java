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


import com.dao.FengkongxinxiDao;
import com.entity.FengkongxinxiEntity;
import com.service.FengkongxinxiService;
import com.entity.vo.FengkongxinxiVO;
import com.entity.view.FengkongxinxiView;

@Service("fengkongxinxiService")
public class FengkongxinxiServiceImpl extends ServiceImpl<FengkongxinxiDao, FengkongxinxiEntity> implements FengkongxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FengkongxinxiEntity> page = this.selectPage(
                new Query<FengkongxinxiEntity>(params).getPage(),
                new EntityWrapper<FengkongxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FengkongxinxiEntity> wrapper) {
		  Page<FengkongxinxiView> page =new Query<FengkongxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FengkongxinxiVO> selectListVO(Wrapper<FengkongxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FengkongxinxiVO selectVO(Wrapper<FengkongxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FengkongxinxiView> selectListView(Wrapper<FengkongxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FengkongxinxiView selectView(Wrapper<FengkongxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
