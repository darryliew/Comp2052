package ca.bcit.comp2052.a01019428.androidhelloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class SecondTemperature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_temperature);

        Button SecondTemp = (Button) findViewById(R.id.NextButtonTwo);
        SecondTemp.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SecondTemperature.this, TempConversion.class));
            }
        });

        RadioButton FahrenheitRadio = (RadioButton) findViewById(R.id.fahrenheitRadio);
//        FahrenheitRadio.setText("Fahrenheit");
//        FahrenheitRadio.setOnClickListener(radioListener);

        RadioButton CelsiusRadio = (RadioButton) findViewById(R.id.CelsiusRadio);
//            CelsiusRadio.setText("Celsius");
//            CelsiusRadio.setOnClickListener(radioListener);
    }

//    private android.view.View.OnClickListener radioListener =
//            new android.view.View.OnClickListener() {
//                public void onClick(View v) {
//                    RadioButton rb2 = (RadioButton) v;
//                    // Implement your logic here
//                    setTitle("Selected: " + rb2.getText());
//                }
//            };
}
