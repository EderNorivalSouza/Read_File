package entities;

public class Product {
	
	private String name;
	private Double value;
	private Integer quantity;
	
	public Product(String product, Double value, Integer quantity) {
		this.name = product;
		this.value = value;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String product) {
		this.name = product;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double total() {
		return value*quantity;
	}
	

}
