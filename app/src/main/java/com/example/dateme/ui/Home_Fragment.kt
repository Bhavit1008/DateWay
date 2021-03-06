package com.example.dateme.ui

import android.graphics.Color
import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import android.util.Size
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.dateme.R
import com.example.dateme.ui.auth.OnSwipeTouchListener
import com.thecode.aestheticdialogs.*
import nl.dionsegijn.konfetti.KonfettiView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Home_Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Home_Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater!!.inflate(R.layout.fragment_home_, container, false)
        val like_btn: ImageView = view.findViewById(R.id.like_btn)
        val swiper_image: ImageView = view.findViewById(R.id.img_swiper)
        val swiper_name: TextView = view.findViewById(R.id.txt_name_swiper)
        val swiper_age: TextView= view.findViewById(R.id.txt_age_swiper)
        val swiper_location: TextView = view.findViewById(R.id.txt_location_swiper)


       like_btn.setOnClickListener {
           Toast.makeText(activity,"message like",Toast.LENGTH_SHORT).show()
           AestheticDialog.Builder(activity!!, DialogStyle.FLAT, DialogType.SUCCESS)
               .setTitle("Hurray")
               .setMessage("Its a match!!!")
               .setCancelable(false)
               .setDarkMode(false)
               .setGravity(Gravity.CENTER)
               .setAnimation(DialogAnimation.SHRINK)
               .setOnClickListener(object : OnDialogClickListener {
                   override fun onClick(dialog: AestheticDialog.Builder) {
                       dialog.dismiss()
                       //actions...
                   }
               })
               .show()
           like_btn.setImageResource(R.drawable.ic_baseline_favorite_24_colored)
       }

        activity?.applicationContext?.let {
            view.setOnTouchListener(object : OnSwipeTouchListener(it) {

                override fun onSwipeTop() {
                    super.onSwipeTop()
                    Toast.makeText(activity,"swiped top",Toast.LENGTH_SHORT).show()
                    swiper_image.setImageResource(R.drawable.rashmika_mandanna)
                    swiper_name.text = getString(R.string.name)
                    swiper_age.text = getString(R.string.age)
                    swiper_location.text = getString(R.string.location)

                }
                override fun onSwipeBottom() {
                    super.onSwipeBottom()
                    Toast.makeText(activity,"swiped bottom",Toast.LENGTH_SHORT).show()
                }

                override fun onClick() {
                    super.onSwipeRight()
                    Toast.makeText(activity,"swiped clicked",Toast.LENGTH_SHORT).show()
                }
                override fun onDoubleClick() {
                    super.onSwipeRight()
                    Toast.makeText(activity,"swiped double clicked",Toast.LENGTH_SHORT).show()
                }

                override fun onLongClick() {
                    super.onSwipeRight()
                    Toast.makeText(activity,"swiped long click",Toast.LENGTH_SHORT).show()
                }


            })
        }
        // Return the fragment view/layout
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(): Home_Fragment = Home_Fragment()
    }
}