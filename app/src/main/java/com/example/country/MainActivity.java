package com.example.country;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView vn;
    ImageView lao;
    ImageView japan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createEvent();
        SetEvent();
    }

    private void SetEvent() {
        vn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Vn.class );
                startActivity(intent);
            }
        });
        lao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Lao.class );
                startActivity(intent);
            }
        });
        japan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Japan.class );
                startActivity(intent);
            }
        });
    }

    void createEvent(){
        vn=(ImageView) findViewById(R.id.vn);
        japan=(ImageView) findViewById(R.id.japan);
        lao=(ImageView) findViewById(R.id.lao);
    }
}