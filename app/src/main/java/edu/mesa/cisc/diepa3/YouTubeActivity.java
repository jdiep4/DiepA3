package edu.mesa.cisc.diepa3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class YouTubeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_tube);

        WebView youTubeWebView = (WebView) findViewById(R.id.webViewYouTube);
        youTubeWebView.loadUrl("http://www.youtube.com");

    }
}
