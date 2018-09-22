package com.example.pc.anonymouslistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button m_btn;
    private TextView m_hien_thi;
    private EditText m_so_b, m_so_a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m_btn = findViewById(R.id.tong);
        m_hien_thi = findViewById(R.id.hien_thi);
        m_so_a = findViewById(R.id.so_a);
        m_so_b = findViewById(R.id.so_b);
        m_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text_b=m_so_b.getText().toString();
                Double b=Double.parseDouble(text_b);
                String text_a=m_so_a.getText().toString();
                Double a=Double.parseDouble(text_a);
                Double ketqua=a+b;
                int ketqua1=ketqua.intValue();
                m_hien_thi.setText(ketqua1+"");
            }
        });
    }
}
