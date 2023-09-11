package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.Checklist;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 버튼 클릭 이벤트 처리
         button1 = findViewById(R.id.button1);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // 액티비티 B로 이동하는 인텐트 생성
                    Intent intent = new Intent(MainActivity.this, Checklist.class);
                    startActivity(intent);//액티비티 이동
                }
            });

    }

}




