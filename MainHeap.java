package app.sample.com.compost;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainHeap extends AppCompatActivity implements AdapterView.OnItemClickListener{
TextView amounts,ratios;
    String title[],amount[];
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratio);
        lv=(ListView)findViewById(R.id.lv);
        Adapter_data ss= new Adapter_data(this,title,amount);
        lv.setAdapter(ss);
        lv.setOnItemClickListener(this);
//        amounts=(TextView)findViewById(R.id.amounts);
//        ratios=(TextView)findViewById(R.id.ratio);
////        Bundle bundle=getIntent().getExtras();
////        String a=bundle.getString("map");
////        Log.e("asa",a);
//        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(this);
//     title = settings.getString("title","title");
//         ratio = settings.getString("ratio","ratio");
//        amounts.setText(title);
//        ratios.setText(ratio);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//        Toast.makeText(getApplicationContext(),"You Clicked "+title[i]+" : "+amount[i], Toast.LENGTH_SHORT).show();

    }
}
