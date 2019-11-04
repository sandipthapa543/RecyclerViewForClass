package com.example.recyclerviewforclass;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewforclass.adapter.ContactsAdapter;
import com.example.recyclerviewforclass.model.Contacts;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    String name;
    String phoneN0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);

        List<Contacts> contactsList=new ArrayList<>();
        contactsList.add(new Contacts (name="Dahayang",phoneN0="9803543625",R.drawable.dahayang));
        contactsList.add(new Contacts (name="Bhuwan",phoneN0="980354363444",R.drawable.bhuwan));
        contactsList.add(new Contacts (name="Saugat",phoneN0="980354362455",R.drawable.saugat));

        ContactsAdapter contactsAdapter=new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}
