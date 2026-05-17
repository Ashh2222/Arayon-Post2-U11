package com.universidad.pedidosservice.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreditoServiceTest {

    private final CreditoService service =
            new CreditoService();

    @Test
    void aprobarCredito_clienteNulo_debeRechazar() {

        assertEquals(
                "RECHAZADO",
                service.aprobarCredito(
                        null,
                        1000
                )
        );
    }
}