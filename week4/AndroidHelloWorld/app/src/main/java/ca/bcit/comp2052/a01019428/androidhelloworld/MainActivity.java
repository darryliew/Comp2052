package ca.bcit.comp2052.a01019428.androidhelloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the button by id and create a var of type Button
        Button buttonWidget = (Button)findViewById(R.id.button);
        // Implement button click event handler
        buttonWidget.setOnClickListener(new android.view.View.OnClickListener() {
            // onClick method is defined in the OnClickListener interface,
            // we override it and implement our own functionality
            @Override
            // onClick method entry point
            public void onClick(View arg0) {
                // Find the EditText by id and create a var of type EditText
                EditText editTextWidget = (EditText)findViewById(R.id.editText);
                // Find the TextView by id and create a var of type TextView
                TextView textViewWidget = (TextView)findViewById(R.id.textView);
                // Read text from the EditText widget, store in inputString var
                String inputString = editTextWidget.getText().toString();

                float celsius = 0.0f, fahrenheit = 0.0f, kelvin = 0.0f;

                // Try a risky operation which is not guaranteed to work
                try {
                    // Try parsing the user input and assigning the value to fahrenheit var
                    //celsius = Double.parseDouble(inputString);
                    fahrenheit = Float.parseFloat(inputString);
                    // Catch the exception, if any, do not crash!
                } catch (Exception e) {
                    // Parse FAILURE, get the error message from the exception object,
                    // show in the TextView widget
                    textViewWidget.setText(e.getMessage());
                    // Abort the execution, we cannot proceed without a valid float.
                    return;
                }

                // Parse SUCCESS, do the math conversions
                celsius = (fahrenheit-32)/1.8f;
                kelvin = celsius+273.15f;
                // Show the result in TextView, format it to show only 2 decimal places
                textViewWidget.setText(String.format("%.2f °F", fahrenheit) + "\nconverts to\n" + String.format("%.2f °C", celsius) + "\nthen converts to\n" + String.format("%.2f K", kelvin));
            }
        });
    }
}
