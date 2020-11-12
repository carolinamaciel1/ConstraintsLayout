package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val ClickableViews: List<View> =
            listOf(box_one_id, box_two_id, box_three_id, box_four_id, box_five_id,
                   button_red_id, button_yellow_id, button_green_id, constraint_layout)

        for (item in ClickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View){
        when(view.id){
            R.id.box_one_id -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_id -> view.setBackgroundColor(Color.DKGRAY)

            R.id.box_three_id -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_id -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_id -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.button_red_id -> box_three_id.setBackgroundResource(R.color.button_red)
            R.id.button_yellow_id -> box_four_id.setBackgroundResource(R.color.button_yellow)
            R.id.button_green_id -> box_five_id.setBackgroundResource(R.color.button_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }


    }
}