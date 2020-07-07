package com.apolis.test

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_first.view.*

class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_first, container, false)
        init(view)
        return view
    }

    private fun init(view: View){
        view.enter_btn.setOnClickListener {
            var id = view.enter_id.text.toString()
            var name = view.enter_name.text.toString()
            var email = view.enter_email.text.toString()
            var mobile = view.enter_mobile.text.toString()
            var resultFragment = SecondFragment.newInstance(id,name,email,mobile)
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, resultFragment).commit()
        }
    }
}

