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


import com.dao.ShenqingchuruDao;
import com.entity.ShenqingchuruEntity;
import com.service.ShenqingchuruService;
import com.entity.vo.ShenqingchuruVO;
import com.entity.view.ShenqingchuruView;

@Service("shenqingchuruService")
public class ShenqingchuruServiceImpl extends ServiceImpl<ShenqingchuruDao, ShenqingchuruEntity> implements ShenqingchuruService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenqingchuruEntity> page = this.selectPage(
                new Query<ShenqingchuruEntity>(params).getPage(),
                new EntityWrapper<ShenqingchuruEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenqingchuruEntity> wrapper) {
		  Page<ShenqingchuruView> page =new Query<ShenqingchuruView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenqingchuruVO> selectListVO(Wrapper<ShenqingchuruEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenqingchuruVO selectVO(Wrapper<ShenqingchuruEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenqingchuruView> selectListView(Wrapper<ShenqingchuruEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenqingchuruView selectView(Wrapper<ShenqingchuruEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
