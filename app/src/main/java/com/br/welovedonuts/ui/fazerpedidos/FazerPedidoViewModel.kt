package com.br.welovedonuts.ui.fazerpedidos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FazerPedidoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Nessa tela de ser possível iniciar novo um pedido"
    }
    val text: LiveData<String> = _text
}