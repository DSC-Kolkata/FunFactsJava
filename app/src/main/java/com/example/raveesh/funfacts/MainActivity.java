package com.example.raveesh.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mFactLabel;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;
    private FactBook factBook = new FactBook();
    private  ColorWheel colorWheel = new ColorWheel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFactLabel = findViewById(R.id.factTextView);
        mShowFactButton = findViewById(R.id.showFactButton);
        mRelativeLayout = findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String fact = factBook.getFact();
                mFactLabel.setText(fact);
                int color = colorWheel.getColor();
                mRelativeLayout.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);
            }
        };
        mShowFactButton.setOnClickListener(listener);
    }
}
