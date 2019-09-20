package com.example.language;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOk(View view) {
        Locale locale;
        Spinner spinner = findViewById(R.id.spinnerLanguage);
        int position = spinner.getSelectedItemPosition();
        if (position == 1) {
            locale = new Locale("ru");
        } else {
            locale = new Locale("eng");
        }

        Spinner marginSinner = findViewById(R.id.spinnerMargin);
        Utils.changeToTheme(this, marginSinner.getSelectedItemPosition());

        Configuration configuration = new Configuration();
        configuration.setLocale(locale);
        getResources().updateConfiguration(configuration, getBaseContext().getResources().getDisplayMetrics());
        recreate();


    }

    public void onClick(View v) {
        switch (this.n) {
            case 0:
                Utils.changeToTheme(this, Utils.MARGIN_BIG);
                this.n = 1;
                return;
            case 1:
                Utils.changeToTheme(this, Utils.MARGIN_MIDDLE);
                this.n = 2;
                return;
            case 2:
                Utils.changeToTheme(this, Utils.MARGIN_SMALL);
                this.n = 3;
                return;
                default:
                break;

        }
    }
}