package com.example.squeezeit;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class PlaybackActivity extends Activity {

	  @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_playback);	
	        
/*	        
	        m_trackListView = (ListView) findViewById(R.id.trackView);
	        m_trackListView.setAdapter(new ArrayAdapter<String>(this, R.layout.drawer_listview_item, m_trackListViewItems));
	       
	        m_trackListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> parent, View viewClicked,
						int position, long id) {
									String message = "You clicked position " + position;
					Toast.makeText(TrackActivity.this, message, Toast.LENGTH_LONG)
							.show();
					
					//Intent playbackIntent = new Intent(TrackActivity.this, PlaybackActivity.class);
					//startActivity(playbackIntent);
				}
			});
*/	        
	        
	  }

}
