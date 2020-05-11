package com.br.welovedonuts.ui.pedidos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PedidosViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Nessa tela deve ser possível visualizar todos os pedidos"
    }
    val text: LiveData<String> = _text
}