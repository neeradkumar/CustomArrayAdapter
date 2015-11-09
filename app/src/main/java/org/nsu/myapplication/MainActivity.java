package org.nsu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //https://github.com/neeradkumar/CustomArrayAdapter\
    final ArrayList<PersonItem> personItems = new ArrayList<>();
    PersonAdapter nameAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] names = new String[]{"Atiar", "Saadman","Jabin","Arabi","Naheena","Nafis","Salat","Saiful"};
        ListView listView = (ListView)findViewById(R.id.list);

        PersonItem atiar = new PersonItem("Atiar","Swajan",R.drawable.panda);
        PersonItem jibne = new PersonItem("Kamal","Jibne",R.drawable.monkey);
        PersonItem nafis = new PersonItem("Nafis","UI",R.drawable.cat);

        personItems.add(atiar);
        personItems.add(jibne);
        personItems.add(nafis);

         nameAdapter =      new PersonAdapter(this, personItems);

        listView.setAdapter(nameAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view, int i, long id) {
                PersonItem personItem = personItems.get(i);
                personItem.nickName = "Clicked";
                nameAdapter.notifyDataSetChanged();
            }
        });
    }

    public void addPerson(View view){
        PersonItem newPerson = new PersonItem("Saadman","nick",R.drawable.cat);
        personItems.add(newPerson);
        nameAdapter.notifyDataSetChanged();
    }
}
