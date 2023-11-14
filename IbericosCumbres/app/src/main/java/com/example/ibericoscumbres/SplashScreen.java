package com.example.ibericoscumbres;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {


    public void openLogin(){
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        }, 3000);
    }
  ImageView cerdito_imageview, cumbres_imageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        openLogin();

        //AGREGAR ANIMACIONES
        final Animation animacion1 = AnimationUtils.loadAnimation(this, R.anim.fade_in);

       final  Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.izquierda);



        cerdito_imageview = findViewById(R.id.cerdito);
        cumbres_imageview = findViewById(R.id.cumbres);

        cerdito_imageview.setAnimation(animacion1);
        cumbres_imageview.setAnimation(animacion2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                cerdito_imageview.setAnimation(animacion1);
                cumbres_imageview.setAnimation(animacion2);
                /*Intent siguiente = new Intent(SplashScreen.this, Login.class);
                startActivity(siguiente);
                finish();*/
            }
        }, 4000);
    }

}
