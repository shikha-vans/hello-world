package app.sample.com.compost;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Nikhil Sharma on 10/24/2016.
 */

public class Adapter_list extends BaseAdapter {
    String names[];


    String images[];
    Activity context;

    public Adapter_list(Activity context, String names[], String[] images){
        this.context=context;
        this.names=names;
        this.images=images;
    }



    @Override
    public int getCount() {
        return names.length;

    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_details, null, true);
        TextView textViewName = (TextView) listViewItem.findViewById(R.id.text);
        TextView image = (TextView) listViewItem.findViewById(R.id.ratio);
        textViewName.setText(names[i]);
        image.setText(images[i]);
        return  listViewItem;
    }




}



