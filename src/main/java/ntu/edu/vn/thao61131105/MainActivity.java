package ntu.edu.vn.thao61131105;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText chieucao, canhday, canhben;
    Button tinhChuvi, tinhDientich;
    TextView ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        chieucao = (EditText)findViewById(R.id.chieucao);
        canhday = (EditText)findViewById(R.id.canhday);
        canhben = (EditText)findViewById(R.id.canhben);
        tinhChuvi = (Button)findViewById(R.id.tinhChuVi);
        tinhDientich = (Button)findViewById(R.id.tinhDienTich);
        ketqua = (TextView)findViewById(R.id.ketqua);

        tinhChuvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ccao = Integer.parseInt(chieucao.getText().toString());
                int cday = Integer.parseInt(canhday.getText().toString());
                int kqua = cday * ccao;
                ketqua.setText("Dien tich hinh binh hanh la: " + kqua);
            }
        });


        tinhDientich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cben = Integer.parseInt(canhben.getText().toString());
                int kqua = 2 * ( cben + cben);
                ketqua.setText("Chu vi hinh binh hanh la: " + kqua);

            }
        });



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
