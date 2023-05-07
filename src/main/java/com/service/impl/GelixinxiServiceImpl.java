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


import com.dao.GelixinxiDao;
import com.entity.GelixinxiEntity;
import com.service.GelixinxiService;
import com.entity.vo.GelixinxiVO;
import com.entity.view.GelixinxiView;

@Service("gelixinxiService")
public class GelixinxiServiceImpl extends ServiceImpl<GelixinxiDao, GelixinxiEntity> implements GelixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GelixinxiEntity> page = this.selectPage(
                new Query<GelixinxiEntity>(params).getPage(),
                new EntityWrapper<GelixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GelixinxiEntity> wrapper) {
		  Page<GelixinxiView> page =new Query<GelixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GelixinxiVO> selectListVO(Wrapper<GelixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GelixinxiVO selectVO(Wrapper<GelixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GelixinxiView> selectListView(Wrapper<GelixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GelixinxiView selectView(Wrapper<GelixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<GelixinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<GelixinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<GelixinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
