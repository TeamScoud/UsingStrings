package application.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);

        //creating toast object
        Context context = getApplicationContext();
        CharSequence message = "You Just clicked GO Button";
        int duration = Toast.LENGTH_SHORT;
        Toast toast1 = Toast.makeText(context,message,duration);
        toast1.show();
        toast1.setGravity(Gravity.TOP| Gravity.LEFT,0,0);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });


    }
}