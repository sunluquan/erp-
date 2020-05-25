package com.slq.service.impl.warehouse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slq.mapper.warehouse.StockMapper;
<<<<<<< HEAD
=======
import com.slq.pojo.warehouse.GatherDetails;
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
import com.slq.pojo.warehouse.Stock;
import com.slq.service.warehouse.IStockService;

@Service
public class StockServiceImpl implements IStockService {

	@Autowired
	StockMapper stockMapper;
	
	@Override
	public List<Stock> getStocks() {
		return stockMapper.getStocks();
	}

	@Override
	public Stock getStockById(String stockId) {
		return stockMapper.getStockById(stockId);
	}

<<<<<<< HEAD
	@Override
	public int addStock(Stock stock) {
		return stockMapper.addStock(stock);
	}

=======
	

	@Override
	public int addStock(Stock stock) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateStock(List<GatherDetails> gatherDetailsList) {
		// TODO Auto-generated method stub
		return 0;
	}



>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
}
