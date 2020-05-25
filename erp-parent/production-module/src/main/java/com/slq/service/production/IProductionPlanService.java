package com.slq.service.production;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.slq.common.Params;
import com.slq.pojo.production.ProductionPlan;

public interface IProductionPlanService {

	int insert(ProductionPlan productionPlan);

	PageInfo<ProductionPlan> searchProductionPlan(Params params);

	List<ProductionPlan> getCheckerProductionPlans();

	ProductionPlan getProductionPlanAndDetailById(Integer id);

	int pass(ProductionPlan productionPlan);

	int reject(ProductionPlan productionPlan);

	int update(ProductionPlan productionPlan);

<<<<<<< HEAD
	List<ProductionPlan> getMeetDespatchingProductionPlans();

=======
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d

}
