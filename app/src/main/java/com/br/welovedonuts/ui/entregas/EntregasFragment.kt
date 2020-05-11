package com.br.welovedonuts.ui.entregas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.br.welovedonuts.R

class EntregasFragment : Fragment() {

    private lateinit var entregasViewModel: EntregasViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        entregasViewModel =
            ViewModelProviders.of(this).get(EntregasViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_entregas, container, false)
        val textView: TextView = root.findViewById(R.id.text_entregas)
        entregasViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
