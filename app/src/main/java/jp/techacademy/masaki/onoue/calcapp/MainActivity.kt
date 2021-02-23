package jp.techacademy.masaki.onoue.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }


    override fun onClick(v: View) {
        val intent = Intent(this, SecondActivity::class.java)

        if(editText1.text.isEmpty() || editText2.text.isEmpty()) {
           Snackbar.make(v, "数値が入力されていません", Snackbar.LENGTH_LONG).show()
            return
        }


        if (v.id == R.id.button1) {
            intent.putExtra(
                "VALUE1",
                editText1.text.toString().toDouble() + editText2.text.toString().toDouble()
            )
        } else if (v.id == R.id.button2) {
            intent.putExtra(
                "VALUE1",
                editText1.text.toString().toDouble() - editText2.text.toString().toDouble()
            )
        } else if (v.id == R.id.button3) {
            intent.putExtra(
                "VALUE1",
                editText1.text.toString().toDouble() * editText2.text.toString().toDouble()
            )
        } else if (v.id == R.id.button4) {
            intent.putExtra(
                "VALUE1",
                editText1.text.toString().toDouble() / editText2.text.toString().toDouble()
            )
        }

        startActivity(intent)
    }



}





