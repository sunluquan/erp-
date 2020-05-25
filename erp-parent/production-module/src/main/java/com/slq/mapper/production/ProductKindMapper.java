package com.slq.mapper.production;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
<<<<<<< HEAD
import com.slq.common.Params;
=======
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
import com.slq.pojo.production.ProductKind;

@Mapper
public interface ProductKindMapper extends BaseMapper<ProductKind>{

	List<ProductKind> getProductKindAll();
	
	List<ProductKind> getKindChildren(Integer id);
<<<<<<< HEAD

	List<ProductKind> searchProductKind(Params params);

=======
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
}
