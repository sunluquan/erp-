package com.slq.mapper.production;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
<<<<<<< HEAD
import com.slq.pojo.production.ProductProfitLossDetail;
=======
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
import com.slq.pojo.production.ProductionProcess;
import com.slq.pojo.production.ProductionProcessMaterial;

@Mapper
public interface ProductionProcessMaterialMapper extends BaseMapper<ProductionProcessMaterial>{

	int batchInsert(List<ProductionProcess> productionProcessList);

	int batchUpdateRealAmount(@Param("production_process_id")Integer production_process_id, @Param("list")List<ProductionProcessMaterial> productionProcessMaterials);

	//List<ProductionProcessMaterial> getProductionProcessMaterialAndUseAmount(Integer process_id);

	List<ProductionProcessMaterial> getProductionProcessMaterialAndUseAmount
	(@Param("production_process_id")Integer production_process_id,
	@Param("production_process_course_id")Integer production_process_course_id);

	int batchUpdateRealAmount1(@Param("production_process_id")Integer production_process_id, @Param("list")List<ProductionProcessMaterial> productionProcessMaterials);

<<<<<<< HEAD
	int batchUpdateRenewAmount(@Param("production_process_id")Integer production_process_id,@Param("list") List<ProductProfitLossDetail> productProfitLossDetails);

	List<ProductionProcessMaterial> getProductionProcessMaterialByManufactureId(Integer id);

=======
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
}
