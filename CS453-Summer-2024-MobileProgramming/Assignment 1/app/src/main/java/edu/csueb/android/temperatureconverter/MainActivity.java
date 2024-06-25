package edu.csueb.android.temperatureconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
    }

    public void onClick(View view) {
        // Get input value
        String input = editText.getText().toString();
        if (input.isEmpty()) {
            Toast.makeText(this, "Please enter a value", Toast.LENGTH_SHORT).show();
            return;
        }

        double value = Double.parseDouble(input);
        boolean isCelsius = ((RadioButton) findViewById(R.id.radioButton)).isChecked();

        // Convert value using ConverterUtil
        double result;
        if (isCelsius) {
            result = ConverterUtil.celsiusToFahrenheit(value);
            Toast.makeText(this, value + " Celsius is " + result + " Fahrenheit", Toast.LENGTH_SHORT).show();
        } else {
            result = ConverterUtil.fahrenheitToCelsius(value);
            Toast.makeText(this, value + " Fahrenheit is " + result + " Celsius", Toast.LENGTH_SHORT).show();
        }
    }
}
