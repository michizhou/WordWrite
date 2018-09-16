package com.wordwrite.nsh.wordwrite;

import ai.api.model.AIError;
import ai.api.model.AIResponse;
import ai.api.model.Result;
import ai.api.ui.AIButton;
import ai.api.android.AIConfiguration;
import com.google.gson.JsonElement;
import java.util.Map;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.content.Intent;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Listener function
        final AIConfiguration config = new AIConfiguration(
                "14bbcece37504c4aaa16763eee07dc41",
                AIConfiguration.SupportedLanguages.English,
                AIConfiguration.RecognitionEngine.System);

        AIButton aiButton = (AIButton) findViewById(R.id.micButton);

        aiButton.initialize(config);
        aiButton.setResultsListener(new AIButton.AIButtonListener() {
            @Override
            public void onResult(final AIResponse result) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Log.d("ApiAi", "onResult");
                        // TODO process response here
                    }
                });
            }

            @Override
            public void onError(final AIError error) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Log.d("ApiAi", "onError");
                        // TODO process error here
                    }
                });
            }

            @Override
            public void onCancelled() {
                // Something in here
            }
        });

//        FloatingActionButton button  = (FloatingActionButton)findViewById(R.id.floatingActionButton);
//        button.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v){
//                Intent i = new Intent(MainActivity.this, CorrectionActivity.class);
//                startActivity(i);
//            }
//        });
        FloatingActionButton firstNButton = (FloatingActionButton)findViewById(R.id.firstNextButton);
        firstNButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, CorrectionActivity.class);
                startActivity(i);
            }
        });
        FloatingActionButton secondNButton = (FloatingActionButton)findViewById(R.id.secondNextButton);
        secondNButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, CorrectionActivity.class);
                startActivity(i);
            }
        });
        FloatingActionButton thirdNButton = (FloatingActionButton)findViewById(R.id.thirdNextButton);
        thirdNButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, CorrectionActivity.class);
                startActivity(i);
            }
        });
        FloatingActionButton fourthNButton = (FloatingActionButton)findViewById(R.id.fourthNextButton);
        fourthNButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, CorrectionActivity.class);
                startActivity(i);
            }
        });
        FloatingActionButton secondPButton = (FloatingActionButton)findViewById(R.id.secondPrevButton);
        secondPButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, CorrectionActivity.class);
                startActivity(i);
            }
        });
        FloatingActionButton thirdPButton = (FloatingActionButton)findViewById(R.id.thirdPrevButton);
        thirdPButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, CorrectionActivity.class);
                startActivity(i);
            }
        });
        FloatingActionButton fourthPButton = (FloatingActionButton)findViewById(R.id.fourthPrevButton);
        fourthPButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, CorrectionActivity.class);
                startActivity(i);
            }
        });
        FloatingActionButton fifthPButton = (FloatingActionButton)findViewById(R.id.fifthPrevButton);
        fifthPButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, CorrectionActivity.class);
                startActivity(i);
            }
        });
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
