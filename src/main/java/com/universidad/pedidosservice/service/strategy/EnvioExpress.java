package com.universidad.pedidosservice.service.strategy;

import com.universidad.pedidosservice.domain.Pedido;
import org.springframework.stereotype.Component;

@Component("EXPRESS")
public class EnvioExpress
        implements EstrategiaEnvio {

    @Override
    public double calcularCosto(
            Pedido pedido
    ) {

        return 12.99;
    }
}