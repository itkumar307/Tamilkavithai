package com.scilla.kavithai;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.ads.AdRequest;
import com.google.ads.AdView;

public class poem extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.poems);
		//getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,
			//	R.layout.titlebar);
		try {

			Bundle bundle = getIntent().getExtras();
			Log.i("manikk", "mani1");
			String poem = bundle.getString("selectTitle");
			Log.i("manikk", poem);
			TextView itemImage = (TextView) findViewById(R.id.image);
			TextView title = (TextView) findViewById(R.id.title);
			TextView poems = (TextView) findViewById(R.id.poem);

			title.setText(poem);
			Log.i("manikk", poem);
			int image = (int) new ImageMap(getApplicationContext())
					.getImg(bundle.getString("selectTitle"));
			itemImage.setBackgroundResource(image);
			poems.setText(new PoemMap(getApplicationContext()).getString(poem));
			AdView adView = (AdView) this.findViewById(R.id.ad);
			adView.loadAd(new AdRequest());

		} catch (Exception e) {
			Log.e("poem", "" + e.getMessage());
		}
	}

}
