package NoUniqueBeanDefinition;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine {

	public void run() {
		System.out.println("Running by Diesel");
	}

}
