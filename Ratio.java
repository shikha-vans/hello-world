package app.sample.com.compost;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class Ratio extends AppCompatActivity implements AdapterView.OnItemClickListener
{
    ListView lv;

    String[] title = new String[]{
            "Ashes,wood", "Cardboard, shredded", "Corn stalks", "Fruit waste",
            "Leaves", "Newspaper, shredded","Peanut shells","Pine needles","Sawdust","Straw","Wood chips",
            "Alfalfa", "Clover"," Coffee grounds", "Food waste", "Garden waste",
            "Grass clippings", "Hay","Manures","Seaweed","Vegetable scraps","Weeds"
    };
    String[] amount = new String[]{
            "25:1", "350:1", "75:1", "35:1",
            "60:1", "175:1","35:1","80:1","325:1","75:1","400:1","12:1","23:1",
            "20:1","20:1","30:1","20:1","25:1","15:1","19:1","25:1","30:1"
    };

    Map<String,String > map=new HashMap<String,String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratio);
        lv = (ListView) findViewById(R.id.lv);

        Adapter_list ss= new Adapter_list(this,title,amount);
        lv.setAdapter(ss);
        lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        map.put(title[i],amount[i]);
        Log.e("map value is:",map+"");
        for (Map.Entry<String,String> entry : map.entrySet()) {
            Log.e("gettingkey", entry.getKey()+"");
            Log.e("gettingvalue", entry.getValue()+"");

            int a=map.size();
            Log.e("gettingsize", a+"");
            SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor editor = settings.edit();
            editor.putString("title", entry.getKey());
            editor.putString("ratio", entry.getValue());
            editor.putInt("len gth",a);
            editor.commit();
        }
        Toast.makeText(getApplicationContext(),"You Clicked "+title[i]+" : "+amount[i], Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(getApplicationContext(),MainHeap.class);
//        intent.putExtra("map",map+"");
        startActivity(intent);

//

    }
}
