package com.slq.service.production.impl;

import java.util.List;

import org.springframework.cache.annotation.CacheConfig;
<<<<<<< HEAD
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
=======
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
<<<<<<< HEAD
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.slq.common.Params;
=======
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
import com.slq.mapper.production.ProductKindMapper;
import com.slq.pojo.production.ProductKind;
import com.slq.service.production.IProductKindService;

@Service
@Transactional
@CacheConfig(cacheNames = "productionModule")
public class ProductKindServiceImpl extends ServiceImpl<ProductKindMapper, ProductKind> implements IProductKindService{

	//这里需要使用redis缓存
	@Override
	public List<ProductKind> getKinds() {
		List<ProductKind> productKinds = this.baseMapper.getProductKindAll();
		return productKinds;
	}

<<<<<<< HEAD
	@Cacheable(keyGenerator = "keyGenerator")
	@Override
	public PageInfo<ProductKind> searchProductKind(Params params) {
		return PageHelper.startPage(params.getPageNum(),params.getPageSize())
					.doSelectPageInfo(()->this.baseMapper.searchProductKind(params));
	}
	@CacheEvict(allEntries = true)
	@Override
	public int insert(ProductKind productKind) {
		int i = this.baseMapper.insert(productKind);
		return i;
	}

=======
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
}
