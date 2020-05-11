package com.br.welovedonuts.ui.fazerpedidos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.br.welovedonuts.R

class FazerPedidoFragment : Fragment() {

    private lateinit var fazerPedidoViewModel: FazerPedidoViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fazerPedidoViewModel =
            ViewModelProviders.of(this).get(FazerPedidoViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_fazer_pedido, container, false)
        val textView: TextView = root.findViewById(R.id.text_fazer_pedido)
        fazerPedidoViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
