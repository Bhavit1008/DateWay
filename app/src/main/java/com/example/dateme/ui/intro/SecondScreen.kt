package com.example.dateme.ui.intro

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.dateme.MainActivity
import com.example.dateme.R
import com.example.dateme.ui.Chat_Fragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondScreen : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var secondDot: ImageView
    private lateinit var nextButton: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater!!.inflate(R.layout.fragment_second_screen, container, false)
        secondDot = view.findViewById(R.id.second_dot)
        nextButton = view.findViewById(R.id.start_btn_first)
        Handler().postDelayed({
            secondDot.setImageResource(R.drawable.btn_backgrounde)
        }, 1000)

        nextButton.setOnClickListener {
            val i = Intent(context,MainActivity::class.java)
            startActivity(i)
        }
        return view
    }

    companion object {

        fun newInstance(): SecondScreen = SecondScreen()
    }
}