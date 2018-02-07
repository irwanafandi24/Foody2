package com.example.miafandi.foody.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.miafandi.foody.R;

import java.util.ArrayList;
import java.util.List;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {

    List<EndangeredItem> mItems;

    public GridAdapter() {
        super();
        mItems = new ArrayList<EndangeredItem>();
        EndangeredItem jualan = new EndangeredItem();
        jualan.setName("Rawon Sapi Rendang");
        jualan.setThumbnail(R.drawable.grid1);
        jualan.setPrice("15000");
        mItems.add(jualan);

        jualan = new EndangeredItem();
        jualan.setName("Sumur Jengkol Pedas");
        jualan.setThumbnail(R.drawable.grid2);
        jualan.setPrice("10000");
        mItems.add(jualan);

        jualan = new EndangeredItem();
        jualan.setName("Tumis Kangkung Krispi");
        jualan.setThumbnail(R.drawable.grid3);
        jualan.setPrice("8000");
        mItems.add(jualan);

        jualan = new EndangeredItem();
        jualan.setName("Sambal Goreng Kulit");
        jualan.setThumbnail(R.drawable.grid4);
        jualan.setPrice("10000");
        mItems.add(jualan);

        jualan = new EndangeredItem();
        jualan.setName("Mie Mercon");
        jualan.setThumbnail(R.drawable.grid5);
        jualan.setPrice("13000");
        mItems.add(jualan);

        jualan = new EndangeredItem();
        jualan.setName("Tuna Bumbu Pedas");
        jualan.setThumbnail(R.drawable.grid6);
        jualan.setPrice("16000");
        mItems.add(jualan);

        jualan = new EndangeredItem();
        jualan.setName("Rawon Sapi Rendang");
        jualan.setThumbnail(R.drawable.grid1);
        jualan.setPrice("15000");
        mItems.add(jualan);

        jualan = new EndangeredItem();
        jualan.setName("Sumur Jengkol Pedas");
        jualan.setThumbnail(R.drawable.grid2);
        jualan.setPrice("10000");
        mItems.add(jualan);

        jualan = new EndangeredItem();
        jualan.setName("Tumis Kangkung Krispi");
        jualan.setThumbnail(R.drawable.grid3);
        jualan.setPrice("8000");
        mItems.add(jualan);

        jualan = new EndangeredItem();
        jualan.setName("Sambal Goreng Kulit");
        jualan.setThumbnail(R.drawable.grid4);
        jualan.setPrice("10000");
        mItems.add(jualan);

        jualan = new EndangeredItem();
        jualan.setName("Mie Mercon");
        jualan.setThumbnail(R.drawable.grid5);
        jualan.setPrice("13000");
        mItems.add(jualan);

        jualan = new EndangeredItem();
        jualan.setName("Tuna Bumbu Pedas");
        jualan.setThumbnail(R.drawable.grid6);
        jualan.setPrice("16000");
        mItems.add(jualan);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_view_home, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        EndangeredItem nature = mItems.get(i);
        viewHolder.namaMakanan.setText(nature.getName());
        viewHolder.bayar.setText(nature.getPrice());
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());
    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder  {


        public ImageView imgThumbnail;
        public TextView namaMakanan;
        public TextView bayar;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            namaMakanan = (TextView)itemView.findViewById(R.id.foodName);
            bayar = (TextView)itemView.findViewById(R.id.foodPrice);
        }
    }
}

