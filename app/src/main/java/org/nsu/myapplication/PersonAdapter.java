package org.nsu.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by iBrain on 02-11-2015.
 */
public class PersonAdapter extends ArrayAdapter<PersonItem> {
    public PersonAdapter(Context context, List<PersonItem> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_list, null, false);

        TextView nameTextView = (TextView)view.findViewById(R.id.item_name);
        TextView nickTextView = (TextView)view.findViewById(R.id.item_nick);
        ImageView imageView = (ImageView)view.findViewById(R.id.item_image);

        PersonItem personItem = getItem(position);

        nameTextView.setText(personItem.name);
        nickTextView.setText(personItem.nickName);
        imageView.setImageResource(personItem.imageResId);
        return view;
    }
}
