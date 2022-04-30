package com.thurainx.pickers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity(R.layout.activity_first) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btn_next.setOnClickListener {
            getMessage.launch((SecondActivity.show(context = this, message = "Hello from first activity.")))
        }
    }

    val getMessage = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        if(it.resultCode == BACK_REQUEST_CODE && it.data != null){
            tv_greeting.text = it.data!!.getStringExtra(KEY_MESSGE_BACK)
        }
    }
}