package com.universidad.pedidosservice.service.strategy;

import com.universidad.pedidosservice.domain.Pedido;
import org.springframework.stereotype.Component;

@Component("ESTANDAR")
public class EnvioEstandar
        implements EstrategiaEnvio {

    @Override
    public double calcularCosto(
            Pedido pedido
    ) {

        return pedido.getTotal() > 50
                ? 0.0
                : 5.99;
    }
}