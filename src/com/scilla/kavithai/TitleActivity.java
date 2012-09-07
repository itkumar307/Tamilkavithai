package com.scilla.kavithai;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.google.ads.AdRequest;
import com.google.ads.AdView;

public class TitleActivity extends ListActivity {

	String[] values;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("manikk", "mani1");
		// requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.title);
		Log.i("manikk", "mani2");
		// getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,
		// R.layout.titlebar);
		// getListView().setBackgroundResource(R.drawable.allback);
		try {
			values = new String[] { getString(R.string.amma),
					getString(R.string.appa),
					getString(R.string.nanbanidam_irunthu),
					getString(R.string.yennavalay), getString(R.string.yakkar),
					getString(R.string.natpu_kathal),
					getString(R.string.pitithu_petikamal),
					getString(R.string.unnodu_vaalgaiyil),
					getString(R.string.valimai_antha_un_natpu),
					getString(R.string.irantha_pin),
					getString(R.string.thodarppukku) };
			setListAdapter(new KavithaiAdapter(this, values));
			AdView adView = (AdView) this.findViewById(R.id.ad);
			adView.loadAd(new AdRequest());
		} catch (Exception e) {
			Log.e("TitleActivity", e.getMessage(), e);
		}
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		try {
			Intent n = new Intent(TitleActivity.this, poem.class);
			n.putExtra("selectTitle", values[position]);
			startActivity(n);
		} catch (Exception e) {
			Log.e("TitleActivity onListItemClick", e.getMessage(), e);
		}

	}
}