package com.haunguyen.tictactoe;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Chessboard chessboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.img);

        chessboard = new Chessboard(MainActivity.this,
                                    800,
                                    800,
                                    3,
                                    3);
        chessboard.init();
        imageView.setImageBitmap(chessboard.drawBoard());
        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return chessboard.onTouch(view, motionEvent);
            }
        });
    }

}
