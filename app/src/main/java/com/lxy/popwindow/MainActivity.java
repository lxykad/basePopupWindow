package com.lxy.popwindow;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private View mPopView;
    TextView mTvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPopView = LayoutInflater.from(this).inflate(R.layout.pop_layout, null);
        mTvShow = (TextView) findViewById(R.id.tv_show);

    }


    public void showPop(View view) {
        PopupWindow pw = new BasePopupWindow();
        pw.setWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
        pw.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
        pw.setContentView(mPopView);

        ColorDrawable drawable = new ColorDrawable(Color.parseColor("#39c6c1"));
        pw.setBackgroundDrawable(drawable);
        pw.setOutsideTouchable(true);
        pw.setFocusable(true);

        pw.showAsDropDown(mTvShow);

        TextView item1 = (TextView) mPopView.findViewById(R.id.item1);
        TextView item2 = (TextView) mPopView.findViewById(R.id.item2);
        TextView item3 = (TextView) mPopView.findViewById(R.id.item3);
        TextView item4 = (TextView) mPopView.findViewById(R.id.item4);

        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "item1", Toast.LENGTH_SHORT).show();
            }
        });
        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "item2", Toast.LENGTH_SHORT).show();
            }
        });
        item3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "item3", Toast.LENGTH_SHORT).show();
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "item4", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
