package com.prateek.test.moviedata;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.List;

class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private static final String BASEURL = "https://image.tmdb.org/t/p/w500";

    List<Result> inputList;
    Context context;

    public MyAdapter(Context cnt, List<Result> result) {
        context = cnt;
        inputList = result;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(
                parent.getContext());
        View v = inflater.inflate(R.layout.item_view, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Picasso.get()
                .load(BASEURL + inputList.get(position).getPosterPath())
                .into(holder.image, new Callback() {
                    @Override
                    public void onSuccess() {
                        Log.e("Prateek","Loaded");
                    }

                    @Override
                    public void onError(Exception e) {
                       e.printStackTrace();
                    }
                });


        holder.name.setText(inputList.get(position).getTitle());
        holder.description.setText(inputList.get(position).getOverview());
        holder.itemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DescActivity.class);
                intent.putExtra("Object",inputList.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return inputList.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{

        ImageView image;
        TextView name;
        TextView description;
        LinearLayout itemLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image= itemView.findViewById(R.id.imageView);
            name= itemView.findViewById(R.id.title_1);
            description= itemView.findViewById(R.id.description);
            itemLayout = itemView.findViewById(R.id.item_layout);
        }
    }

}
