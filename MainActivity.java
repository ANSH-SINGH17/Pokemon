package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void grassType(View view){
        Toast.makeText(MainActivity.this, "YOU UNLOCKED BULBASAUR!", Toast.LENGTH_LONG).show();
        Button button= (Button) findViewById(R.id.button);
        ImageView image= (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.bulbasour);
        MediaPlayer bulbasaur = MediaPlayer.create(MainActivity.this, R.raw.bulbasaur);
        bulbasaur.start();

    }
    public void fireType(View view){
        Toast.makeText(MainActivity.this, "YOU UNLOCKED CHARMANDER!", Toast.LENGTH_LONG).show();
        Button button2= (Button) findViewById(R.id.button2);
        ImageView image= (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.charmander);
        MediaPlayer charmander = MediaPlayer.create(MainActivity.this, R.raw.charmander);
        charmander.start();
    }
    public void waterType(View view){
        Toast.makeText(MainActivity.this, "YOU UNLOCKED SQUIRTLE!", Toast.LENGTH_LONG).show();
        Button button3= (Button) findViewById(R.id.button3);
        ImageView image= (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.squirtle);
        MediaPlayer squirtle = MediaPlayer.create(MainActivity.this, R.raw.squirtle);
        squirtle.start();
    }
    public void backClick(View view){
        Button button4=(Button) findViewById(R.id.button4);
        ImageView image= (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.frontpage);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
