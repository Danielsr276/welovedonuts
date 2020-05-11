package com.br.welovedonuts.entidade

import com.br.welovedonuts.enums.EmbalagemEnum
import com.br.welovedonuts.enums.EntregaEnum
import com.br.welovedonuts.enums.OrigemEnum
import com.br.welovedonuts.enums.TamanhoEnum
import java.math.BigDecimal
import java.util.*

class Pedido(
    var data: Calendar? = null,
    var nomeCliente: String? = null,
    var origem: OrigemEnum? = null,
    var tamanho: TamanhoEnum? = null,
    var entrega: EntregaEnum? = null,
    var observacao: String? = null, // para endereço e outras observações que surgirem
    var donuts: List<Donut>? = null,
    var embalagem: EmbalagemEnum? = null,
    var valor: BigDecimal? = null
)
