package com.example.TrafficJam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity
{

    Button m_buttonPlay;
    Button m_buttonOptions;
    Button m_buttonPuzzles;
	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

        m_buttonPlay = (Button) findViewById( R.id.button);
        m_buttonPlay.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyActivity.this, PlayActivity.class);
                startActivity(intent);
            }
        });

        m_buttonOptions = (Button) findViewById( R.id.buttonOptions);
        m_buttonOptions.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyActivity.this, OptionsActivity.class);
                startActivity(intent);
            }
        });

        m_buttonPuzzles = (Button) findViewById( R.id.buttonPuzzles);
        m_buttonPuzzles.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyActivity.this, PuzzlesActivity.class);
                startActivity(intent);
            }
        });

    }

}
