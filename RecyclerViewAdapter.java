package com.eugurerkinmenekse.retrofitjava2.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eugurerkinmenekse.retrofitjava2.R;
import com.eugurerkinmenekse.retrofitjava2.model.CryptoModel;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RowHolder>
{
    private String[] colors = {"#ffccff", "#ff0071", "#f9f871", "#121215", "#0400ff", "#c3b4a1", "#ff683e", "#6f91ff"};
    private ArrayList<CryptoModel> cryptoModelArrayList;

    public RecyclerViewAdapter(ArrayList<CryptoModel> cryptoModelArrayList) {
        this.cryptoModelArrayList = cryptoModelArrayList;
    }

    @NonNull
    @Override
    public RowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_layout, parent, false);
        return new RowHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RowHolder holder, int position) {
        holder.bind(cryptoModelArrayList.get(position), colors, position);
    }

    @Override
    public int getItemCount() {
        return cryptoModelArrayList.size();
    }

    public class RowHolder extends RecyclerView.ViewHolder {

        TextView textName;
        TextView textPrice;
        public RowHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(CryptoModel cryptoModel, String[] colors, int position)
        {
            itemView.setBackgroundColor(Color.parseColor(colors[position % 8]));
            textName = itemView.findViewById(R.id.text_name);
            textPrice = itemView.findViewById(R.id.text_price);
            textName.setText(cryptoModel.currency);
            textPrice.setText(cryptoModel.price);
        }
    }
}
