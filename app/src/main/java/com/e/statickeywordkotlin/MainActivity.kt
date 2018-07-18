package com.e.statickeywordkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var kotlinclassOBject = KotlinClass()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        kotlinclassOBject.print(this@MainActivity)

        goto_java.setOnClickListener {

            val intent = Intent(this@MainActivity, JavaActivity::class.java)
            startActivity(intent)
        }

        goto_kotlin.setOnClickListener {
            val intent = Intent(this@MainActivity, KotlinActivity::class.java)
            startActivity(intent)

        }


        btn.setOnClickListener {

            //calling a kotlin class from kotlin
            Toast.makeText(this@MainActivity, "Hey ${kotlinclassOBject.print(this@MainActivity)} ", Toast.LENGTH_SHORT).show()
            Toast.makeText(this@MainActivity, "Hey ${KotlinClass().print(this@MainActivity)}", Toast.LENGTH_SHORT).show()

            Toast.makeText(this@MainActivity, "Hey ${Util.a()} " +Util.a(), Toast.LENGTH_SHORT).show()
            Toast.makeText(this@MainActivity, "Hey ${Util.b} ", Toast.LENGTH_SHORT).show()

            for(item in Util.arraylist) {
                Toast.makeText(this@MainActivity, " $item ", Toast.LENGTH_SHORT).show()
            }

        }
    }
}
