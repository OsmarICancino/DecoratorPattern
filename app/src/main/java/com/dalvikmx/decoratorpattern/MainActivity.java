package com.dalvikmx.decoratorpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.dalvikmx.decoratorpattern.Bread.Bagel;
import com.dalvikmx.decoratorpattern.Bread.Bread;
import com.dalvikmx.decoratorpattern.Bread.LowFatButter;
import com.dalvikmx.decoratorpattern.Bread.Open;
import com.dalvikmx.decoratorpattern.Bread.Toasted;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "DecoratorPattern";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * En este punto decoramos el pan inicial con los distintos decoradores
         */
        Bread bagel = new Bagel();

        LowFatButter spread = new LowFatButter(bagel);
        Toasted toasted = new Toasted(spread);
        Open open = new Open(toasted);

        Log.d(TAG, open.getDescription()  + " : " + open.getKcal());

    }
}
