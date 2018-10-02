package com.discaATLAS.Blank.discaATLAS.RollingMain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "items")
public class ProductBrand {

	@Id
	private String id;
	@Indexed(direction = IndexDirection.ASCENDING)
	private String name;
	@Indexed(direction = IndexDirection.ASCENDING)
	private String units;
	@Indexed(direction = IndexDirection.ASCENDING)
	private double price;

	public ProductBrand(String id, String name, String units, double price) {
		super();
		this.id = id;
		this.name = name;
		this.units = units;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
