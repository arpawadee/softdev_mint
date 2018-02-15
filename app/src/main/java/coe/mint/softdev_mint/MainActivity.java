package coe.mint.softdev_mint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText Ceisius , Fahrenheit ;
    private Button Btn_C2F , Btn_F2C ;
    private TextView Answer ;
    private String c,f;
    private Double x;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Ceisius = findViewById(R.id.Celcius);
        Fahrenheit =findViewById(R.id.fahrenheit);
        Btn_C2F = findViewById(R.id.btn_C2F);
        Btn_F2C= findViewById(R.id.btn_F2C);
        Answer = findViewById(R.id.answer);

        Answer.setText(">>> Please input value <<<");

        Btn_C2F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(Ceisius.length()!=0) {

                    c = Ceisius.getText().toString();
                    x = Double.parseDouble(c);

                    DecimalFormat precision = new DecimalFormat("0.0");
                    Fahrenheit.setText(precision.format((1.8 * x) + 32));

                    Answer.setText("Calculate Ceicius to Fahrenheit is complete ! ");
                }

                else {   Answer.setText(">>> Please input value <<<");

                }

            }
        });

        Btn_F2C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Fahrenheit.length()!=0) {

                    f = Fahrenheit.getText().toString();
                    x = Double.parseDouble(f);

                    DecimalFormat precision = new DecimalFormat("0.00");
                    Ceisius.setText(precision.format((x - 32) / 1.8));

                    Answer.setText("Calculate Fahrenheit to Ceicius is complete ! ");
                }

                else {   Answer.setText(">>> Please input value <<<");

                }


            }
        });


    }
}
