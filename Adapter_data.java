package app.sample.com.compost;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Nikhil Sharma on 10/25/2016.
 */

public class Adapter_data extends BaseAdapter {
    String names[];

int l;
    String images[],title,ratio;
    Activity context;

    public Adapter_data(Activity context, String names[], String[] images){
        this.context=context;
        this.names=names;
        this.images=images;
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);
        title = settings.getString("title","title");
        ratio = settings.getString("ratio","ratio");
        l = settings.getInt("length",0);
        Toast.makeText(context,"length is:"+l,Toast.LENGTH_LONG).show();
        Log.e("l is:",l+"");
    }



    @Override
    public int getCount()
    {
  return l;

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
//        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);
//         title = settings.getString("title","title");
//         ratio = settings.getString("ratio","ratio");
//        l = settings.getInt("length",0);
//        Toast.makeText(context,"length is:"+l,Toast.LENGTH_LONG).show();
//        Log.e("l is:",l+"");
        textViewName.setText(title);
        image.setText(ratio);

        return  listViewItem;
    }

}
