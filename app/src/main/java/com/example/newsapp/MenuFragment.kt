package com.example.newsapp


import android.content.Context
import android.os.Bundle
import android.view.ContextMenu
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

/**
 * A simple [Fragment] subclass.
 */
class MenuFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.cs_button).setOnClickListener {
            listener?.onButtonClicked(News.departmentNews[0])
        }
        view.findViewById<Button>(R.id.math_button).setOnClickListener {
            listener?.onButtonClicked(News.departmentNews[1])
        }
        view.findViewById<Button>(R.id.chemistry_button).setOnClickListener {
            listener?.onButtonClicked(News.departmentNews[2])
        }
    }

    // Called when a fragment is being added
    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        }
    }

    // Called when a fragment is being removed
    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    var listener: OnFragmentInteractionListener? = null

    interface OnFragmentInteractionListener {
        fun onButtonClicked(news: News)
    }

}
