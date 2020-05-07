package provamaven.prova;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("home")
public class HomeController {

	@GetMapping("products")
	public String[] getProducts() {
		String[] products = new String[10];
		
		products[1] = "Phone";
		products[2] = "Car";
		return products;
	}
}
