package com.example.sullo.golfbuddy.Adaptor;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sullo.golfbuddy.Model.ListItems;
import com.example.sullo.golfbuddy.R;

import java.util.List;

/**
 * Created by sullo on 30/01/2018.
 */

//used to bind row with list view and our data (listItems)

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
    private List<ListItems> listItems;

    public MyAdapter(Context context, List listitem) {
        this.context = context;
        this.listItems = listitem;
    }

//inflate the xml list_main_screen and return as viewholder with all properties
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//view holds list_main_screen view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_main_screen, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        ListItems item = listItems.get(position);
        holder.name.setText(item.getName());
        //holder.image.setI(item.getImage());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }
//holds all the items from the cardLatout in list_main_screen
    public class ViewHolder extends RecyclerView.ViewHolder {
    public ImageView image;
    public TextView name;

        public ViewHolder(View itemView) {
            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.image);
            name = (TextView) itemView.findViewById(R.id.title);
        }
    }
}
