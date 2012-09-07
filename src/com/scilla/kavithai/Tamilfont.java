package com.scilla.kavithai;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class Tamilfont extends TextView {

	public Tamilfont(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}

	public Tamilfont(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public Tamilfont(Context context) {
		super(context);
		init();
	}

	private void init() {
		if (!isInEditMode()) {
			Typeface tf = Typeface.createFromAsset(getContext().getAssets(),
					"fonts/thvntsc.ttf");
			setTypeface(tf);
		}
	}

}