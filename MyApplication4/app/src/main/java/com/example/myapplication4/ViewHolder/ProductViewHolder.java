package com.example.myapplication4.ViewHolder;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication4.Interface.ItemClickListner;
import com.example.myapplication4.R;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView txtProductName, txtProductDescription, txtProductPrice;
    public ImageView imageView;
    public ItemClickListner listner;
    public Button reserver;




    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.product_image);
        txtProductName = (TextView) itemView.findViewById(R.id.product_name);
        txtProductDescription = (TextView) itemView.findViewById(R.id.product_description);
        txtProductPrice = (TextView) itemView.findViewById(R.id.product_price);
        reserver=(Button) itemView.findViewById(R.id.reserver);




    }
    public void setItemClickListner(ItemClickListner listner)
    {
      this.listner= listner;
    }

    @Override
    public void onClick(View view) {
           listner.onClick(view, getAdapterPosition(),false);
    }
}
