package com.universidad.pedidosservice.service.strategy;

import com.universidad.pedidosservice.domain.Pedido;

public interface EstrategiaEnvio {

    double calcularCosto(Pedido pedido);
}