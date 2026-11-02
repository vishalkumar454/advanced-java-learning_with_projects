package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

//	@Value("101")
	private int id;
//	@Value("aman")
	private String name;
//	@Autowired
	private Mobile mobile;

	public Person(@Value("101")int id, @Value("aman")String name,@Autowired Mobile mobile) {
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

//	@Value("101")
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

//	@Value("aman")
	public void setName(String name) {
		this.name = name;
	}

	public Mobile getMobile() {
		return mobile;
	}

//	@Autowired
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mob=" + mobile + "]";
	}

}
