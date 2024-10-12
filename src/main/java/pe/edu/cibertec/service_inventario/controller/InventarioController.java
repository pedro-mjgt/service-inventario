package pe.edu.cibertec.service_inventario.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.service_inventario.remoteservice.ServiceVentaClient;

@RequiredArgsConstructor
@RestController
public class InventarioController {

    private final ServiceVentaClient serviceVentaClient;

    @GetMapping("/inventario")
    public String listarProdutos() {
        return "Lista de todos los productos";
    }

    @GetMapping("/inventariostock")
    public String listarProductosConStock() {
        return "Lista productos con stock";
    }

    @GetMapping("/inventario-venta")
    public String listarProductosVentas() {
        return serviceVentaClient.obtenerVentas();
    }

}
