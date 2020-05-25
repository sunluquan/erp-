package com.slq.mapper.production;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.slq.common.Params;
import com.slq.pojo.production.ProductionPlan;
@Mapper
public interface ProductionPlanMapper extends BaseMapper<ProductionPlan>{

	List<ProductionPlan> searchProductionPlan(Params params);

	ProductionPlan getProductionPlanAndDetailById(Integer id);
<<<<<<< HEAD
	//获取满足制定派工单的生产计划
	List<ProductionPlan> getMeetDespatchingProductionPlans();
=======
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d

}
