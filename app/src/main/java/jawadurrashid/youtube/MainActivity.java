package jawadurrashid.youtube;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSingle = (Button) findViewById(R.id.btnPlaySingle);
        Button buttonStandAlone = (Button) findViewById(R.id.btnStandAlone);

        buttonSingle.setOnClickListener(this);
        buttonStandAlone.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch (v.getId()){

            case R.id.btnPlaySingle:      //Stats YouTube activity
                intent = new Intent(this, YoutubeActivity.class); //Class literal, used to parse a reference to the class as a parameter (parsing class to a method)
                break;

            case R.id.btnStandAlone:     //Starts Standalone activity
                intent = new Intent(this, StandaloneActivity.class);
                break;

            default:
        }

        if (intent != null){
            startActivity(intent);
        }
    }
}
