package com.yyz.test.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.yyz.test.R
import kotlinx.android.synthetic.main.fragment_first.view.*

/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_first, container, false)

        view.submit_button.setOnClickListener {
            var name = view.edit_text_1.text.toString()

            activity!!.supportFragmentManager.beginTransaction().replace(R.id.fragment_2,SecondFragment.newInstance(name)).commit()
        }


        return view
    }


}
