package com.e.statickeywordkotlin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class JavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        KotlinClass ktm = new KotlinClass();

        ktm.print(this);

        // calling kotlin static code from java

        Toast.makeText(this, " "+Util.Companion.a() , Toast.LENGTH_SHORT).show();

        // we get variables using from kotlin using get prefix methods
        Toast.makeText(this, " "+Util.Companion.getB() , Toast.LENGTH_SHORT).show();


        for(int item : Util.Companion.getArraylist()) {
            Toast.makeText(this, ""+item, Toast.LENGTH_SHORT).show();
        }

    }
}
