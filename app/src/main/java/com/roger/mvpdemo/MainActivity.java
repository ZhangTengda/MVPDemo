package com.roger.mvpdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.roger.mvpdemo.view.IfanyiView;

public class MainActivity extends AppCompatActivity implements IfanyiView {

    private CidianPresenter presenter;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        findViewById(R.id.btnfanyi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.InputToModel(MainActivity.this, editText.getText().toString());
            }
        });
    }

    @Override
    public void init() {
        presenter = new CidianPresenter(this);
        editText = findViewById(R.id.edittext);
        textView = findViewById(R.id.textview);
    }

    @Override
    public void setInfo(String str) {
        textView.setText(str);
    }

    @Override
    public void setError() {
        textView.setText("Search Error, Please check the NetWork!");
    }
}
