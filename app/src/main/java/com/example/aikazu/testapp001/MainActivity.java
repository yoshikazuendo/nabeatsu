package com.example.aikazu.testapp001;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
    }

    private void setViews() {
//        4.1.2
//        Button btn = new Button(this);
//        btn.setText("へろー");
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Button b = (Button)v;
//                b.setText("こんにちは！");
//            }
//        });
//        setContentView(btn);

//        4.1.3
//        Button btn = (Button)findViewById(R.id.button);
//        btn.setText("hello");
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Button b = (Button)v;
//                b.setText("こんにちは！");
//            }
//        });

        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(onClick_button);
    }

    private View.OnClickListener onClick_button = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // なべあつ
            String result = nabeatsu();

            // 結果をダイアログで表示する。
            AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
            alert.setTitle("なべあつ");
            alert.setMessage(result);
            // ボタンがクリックされた時に呼び出されるコールバックリスナーを登録します
            alert.setPositiveButton("OK", null);
            alert.show();
        }
    };

    private String nabeatsu() {
        String ret = "";
        for (int i = 1; i <= 40; i++) {
            if (i % 3 == 0 || Integer.toString(i).contains("3")) {
                ret += "アホ";
            } else if (i== 40) {
                // 40は締めっぽい感じにする。
                ret += "ぃよんじゅう！";
            }
            else{
                ret += Integer.toString(i);
            }

            if(i == 39) {
                ret += System.getProperty("line.separator");
            } else {
                ret += " ";
            }
        }

        return ret;
    }
}
