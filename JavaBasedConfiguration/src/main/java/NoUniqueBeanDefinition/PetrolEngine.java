package NoUniqueBeanDefinition;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PetrolEngine implements Engine{

	public void run() {
		System.out.println("Running by pertrol");
		
	}

}
