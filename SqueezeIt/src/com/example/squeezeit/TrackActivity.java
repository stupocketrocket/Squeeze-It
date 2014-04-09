package com.example.squeezeit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class TrackActivity extends Activity {

    private ListView m_trackListView;
    private String[] m_trackListViewItems = {"Track 1", "Track 2", "Track 3", "Track 4", "Track 5", 
    										 "Track 6", "Track 7", "Track 8", "Track 9", "Track 10"};
	
	  @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_track);	
	        
	        m_trackListView = (ListView) findViewById(R.id.trackView);
	        m_trackListView.setAdapter(new ArrayAdapter<String>(this, R.layout.drawer_listview_item, m_trackListViewItems));
	       
	        m_trackListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> parent, View viewClicked,
						int position, long id) {
									String message = "You clicked position " + position;
					Toast.makeText(TrackActivity.this, message, Toast.LENGTH_LONG)
							.show();
					
					Intent playbackIntent = new Intent(TrackActivity.this, PlaybackActivity.class);
					startActivity(playbackIntent);
				}
			});
	        
	        
	  }

}
