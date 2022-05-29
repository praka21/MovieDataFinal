package com.prateek.test.moviedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listView;
    private MyAdapter adapter;
    private LinearLayoutManager linearManager;
    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.recyclerview);
        linearManager = new LinearLayoutManager(this);
        listView.setLayoutManager(linearManager);
        listView.setHasFixedSize(true);

        //need to do this on different thread later
        data = getAssetJsonData(getApplicationContext());

    }

    @Override
    protected void onResume() {
        super.onResume();

        //can be moved to different thread later
        Type type = new TypeToken<Root>(){}.getType();
        Root list = new Gson().fromJson(data, type);

        List<Result> result = list.getResults();

        Log.e("Prateek", list.toString());
        adapter =new MyAdapter(this ,result);
        listView.setAdapter(adapter);
    }

    public static String getAssetJsonData(Context context) {
        String json;
        try {
            InputStream is = context.getAssets().open("input.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}