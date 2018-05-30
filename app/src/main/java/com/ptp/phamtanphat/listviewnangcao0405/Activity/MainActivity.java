package com.ptp.phamtanphat.listviewnangcao0405.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.ptp.phamtanphat.listviewnangcao0405.Model.Monan;
import com.ptp.phamtanphat.listviewnangcao0405.Adapter.MonanAdapter;
import com.ptp.phamtanphat.listviewnangcao0405.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMonan;
    ArrayList<Monan> mangmonan;
    MonanAdapter monanAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMonan = findViewById(R.id.listview);
        mangmonan = new ArrayList<>();


        //Cach them du lieu dang mang object
        //Cach 1 :
//        Monan monan = new Monan("Mon cha",30000,R.drawable.moncha);
//        mangmonan.add(monan);

        //Cach 2 :
        mangmonan.add(new Monan("Mon cha",30000,R.drawable.moncha));
        mangmonan.add(new Monan("Mon cha gio",35000,R.drawable.monchagio));
        mangmonan.add(new Monan("Mon com suon",40000,R.drawable.moncomsuon));
        mangmonan.add(new Monan("Mon goi",45000,R.drawable.mongoi));
        mangmonan.add(new Monan("Mon ha cao",50000,R.drawable.monhacao));

        monanAdapter = new MonanAdapter(MainActivity.this,mangmonan);
        lvMonan.setAdapter(monanAdapter);
        lvMonan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, mangmonan.get(position).getTenmonan(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
