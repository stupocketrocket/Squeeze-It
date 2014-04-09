package com.example.squeezeit;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
 
public class MainActivity extends FragmentActivity implements View.OnClickListener{
 
    private String[] drawerListViewItems;
    private DrawerLayout drawerLayout;
    private ListView drawerListView;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private ListView m_albumListView;
    private String[] m_albumListViewItems = {"Album 1", "Album 2", "Album 3"};
    
    private List<Button> m_buttonList = new ArrayList<Button>();
    private ArrayAdapter<String> m_adapter;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
        	setContentView(R.layout.activity_main);
        }
        catch (Exception ex)
        {
        	return;
        }
        
        Button button;
        
        button = (Button)findViewById(R.id.a);
        m_buttonList.add(button);
        button = (Button)findViewById(R.id.b);
        m_buttonList.add(button);
        button = (Button)findViewById(R.id.c);
        m_buttonList.add(button);
        button = (Button)findViewById(R.id.d);
        m_buttonList.add(button);
        button = (Button)findViewById(R.id.e);
        m_buttonList.add(button);
        button = (Button)findViewById(R.id.f);
        m_buttonList.add(button);
        button = (Button)findViewById(R.id.g);
        m_buttonList.add(button);
        button = (Button)findViewById(R.id.h);
        m_buttonList.add(button);
        button = (Button)findViewById(R.id.i);
        m_buttonList.add(button);
        
        ListView list = (ListView) findViewById(R.id.listAlbums);

        // defining Adapter for List content

        m_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        list.setAdapter(m_adapter);
        
 
        m_albumListView = list;
        
        //m_albumListView.setAdapter(new ArrayAdapter<String>(this, R.layout.drawer_listview_item, m_albumListViewItems));
        
        m_albumListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View viewClicked,
					int position, long id) {
								String message = "You clicked position " + position;
				Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG)
						.show();
				
				Intent trackIntent = new Intent(MainActivity.this, TrackActivity.class);
				startActivity(trackIntent);
			}
		});
      
        // get list items from strings.xml
        drawerListViewItems = getResources().getStringArray(R.array.items);
        // get ListView defined in activity_main.xml
        drawerListView = (ListView) findViewById(R.id.left_drawer);
 
        // Set the adapter for the list view
        drawerListView.setAdapter(new ArrayAdapter<String>(this,
                R.layout.drawer_listview_item, drawerListViewItems));
 
        // 2. App Icon
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
 
        // 2.1 create ActionBarDrawerToggle
        actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,                  /* host Activity */
                drawerLayout,         /* DrawerLayout object */
                R.drawable.ic_drawer,  /* nav drawer icon to replace 'Up' caret */
                R.string.drawer_open,  /* "open drawer" description */
                R.string.drawer_close  /* "close drawer" description */
                );
 
        // 2.2 Set actionBarDrawerToggle as the DrawerListener
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
 
        // 2.3 enable and show "up" arrow
        getActionBar().setDisplayHomeAsUpEnabled(true);
 
        // just styling option
        drawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
 
        drawerListView.setOnItemClickListener(new DrawerItemClickListener());
    }
 
    @Override
    public void onClick(View v) 
    {
    	m_adapter.clear();
        int id = v.getId();
        switch (id) 
        {
            case R.id.a:
            //setContentView(R.layout.screen1);
            	m_adapter.add("AAA");
            	m_adapter.add("AAA");
            	m_adapter.add("AAA");
            	m_adapter.add("AAA");            	
            break;

            case R.id.b:
            	m_adapter.add("BBB");            	
            	m_adapter.add("BBB");            	
            	m_adapter.add("BBB");
            	m_adapter.add("BBB");            	
            //setContentView(R.layout.screen2);
            break;

            case R.id.c:
            	m_adapter.add("CCC");
            	m_adapter.add("CCC");
            	m_adapter.add("CCC");
            	m_adapter.add("CCC");            	
            //setContentView(R.layout.screen3);
            break;
            
            case R.id.d:
            	m_adapter.add("DDD");
            	m_adapter.add("DDD");
            	m_adapter.add("DDD");            	
            	m_adapter.add("DDD");            	
            //setContentView(R.layout.screen3);
            break;     
            
            case R.id.e:
            	m_adapter.add("EEE");
            	m_adapter.add("EEE");            	
            	m_adapter.add("EEE");
            	m_adapter.add("EEE");            	
            //setContentView(R.layout.screen3);
            break;            
            
            case R.id.f:
            	m_adapter.add("FFF");
            	m_adapter.add("FFF");            	
            	m_adapter.add("FFF");
            	m_adapter.add("FFF");            	
            //setContentView(R.layout.screen3);
            break;
            
            case R.id.g:
            	m_adapter.add("GGG");
            	m_adapter.add("GGG");            	
            	m_adapter.add("GGG");
            	m_adapter.add("GGG");            	
            //setContentView(R.layout.screen3);
            break;
            
            case R.id.h:
            	m_adapter.add("HHH");
            	m_adapter.add("HHH");            	
            	m_adapter.add("HHH");
            	m_adapter.add("HHH");            	
            //setContentView(R.layout.screen3);
            break;
            
            case R.id.i:
            	m_adapter.add("III");
            	m_adapter.add("III");            	
            	m_adapter.add("III");
            	m_adapter.add("III");    
               	m_adapter.add("III");
            	m_adapter.add("III");            	
            	m_adapter.add("III");
            	m_adapter.add("III");         
               	m_adapter.add("IIII");
            	m_adapter.add("IIII");            	
            	m_adapter.add("IIII");
            	m_adapter.add("IIII");                     	
               	m_adapter.add("IIIIII");
            	m_adapter.add("IIIIII");            	
            	m_adapter.add("IIIIII");
            	m_adapter.add("IIIIII");            	
            //setContentView(R.layout.screen3);
            break;            
        }
        
        m_adapter.notifyDataSetChanged();
    }
    
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
         actionBarDrawerToggle.syncState();
    }
 
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        actionBarDrawerToggle.onConfigurationChanged(newConfig);
    }
 
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
 
         // call ActionBarDrawerToggle.onOptionsItemSelected(), if it returns true
        // then it has handled the app icon touch event
 
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
 
    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView parent, View view, int position, long id) {
            Toast.makeText(MainActivity.this, ((TextView)view).getText(), Toast.LENGTH_LONG).show();
            drawerLayout.closeDrawer(drawerListView);
 
        }
    }
}



















