package com.scilla.kavithai;

import java.util.HashMap;

import android.content.Context;

public class ImageMap {
	Context ctx;
	HashMap<String, Integer> image = new HashMap<String, Integer>();

	public ImageMap(Context ctx) {
		this.ctx = ctx;
		getMap();
	}

	public HashMap<String, Integer> getMap() {
		image.put(ctx.getString(R.string.appa),
				Integer.valueOf(R.drawable.appa));
		image.put(ctx.getString(R.string.amma),
				Integer.valueOf(R.drawable.amma));
		image.put(ctx.getString(R.string.irantha_pin),
				Integer.valueOf(R.drawable.iranthapin));
		image.put(ctx.getString(R.string.yakkar),
				Integer.valueOf(R.drawable.yakkar));
		image.put(ctx.getString(R.string.yennavalay),
				Integer.valueOf(R.drawable.yennavaley));
		image.put(ctx.getString(R.string.nanbanidam_irunthu),
				Integer.valueOf(R.drawable.nanbanidamirunthu));
		image.put(ctx.getString(R.string.natpu_kathal),
				Integer.valueOf(R.drawable.natpukathal));
		image.put(ctx.getString(R.string.valimai_antha_un_natpu),
				Integer.valueOf(R.drawable.natpinvalimai));
		image.put(ctx.getString(R.string.pitithu_petikamal),
				Integer.valueOf(R.drawable.petithumpetikamalum));
		image.put(ctx.getString(R.string.unnodu_vaalgaiyil),
				Integer.valueOf(R.drawable.unnoduvalkaiyil));
		image.put(ctx.getString(R.string.thodarppukku),
				Integer.valueOf(R.drawable.email));

		return image;
	}

	public Integer getImg(String key) {
		return image.get(key);
	}
}