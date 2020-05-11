package com.br.welovedonuts.ui.entregas

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EntregasViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Nessa tela deve ser possível visualizar a listagem de entregas"
    }
    val text: LiveData<String> = _text
}