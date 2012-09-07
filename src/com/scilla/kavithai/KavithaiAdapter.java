package com.scilla.kavithai;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
 
public class KavithaiAdapter extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;
 
	public KavithaiAdapter(Context context, String[] values) {
		super(context, R.layout.data_select_input_cardatat, values);
		this.context = context;
		this.values = values;
	}
 
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
		View rowView = inflater.inflate(R.layout.data_select_input_cardatat, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.titlename);
		
		textView.setText(values[position]);
 
		
		return rowView;
	}
}