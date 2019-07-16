package com.phong.hoccustomdialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;

public class MyCustomDialog extends Dialog {
    ImageView imgThoat, imgHuy;
    Activity context;
    public MyCustomDialog(Activity context) {
        super(context);
        this.context = context;
        setContentView(R.layout.itemfordialog);
        addControls();
        addEvents();
    }

    private void addEvents() {
        imgThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.finish();//thoát Cửa sổ nào đó đang sử dụng CustomDialog này
            }
        });
        imgHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();//Đóng cửa sổ này
            }
        });
    }

    private void addControls() {
        imgThoat = (ImageView) findViewById(R.id.imgThoat);
        imgHuy = (ImageView) findViewById(R.id.imgHuy);
        setCanceledOnTouchOutside(false);
    }
}
