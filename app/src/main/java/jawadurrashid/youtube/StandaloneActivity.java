package jawadurrashid.youtube;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

/**
 * Created by User on 2017-03-27.
 */

public class StandaloneActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);

        Button buttonPlayVideo = (Button) findViewById(R.id.btnPlayVideo);
        Button buttonPlaylist = (Button) findViewById(R.id.btnPlaylist);

        buttonPlayVideo.setOnClickListener(this);
        buttonPlaylist.setOnClickListener(this);

        /*View.OnClickListener ourListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };

        buttonPlayVideo.setOnClickListener(ourListener);
        buttonPlaylist.setOnClickListener(ourListener);*/

    }

    @Override
    public void onClick(View v) {
        Intent intent = null;      //Static; can be used without creating an instant of a class

        switch(v.getId()){
            case R.id.btnPlayVideo:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID);
                break;

            case R.id.btnPlaylist:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST);
                break;

            default:

        }

     if (intent != null){       //Parsing intent, checks to see which button has been tapped to call the onclick method and then sets the data for a particular intent before calling startActivity
         startActivity(intent); //Abstract definition of an operation to be performed, not tied to any particular operation, used to launch activity
        }

    }

}
