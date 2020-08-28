package ir.madeinlobby.nobataxino_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView rLine1 = findViewById(R.id.rLine1);
        ImageView rLine2 = findViewById(R.id.rLine2);
        ImageView rLine3 = findViewById(R.id.rLine3);
        ImageView rLine4 = findViewById(R.id.rLine4);
        ImageView rLine5 = findViewById(R.id.rLine5);
        ImageView rLine6 = findViewById(R.id.rLine6);
        ImageView rLine7 = findViewById(R.id.rLine7);

        ImageView lLine1 = findViewById(R.id.lLine1);
        ImageView lLine2 = findViewById(R.id.lLine2);
        ImageView lLine3 = findViewById(R.id.lLine3);
        ImageView lLine4 = findViewById(R.id.lLine4);
        ImageView lLine5 = findViewById(R.id.lLine5);
        ImageView lLine6 = findViewById(R.id.lLine6);

        startAnimation(200, rLine1);
        startAnimation(200, lLine1);

        startAnimation(400, rLine2);
        startAnimation(400, lLine2);

        startAnimation(600, rLine3);
        startAnimation(600, lLine3);

        startAnimation(800, rLine4);
        startAnimation(800, lLine4);

        startAnimation(1000, rLine5);
        startAnimation(1000, lLine5);

        startAnimation(1200, rLine6);
        startAnimation(1200, lLine6);

        startAnimation(1300, rLine7);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 1500);
    }

   private void startAnimation(int time, final ImageView imageView){
       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
                imageView.setVisibility(View.VISIBLE);
           }
       }, time);
   }


}