package org.nsu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] names = new String[]{"Atiar", "Saadman","Jabin","Arabi","Naheena","Nafis","Salat","Saiful"};
        ListView listView = (ListView)findViewById(R.id.list);

        PersonItem atiar = new PersonItem("Atiar","Swajan",R.drawable.panda);
        PersonItem jibne = new PersonItem("Kamal","Jibne",R.drawable.monkey);
        PersonItem nafis = new PersonItem("Nafis","UI",R.drawable.cat);
        ArrayList<PersonItem> personItems = new ArrayList<>();
        personItems.add(atiar);
        personItems.add(jibne);
        personItems.add(nafis);

        PersonAdapter nameAdapter =
                new PersonAdapter(this, personItems);

        listView.setAdapter(nameAdapter);
    }
}
