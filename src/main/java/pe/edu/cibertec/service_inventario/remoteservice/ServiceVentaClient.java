package pe.edu.cibertec.service_inventario.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-ventas")
public interface ServiceVentaClient {

    @GetMapping("/venta")
    String obtenerVentas();

}
