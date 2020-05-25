package com.slq.service.impl;

import java.util.List;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.slq.mapper.GatherDetailMapper;
import com.slq.pojo.warehouse.GatherDetails;
import com.slq.service.IGatherDetailService;

@Service
@Transactional
@CacheConfig(cacheNames = "myCache")
public class GatherDetailServiceImpl extends ServiceImpl<GatherDetailMapper,GatherDetails>  implements IGatherDetailService{

	//新增生产成品详细
	@CacheEvict(allEntries = true)
	@Transactional
	@Override
<<<<<<< HEAD
	public int batchInsertFinishedGatherDetail(Integer id, List<GatherDetails> gatherDetailsList) {
=======
	public int batchInsertFinishedGatherDetail(String id, List<GatherDetails> gatherDetailsList) {
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
		if(!gatherDetailsList.isEmpty()&&gatherDetailsList.size()==1) {
			GatherDetails gatherDetails = gatherDetailsList.get(0);
			gatherDetails.setParentId(id);
			return this.baseMapper.insert(gatherDetails);
		}else {
			return this.baseMapper.batchInsertFinishedGatherDetail(id,gatherDetailsList);
		}
	}

<<<<<<< HEAD
=======

>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
	

}
