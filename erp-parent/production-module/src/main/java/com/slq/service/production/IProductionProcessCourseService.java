package com.slq.service.production;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
import com.slq.pojo.production.ManufactureSum;
import com.slq.pojo.production.ProductionProcess;
import com.slq.pojo.production.ProductionProcessCourse;

public interface IProductionProcessCourseService {

	int register(ManufactureSum manufacture);

	ProductionProcessCourse getProductionProcessCourseByProcessIdAndmanufactureId(Integer manufacture_id,
			String process_id);

	ProductionProcessCourse getProductionProcessCourseByProcessIdAndmanufactureId(Integer manufacture_id,
			Integer production_process_id, String process_id);

	boolean checker(ManufactureSum manufacture);
//	ProductionProcessCourse getProductionProcessCourseByProcessIdAndmanufactureId(Integer manufacture_id,
//			Integer process_id);

<<<<<<< HEAD
	List<ProductionProcessCourse> productionProcessCoursebyManufactureIdAndProcessId(Integer manufacture_id,
			String process_id);

=======
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
}
