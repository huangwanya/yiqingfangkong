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


import com.dao.GanranxinxiDao;
import com.entity.GanranxinxiEntity;
import com.service.GanranxinxiService;
import com.entity.vo.GanranxinxiVO;
import com.entity.view.GanranxinxiView;

@Service("ganranxinxiService")
public class GanranxinxiServiceImpl extends ServiceImpl<GanranxinxiDao, GanranxinxiEntity> implements GanranxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GanranxinxiEntity> page = this.selectPage(
                new Query<GanranxinxiEntity>(params).getPage(),
                new EntityWrapper<GanranxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GanranxinxiEntity> wrapper) {
		  Page<GanranxinxiView> page =new Query<GanranxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GanranxinxiVO> selectListVO(Wrapper<GanranxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GanranxinxiVO selectVO(Wrapper<GanranxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GanranxinxiView> selectListView(Wrapper<GanranxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GanranxinxiView selectView(Wrapper<GanranxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<GanranxinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<GanranxinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<GanranxinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
