package com.scilla.kavithai;

import java.util.HashMap;
import java.util.Map;

import android.content.Context;

public class PoemMap {
	Context ctx;
	Map<String, String> poem = new HashMap<String, String>();

	public PoemMap(Context ctx) {
		this.ctx = ctx;
		getMap();
	}

	public Map<String, String> getMap() {
		poem.put(ctx.getString(R.string.appa), ctx.getString(R.string.APPA));
		poem.put(ctx.getString(R.string.amma), ctx.getString(R.string.AMMA));
		poem.put(ctx.getString(R.string.yakkar), ctx.getString(R.string.YAKKAR));
		poem.put(ctx.getString(R.string.irantha_pin),
				ctx.getString(R.string.IRANTHA_PIN));
		poem.put(ctx.getString(R.string.nanbanidam_irunthu),
				ctx.getString(R.string.NANBANIDAM_IRUNTHU));
		poem.put(ctx.getString(R.string.natpu_kathal),
				ctx.getString(R.string.NATPU_KATHAL));
		poem.put(ctx.getString(R.string.pitithu_petikamal),
				ctx.getString(R.string.PETIPATHU_PETIKATHATHU));
		poem.put(ctx.getString(R.string.unnodu_vaalgaiyil),
				ctx.getString(R.string.UNNODU_VAALKAYIL));
		poem.put(ctx.getString(R.string.valimai_antha_un_natpu),
				ctx.getString(R.string.VALUMAI_ANATHA_UN_NATPU));
		poem.put(ctx.getString(R.string.yennavalay),
				ctx.getString(R.string.YENNAVALEY));
		poem.put(ctx.getString(R.string.thodarppukku),
				ctx.getString(R.string.contact));
		return poem;
	}

	public String getString(String key) {
		return poem.get(key);
	}
}