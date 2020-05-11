package com.br.welovedonuts.mock

import com.br.welovedonuts.entidade.Donut
import com.br.welovedonuts.entidade.Pedido
import com.br.welovedonuts.enums.EntregaEnum
import com.br.welovedonuts.enums.OrigemEnum
import com.br.welovedonuts.enums.SaborEnum
import com.br.welovedonuts.enums.TamanhoEnum
import java.util.*

class MockPedidos {

    fun montarPedido(): Pedido {
        val pedido = Pedido(
            data = Calendar.getInstance(),
            nomeCliente = "Daniel Ribeiro",
            origem = OrigemEnum.INSTA,
            tamanho = TamanhoEnum.MINI,
            entrega = EntregaEnum.SIM,
            observacao = "Rua José Tadeu Alves Paim, 276 Bairro Serrano"
        )

        pedido.donuts = montarDonuts();

        return pedido
    }

    fun montarDonuts(): List<Donut> {
        return listOf(
            Donut(
                sabor = SaborEnum.NOZES,
                quantidade = 2
            ),
            Donut(
                sabor = SaborEnum.SIMPSONS,
                quantidade = 2
            ),
            Donut(
                sabor = SaborEnum.NUTELLA,
                quantidade = 2
            ),
            Donut(
                sabor = SaborEnum.NESQUIK,
                quantidade = 2
            ),
            Donut(
                sabor = SaborEnum.CONFETES,
                quantidade = 1
            ),
            Donut(
                sabor = SaborEnum.BEIJINHO,
                quantidade = 2
            )
        );
    }
}