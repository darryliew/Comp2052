package ca.bcit.comp2052.a01019428.androidhelloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TempConversion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_conversion);

        Button buttonWidget = (Button)findViewById(R.id.NextButton);
        buttonWidget.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                EditText EnterTempWidget = (EditText)findViewById(R.id.EnterTemp);
                TextView TempResultsWidget = (TextView)findViewById(R.id.TempResults);
                String inputString = EnterTempWidget.getText().toString();

                float celsius = 0.0f, fahrenheit = 0.0f, kelvin = 0.0f;

                try {
                    fahrenheit = Float.parseFloat(inputString);
                } catch (Exception e) {
                    TempResultsWidget.setText(e.getMessage());
                    return;
                }

                celsius = (fahrenheit-32)/1.8f;
                kelvin = celsius+273.15f;

                TempResultsWidget.setText(String.format("%.2f °F", fahrenheit) + "\nconverts to\n" + String.format("%.2f °C", celsius) + "\nthen converts to\n" + String.format("%.2f K", kelvin));
            }
        });
    }
}
