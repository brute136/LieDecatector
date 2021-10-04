package com.mycompany.LieDecator;
 
import android.app.Activity;
import android.os.Bundle;
//import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends Activity { 
     //private Button Buton;
	 private ImageView Img;
	 private TextView tc;
	 public int x = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		Img = findViewById(R.id.Image);
		tc = findViewById(R.id.Text);
		Img.setImageResource(R.drawable.images);
        
    }
	public void bu(View v){
		if (x%2 == 0){
			tc.setText("Its Lie");
			x++;
			if (x == 4 || x == 8 || x== 20){
				x -= 6;
			}
		}else{
			tc.setText("Its Truth");
			x++;
			if (x == 4 || x == 8 || x== 20){
				x -= 6;
			}
		}
	}
	
} 
