package com.rtrk.gallery.gridgallery;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

import com.rtrk.gallery.R;

public class GridGalleryExampleActivity extends Activity {
	GridView gridView;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grid);

		GridView gridView = (GridView) findViewById(R.id.gridview);
		gridView.setAdapter(new GridAdapter(this));

		gridView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				Toast.makeText(getBaseContext(),
						"pic" + (position + 1) + " selected",
						Toast.LENGTH_SHORT).show();
			}
		});
	}
}