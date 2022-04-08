package com.example.guessmynumberapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    txt_view1.text = resources.getString(R.string.first_que)
    number = 5

    }

    fun arrowDown(view: View){
        if(number==5){
            number=3
            txt_view1.text = resources.getString(R.string.sec_que)
        }else if(number==3){
            number=2
            txt_view1.text = resources.getString(R.string.thr_que)
        }else if(number==2){
            number=1
            txt_view1.text = resources.getString(R.string.four_que)
        }else if(number==7){
            number=6
            txt_view1.text = resources.getString(R.string.sev_que)
        }else if(number==9){
            number = 8
            txt_view1.text = resources.getString(R.string.nin_que)
        }
    }

    fun successFun(view: View){
        txt_view2.visibility = View.VISIBLE
        txt_view1.visibility = View.INVISIBLE
        txt_view3.visibility = View.VISIBLE
        txt_view3.text = String.format(resources.getString(R.string.target_num),number)
    }

    fun arrowUp(view: View){
        if(number==3){
            number = 4
            txt_view1.text = resources.getString(R.string.fif_que)
        }else if(number==5){
            number = 7
            txt_view1.text = resources.getString(R.string.six_que)
        }else if(number==7){
            number = 9
            txt_view1.text = resources.getString(R.string.eig_que)
        }
        else if(number==9){
            number = 10
            txt_view1.text = resources.getString(R.string.ten_que)
        }

    }

    fun resetFun(view: View){
        txt_view1.text = resources.getString(R.string.first_que)
        number=5
        txt_view2.visibility = View.INVISIBLE
        txt_view3.visibility = View.INVISIBLE
        txt_view1.visibility = View.VISIBLE
    }
}