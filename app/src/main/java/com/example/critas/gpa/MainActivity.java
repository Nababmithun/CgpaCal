package com.example.critas.gpa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    int added = 2;

    Button calc;
    Button addcourse;

    LinearLayout ll2, ll3, ll4, ll5, ll6, ll7, ll8 , ll9;

    EditText get1, get2, get3, get4, get5, get6, get7, get8, get9;
    EditText cet1, cet2, cet3, cet4, cet5, cet6, cet7, cet8, cet9;

    TextView result;


    Double cgpa1, cgpa2, cgpa3, cgpa4, cgpa5, cgpa6, cgpa7, cgpa8, cgpa9;
    Double credit1, credit2, credit3, credit4, credit5, credit6, credit7, credit8, credit9;
    Double point1, point2, point3, point4, point5, point6, point7, point8, point9;
    Double tpoint, tcredit, dresult;


    String sresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addcourse = (Button) findViewById(R.id.add);
        calc = (Button) findViewById(R.id.cal);


        get1 = (EditText) findViewById(R.id.cgpa1);
        get2 = (EditText) findViewById(R.id.cgpa2);
        get3 = (EditText) findViewById(R.id.cgpa3);
        get4 = (EditText) findViewById(R.id.cgpa4);
        get5 = (EditText) findViewById(R.id.cgpa5);
        get6 = (EditText) findViewById(R.id.cgpa6);
        get7 = (EditText) findViewById(R.id.cgpa7);
        get8 = (EditText) findViewById(R.id.cgpa8);
        get9 = (EditText) findViewById(R.id.cgpa9);



        cet1 = (EditText) findViewById(R.id.credit1);
        cet2 = (EditText) findViewById(R.id.credit2);
        cet3 = (EditText) findViewById(R.id.credit3);
        cet4 = (EditText) findViewById(R.id.credit4);
        cet5 = (EditText) findViewById(R.id.credit5);
        cet6 = (EditText) findViewById(R.id.credit6);
        cet7 = (EditText) findViewById(R.id.credit7);
        cet8 = (EditText) findViewById(R.id.credit8);
        cet9 = (EditText) findViewById(R.id.credit9);



        result = (TextView) findViewById(R.id.result);


    }


    public void add(View v) {

        ll2 = (LinearLayout) findViewById(R.id.course2);
        ll3 = (LinearLayout) findViewById(R.id.course3);
        ll4 = (LinearLayout) findViewById(R.id.course4);
        ll5 = (LinearLayout) findViewById(R.id.course5);
        ll6 = (LinearLayout) findViewById(R.id.course6);
        ll7 = (LinearLayout) findViewById(R.id.course7);
        ll8 = (LinearLayout) findViewById(R.id.course8);
        ll9 = (LinearLayout) findViewById(R.id.course9);


        int count = added++;

        if (count == 2) {

            ll2.setVisibility(View.VISIBLE);

        }

        if(count == 3){

            ll3.setVisibility(View.VISIBLE);
        }

        else if ((count == 4)){

            ll4.setVisibility(View.VISIBLE);
        }

        else if (count == 5){

            ll5.setVisibility(View.VISIBLE);
        }

        else if (count == 6){

            ll6.setVisibility(View.VISIBLE);
        }

        else if (count == 7){

            ll7.setVisibility(View.VISIBLE);
        }

        else if(count == 8){

            ll8.setVisibility(View.VISIBLE);
        }

        else if(count == 9){

            ll9.setVisibility(View.VISIBLE);
        }

        else if (count >=10){

            Toast.makeText(this, "sorry! youn con't add more then 9 course", Toast.LENGTH_SHORT).show();
        }

    }

    public void cal(View v){


        cgpa1 = Double.parseDouble(get1.getText().toString());
        cgpa2 = Double.parseDouble(get2.getText().toString());
        cgpa3 = Double.parseDouble(get3.getText().toString());
        cgpa4 = Double.parseDouble(get4.getText().toString());
        cgpa5 = Double.parseDouble(get5.getText().toString());
        cgpa6 = Double.parseDouble(get6.getText().toString());
        cgpa7 = Double.parseDouble(get7.getText().toString());
        cgpa8 = Double.parseDouble(get8.getText().toString());
        cgpa9 = Double.parseDouble(get9.getText().toString());


        credit1 = Double.parseDouble(cet1.getText().toString());
        credit2 = Double.parseDouble(cet2.getText().toString());
        credit3 = Double.parseDouble(cet3.getText().toString());
        credit4 = Double.parseDouble(cet4.getText().toString());
        credit5 = Double.parseDouble(cet5.getText().toString());
        credit6 = Double.parseDouble(cet6.getText().toString());
        credit7 = Double.parseDouble(cet7.getText().toString());
        credit8 = Double.parseDouble(cet8.getText().toString());
        credit9 = Double.parseDouble(cet9.getText().toString());



        point1 = cgpa1 * credit1;
        point2 = cgpa2 * credit2;
        point3 = cgpa3 * credit3;
        point4 = cgpa4 * credit4;
        point5 = cgpa5 * credit5;
        point6 = cgpa6 * credit6;
        point7 = cgpa7 * credit7;
        point8 = cgpa8 * credit8;
        point9 = cgpa9 * credit9;



        tpoint = point1 + point2 + point3 + point4 + point5 + point6 + point7 + point8 + point9;



        tcredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 + credit9;

        dresult = tpoint / tcredit;

        sresult = dresult.toString();


        result.setText(String.format("%.2f", dresult));

    }




    public void clear(View v){


            get1.setText("0");
            get2.setText("0");
            get3.setText("0");
            get4.setText("0");
            get5.setText("0");
            get6.setText("0");
            get7.setText("0");
            get8.setText("0");
            get9.setText("0");

            cet1.setText("0");
            cet2.setText("0");
            cet3.setText("0");
            cet4.setText("0");
            cet5.setText("0");
            cet6.setText("0");
            cet7.setText("0");
            cet8.setText("0");
            cet9.setText("0");


            result.setText("0.00");


            ll2.setVisibility(View.GONE);
            ll3.setVisibility(View.GONE);
            ll4.setVisibility(View.GONE);
            ll5.setVisibility(View.GONE);
            ll6.setVisibility(View.GONE);
            ll7.setVisibility(View.GONE);
            ll8.setVisibility(View.GONE);
            ll9.setVisibility(View.GONE);


            added = 2;



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.manu_main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        int id = item.getItemId();

        if (id == R.id.about){

            Intent i = new Intent(MainActivity.this, menu.class);
            startActivity(i);

        }

        return super.onOptionsItemSelected(item);

    }
}
