package com.universidad.pedidosservice.service;

import com.universidad.pedidosservice.domain.Pedido;
import com.universidad.pedidosservice.service.strategy.EnvioEstandar;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnvioServiceTest {

    private final EnvioService service =
            new EnvioService(
                    Map.of(
                            "ESTANDAR",
                            new EnvioEstandar()
                    )
            );

    @Test
    void calcularEnvio_estandar_conTotalAlto_debeSerGratis() {

        Pedido p = new Pedido(
                1L,
                "Cliente",
                60.0
        );

        assertEquals(
                0.0,
                service.calcularEnvio(
                        p,
                        "ESTANDAR"
                ),
                0.001
        );
    }
}