package jaipur.com.pantomath;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends Activity {
    RatingBar bar;
    Bundle b;
    int score;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        bar=(RatingBar)findViewById(R.id.ratingBar1);
//get text view
        t=(TextView)findViewById(R.id.textResult);
//get score
        b = getIntent().getExtras();
        score= b.getInt("score");
//display score
        bar.setRating(score);
        switch (score)
        {
            case 0:
            case 1:
            case 2: t.setText("Oopsie! Better Luck Next Time!");
                //Toast.makeText(ResultActivity.this,score,Toast.LENGTH_SHORT).show();
                break;
            case 3:
            case 4:t.setText("Hmmmm.. Someone's been reading a lot of trivia");
                //Toast.makeText(ResultActivity.this,score,Toast.LENGTH_SHORT).show();
                break;
            case 5:t.setText("Who are you? A trivia wizard???");
                //Toast.makeText(ResultActivity.this,score,Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

