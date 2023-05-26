package com.example.trivia_app
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
var p = 0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button2)
        rollButton.setOnClickListener{
            butt()
        }
        butt()
    }
    private fun butt() {
       val buton = BUTT(4)
        val count = buton.b()
        val butImage: ImageView = findViewById(R.id.ImageView)
        val butiImage: ImageView = findViewById(R.id.imageView6)
        val butiiImage: ImageView = findViewById(R.id.imageView9)
        p++
        when(count) {
            0->{
                butImage.setImageResource(R.drawable.quiz)
                butiImage.setImageResource(R.drawable.trivia)
                butiiImage.setImageResource(R.drawable.star)
            }
            1-> {
                butImage.setImageResource(R.drawable.q1)
                butiImage.setImageResource(R.drawable.bg)
                butiiImage.setImageResource(R.drawable.think1)
            }
            2-> {
                butImage.setImageResource(R.drawable.q2)
                butiImage.setImageResource(R.drawable.bg1)
                butiiImage.setImageResource(R.drawable.think2)

            }
            3-> {
                butImage.setImageResource(R.drawable.q3)
                butiImage.setImageResource(R.drawable.bg2)
                butiiImage.setImageResource(R.drawable.think3)
            }
            4-> {
                butImage.setImageResource(R.drawable.q4)
                butiImage.setImageResource(R.drawable.bg3)
                butiiImage.setImageResource(R.drawable.think4)
            }
        }
        butImage.contentDescription = count.toString()
    }
    class BUTT(private val sides: Int){
        fun b(): Int {
           return p
        }
    }
}
