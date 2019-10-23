package com.example.androidhw9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result extends AppCompatActivity {
boolean randomswitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent check = getIntent();
        final int answer = check.getIntExtra("answer", 0);
        int guessanswer = check.getIntExtra("guessanwser", 0);
        final int guesstime = check.getIntExtra("guesstime", 0);

        TextView truefalse=(TextView)findViewById(R.id.truefalse);
        TextView guesstimetext=(TextView)findViewById(R.id.guesstime);
        Button again=(Button)findViewById(R.id.btnagain);

        if(answer==guessanswer){
            truefalse.setText("O");
            guesstimetext.setText("恭喜你花了"+guesstime+"次猜對!^_^");
            again.setText("在玩一次");
            randomswitch=true;
        }
        else if(answer!=guessanswer){

            truefalse.setText("X");
            again.setText("在猜一次");
            randomswitch=false;
            if(guessanswer>answer){
                guesstimetext.setText("你已經猜錯"+guesstime+"次!(提示:猜太大)");
            }
            else if(guessanswer<answer){
                guesstimetext.setText("你已經猜錯"+guesstime+"次!(提示:猜太小)");
            }
        }

again.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent check=new Intent(result.this,MainActivity.class);
        check.putExtra("answer", answer);
        check.putExtra("guesstime",guesstime);
        check.putExtra("randomswitch",randomswitch);
        startActivity(check);
    }
});

    }
}
