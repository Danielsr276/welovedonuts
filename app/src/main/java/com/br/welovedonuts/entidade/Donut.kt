package com.br.welovedonuts.entidade

import com.br.welovedonuts.enums.SaborEnum
import java.math.BigDecimal

class Donut(
    var sabor: SaborEnum? = null,
    var quantidade: Number? = null,
    var observacao: String? = null,
    var preco: BigDecimal? = null
)

/*

|-----------------------------PEDIDO--------------------------------|
|																	|
| LISTA_SABORES | VALOR_TOTAL 	| ENTREGAR 	| ORIGEM 				|
| LISTA_SABORES | 50.00 		| (SIM/NÃO) | (INSTA/WHATS/FACE) 	|
|																	|
|-------------------------------------------------------------------|

*/
