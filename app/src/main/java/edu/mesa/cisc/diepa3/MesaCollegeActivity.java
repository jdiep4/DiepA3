package edu.mesa.cisc.diepa3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MesaCollegeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa_college);

        WebView mesaCollegeWebView = (WebView) findViewById(R.id.webViewMesaCollege);
        mesaCollegeWebView.loadUrl("http://www.sdmesa.edu");

    }
}
