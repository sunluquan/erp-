package com.slq.mapper.warehouse;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
<<<<<<< HEAD

=======
import org.apache.ibatis.annotations.Param;

import com.slq.pojo.warehouse.GatherDetails;
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
import com.slq.pojo.warehouse.Stock;

@Mapper
public interface StockMapper {

	List<Stock> getStocks();

	Stock getStockById(String stockId);
<<<<<<< HEAD

	int addStock(Stock stock);
=======
    
	int addStock(Stock stock);
	
	int updateStock(@Param("list") List<GatherDetails> gatherDetailsList);
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d

}
