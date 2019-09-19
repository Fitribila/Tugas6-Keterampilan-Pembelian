package com.gtabila.Emina;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

abstract class ListEminaAdapter extends RecyclerView.Adapter<ListEminaAdapter.ListViewHolder>{
    private ArrayList<DataEmina> listLaptop;

    public ListEminaAdapter(ArrayList<DataEmina> list) {
        this.listLaptop = list; }


    @NonNull @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_emina, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final DataEmina dataEmina =listLaptop.get(position);
        Glide.with(holder.itemView.getContext()).load(dataEmina.getFoto())
                .apply(new RequestOptions())
                .into(holder.foto);

        holder.namaEmina.setText(dataEmina.getNama());
        holder.beliButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.itemView.getContext(), "Berhasil membeli " + dataEmina.getNama(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return listLaptop.size(); }


    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView foto;
        TextView namaEmina;
        Button beliButton;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            foto = itemView.findViewById(R.id.foto);
            namaEmina = itemView.findViewById(R.id.nama);
            beliButton = itemView.findViewById(R.id.beli); }

    }
}
