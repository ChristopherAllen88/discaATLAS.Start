package com.discaATLAS.Blank.discaATLAS.RollingMain;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;

public class DataSeedMongo implements CommandLineRunner {

	private ProductBrandRepository brandRepository;

	public DataSeedMongo(ProductBrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		ProductBrand branda = new ProductBrand(null, "Cheese", "1", 0);
		ProductBrand brandb = new ProductBrand(null, "Honey", "1", 0);
		ProductBrand brandc = new ProductBrand(null, "Pizza", "1", 0);
		ProductBrand brandd = new ProductBrand(null, "Milk", "1", 0);
		ProductBrand brande = new ProductBrand(null, "Water", "1", 0);
		ProductBrand brandf = new ProductBrand(null, "Potatos", "1", 0);
		
		
		this.brandRepository.deleteAll();

		List<ProductBrand> brand = Arrays.asList(branda, brandb, brandc, brandd, brande, brandf);
		this.brandRepository.saveAll(brand);
	}

}
