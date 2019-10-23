package com.example.androidhw9;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_setting:
                recreate();
                break;
        }

        return super.onOptionsItemSelected(item);
    }




    int guesswrong;
    int answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent check=getIntent();
        boolean randomswitch= check.getBooleanExtra("randomswitch",true);
                guesswrong=check.getIntExtra("guesstime",0)  ;
                answer=check.getIntExtra("answer",0);
     if(randomswitch==true){
        answer=(int)(Math.random()*9)+1;
        check.putExtra("randomswitch",false);
     }
        final Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);
        final TextView guesstime=(TextView)findViewById(R.id.guesstime);
        TextView ans=(TextView)findViewById(R.id.ans);
        ans.setText(""+answer);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(1!=answer){
                    guesswrong++;
                }

                guesstime.setText("你已經猜錯"+guesstime+"次");
                Intent check = new Intent(MainActivity.this, result.class);
                check.putExtra("answer", answer);
                check.putExtra("guesstime",guesswrong);
                check.putExtra("guessanswer",1);
                startActivity(check);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(2!=answer){
                    guesswrong++;
                }

                guesstime.setText("你已經猜錯"+guesstime+"次");
                Intent check = new Intent(MainActivity.this, result.class);
                check.putExtra("answer", answer);
                check.putExtra("guesstime",guesswrong);
                check.putExtra("guessanswer",2);
                startActivity(check);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(3!=answer){
                    guesswrong++;
                }

                guesstime.setText("你已經猜錯"+guesstime+"次");
                Intent check = new Intent(MainActivity.this, result.class);
                check.putExtra("answer", answer);
                check.putExtra("guesstime",guesswrong);
                check.putExtra("guessanswer",3);
                startActivity(check);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(4!=answer){
                    guesswrong++;
                }

                guesstime.setText("你已經猜錯"+guesstime+"次");
                Intent check = new Intent(MainActivity.this, result.class);
                check.putExtra("answer", answer);
                check.putExtra("guesstime",guesswrong);
                check.putExtra("guessanswer",4);
                startActivity(check);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(5!=answer){
                    guesswrong++;
                }

                guesstime.setText("你已經猜錯"+guesstime+"次");
                Intent check = new Intent(MainActivity.this, result.class);
                check.putExtra("answer", answer);
                check.putExtra("guesstime",guesswrong);
                check.putExtra("guessanswer",5);
                startActivity(check);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(6!=answer){
                    guesswrong++;
                }

                guesstime.setText("你已經猜錯"+guesstime+"次");
                Intent check = new Intent(MainActivity.this, result.class);
                check.putExtra("answer", answer);
                check.putExtra("guesstime",guesswrong);
                check.putExtra("guessanswer",6);
                startActivity(check);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(7!=answer){
                    guesswrong++;
                }

                guesstime.setText("你已經猜錯"+guesstime+"次");
                Intent check = new Intent(MainActivity.this, result.class);
                check.putExtra("answer", answer);
                check.putExtra("guesstime",guesswrong);
                check.putExtra("guessanswer",7);
                startActivity(check);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(8!=answer){
                    guesswrong++;
                }

                guesstime.setText("你已經猜錯"+guesstime+"次");
                Intent check = new Intent(MainActivity.this, result.class);
                check.putExtra("answer", answer);
                check.putExtra("guesstime",guesswrong);
                check.putExtra("guessanswer",8);
                startActivity(check);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(9!=answer){
                    guesswrong++;
                }

                guesstime.setText("你已經猜錯"+guesstime+"次");
                Intent check = new Intent(MainActivity.this, result.class);
                check.putExtra("answer", answer);
                check.putExtra("guesstime",guesswrong);
                check.putExtra("guessanswer",9);
                startActivity(check);
            }
        });

    }
}
