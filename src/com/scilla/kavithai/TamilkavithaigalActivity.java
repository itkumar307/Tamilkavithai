package com.scilla.kavithai;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class TamilkavithaigalActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        goToNextActivity(2000);
	}
		public void goToNextActivity(int homeScreenWaitTimeInt) {
			new Handler().postDelayed(new Runnable() {
				public void run() {
					gotoMenuPage();
				
				}
			}, homeScreenWaitTimeInt);
		}
		private void gotoMenuPage() {
			Intent mainIntent = new Intent(TamilkavithaigalActivity.this,
					TitleActivity.class);
			startActivity(mainIntent);
			this.finish();	
		}
}