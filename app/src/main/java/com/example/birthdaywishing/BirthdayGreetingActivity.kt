
package com.example.birthdaywishing

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.media.MediaPlayer

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)




        val name =intent.getStringExtra(NAME_EXTRA)
        findViewById<TextView>(R.id.textView).text = "Happy Birthday \n $name !"

        playsong()
    }
    fun playsong(){
        var mediaPlayer =  MediaPlayer.create(this,R.raw.birthdaysong)
        mediaPlayer.start()
    }



}





