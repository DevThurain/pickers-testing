package com.thurainx.pickers

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import kotlinx.android.synthetic.main.activity_second.*

val KEY_MESSAGE = "KEY_MESSAGE"
val KEY_MESSGE_BACK = "KEY_MESSAGE_BACK"
val BACK_REQUEST_CODE = 100


class SecondActivity : AppCompatActivity(R.layout.activity_second) {
    companion object{
        fun show(context: Context, message: String) : Intent{
            val intent = Intent(context,SecondActivity::class.java)
            intent.putExtra(KEY_MESSAGE,message)
            return intent
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btn_pick.setOnClickListener {
            imagePicker.launch("image/*")
        }

        btn_youtube.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com")
            startActivity(intent)
        }

        btn_back.setOnClickListener {
            val intent = Intent()
            intent.putExtra(KEY_MESSGE_BACK,"Fine, Thank you and you.")
            setResult(BACK_REQUEST_CODE,intent)
            finish()
        }

        tv_message.text = intent.getStringExtra(KEY_MESSAGE)

    }

    val imagePicker = registerForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
            if(uri != null){
                iv_photo.setImageURI(uri)
            }
    }




}