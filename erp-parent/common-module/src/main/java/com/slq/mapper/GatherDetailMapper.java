package com.slq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.slq.pojo.warehouse.GatherDetails;

import feign.Param;
@Mapper
public interface GatherDetailMapper extends BaseMapper<GatherDetails>{

<<<<<<< HEAD
	int batchInsertFinishedGatherDetail(@Param("id")Integer id, @Param("list") List<GatherDetails> gatherDetailsList);
=======
	int batchInsertFinishedGatherDetail(@Param("id")String id, @Param("list") List<GatherDetails> gatherDetailsList);
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d

}
