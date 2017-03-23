package edu.mesa.cisc.diepa3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button mesaCollegeButton;
    Button youTubeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mesaCollegeButton = (Button) findViewById(R.id.buttonMesaCollege);
        mesaCollegeButton.setOnClickListener(this);

        youTubeButton = (Button) findViewById(R.id.buttonYouTube);
        youTubeButton.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.buttonMesaCollege:
                Intent m;
                m = new Intent(this, MesaCollegeActivity.class);
                startActivity(m);
                break;

            case R.id.buttonYouTube:
                Intent y;
                y = new Intent(this, YouTubeActivity.class);
                startActivity(y);
                break;
        }
    }
}
