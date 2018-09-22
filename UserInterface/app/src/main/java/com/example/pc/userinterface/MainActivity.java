package com.example.pc.userinterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private TextView m_hien_thi;
    private EditText m_so_a, m_so_b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_hien_thi = findViewById(R.id.hien_thi);
        m_so_a = findViewById(R.id.so_a);
        m_so_b = findViewById(R.id.so_b);


    }
    public void tong(View v){
        String text_b=m_so_b.getText().toString();
        Double b=Double.parseDouble(text_b);
        String text_a=m_so_a.getText().toString();
        Double a=Double.parseDouble(text_a);
        Double ketqua=a+b;
        int ketqua1=ketqua.intValue();
        m_hien_thi.setText(ketqua1+"");
    }
}
