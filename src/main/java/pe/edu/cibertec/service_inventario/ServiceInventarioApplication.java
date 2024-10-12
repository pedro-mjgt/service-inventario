package pe.edu.cibertec.service_inventario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ServiceInventarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceInventarioApplication.class, args);
	}

}
