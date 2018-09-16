package com.wordwrite.nsh.wordwrite;

//import ai.api.AIListener;
//import ai.api.android.AIConfiguration;
//import ai.api.android.AIService;
//import ai.api.model.AIError;
//import ai.api.model.AIResponse;
//import ai.api.model.Result;
import com.google.gson.JsonElement;
import java.util.Map;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton button  = (FloatingActionButton)findViewById(R.id.floatingActionButton);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, CorrectionActivity.class);
                startActivity(i);
            }
        });
    }
}
