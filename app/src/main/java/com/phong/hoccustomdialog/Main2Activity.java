package com.phong.hoccustomdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void moThoat(View view) {
        MyCustomDialog dialog = new MyCustomDialog(Main2Activity.this);//Màn hình nào thì lấy màn hình đó .this
        dialog.show();
    }
}
