package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

//	@Value("201")
	private int id;
//	@Value("VIVO")
	private String brand;
//	@Value("20000")
	private double price;
	
	// don't use no-argument constructor because the spring IOC container give first priority to no-argument constructor
	// so if use given no-argument constuctor the value will not get initialize

	public Mobile(@Value("201")int id, @Value("VIVO") String brand, @Value("20000") double price) {
		this.id = id;
		this.brand = brand;
		this.price = price;
	}

	public int getId() {
		return id;
	}

//	@Value("201")
	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

//	@Value("VIVO")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

//	@Value("20000")
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", price=" + price + "]";
	}

}
