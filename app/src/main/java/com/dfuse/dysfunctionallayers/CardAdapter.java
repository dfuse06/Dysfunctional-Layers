package com.dfuse.dysfunctionallayers;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dfuse on 5/22/16.
 */
public class CardAdapter  extends RecyclerView.Adapter<CardAdapter.ViewHolder>{
    List<HeaderData> mItems;


    public CardAdapter() {
        super();
        mItems = new ArrayList<HeaderData>();
        HeaderData broken = new HeaderData();
        broken.setName("Red Skull");
        broken.setThumbnail(R.drawable.redskull);
        mItems.add(broken);

        broken= new HeaderData();
        broken.setName("Blue Frost 2");
        broken.setThumbnail(R.drawable.bluefrost2);
        mItems.add(broken);

        broken= new HeaderData();
        broken.setName("Fuck Xda (Green)");
        broken.setThumbnail(R.drawable.fuckxda1);
        mItems.add(broken);

        broken= new HeaderData();
        broken.setName("Fuck Xda (Black)");
        broken.setThumbnail(R.drawable.fuckxda2);
        mItems.add(broken);

        broken= new HeaderData();
        broken.setName("Fuck Xda (Red)");
        broken.setThumbnail(R.drawable.fuckxda3);
        mItems.add(broken);

        broken= new HeaderData();
        broken.setName("Fuck Xda (Blue)");
        broken.setThumbnail(R.drawable.fuckxda);
        mItems.add(broken);

        broken= new HeaderData();
        broken.setName("Sharks and Lasers");
        broken.setThumbnail(R.drawable.sharksandlasers);
        mItems.add(broken);



    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        HeaderData broken = mItems.get(i);
        viewHolder.brokenHeader.setText(broken.getName());
        viewHolder.imgThumbnail.setImageResource(broken.getThumbnail());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imgThumbnail;
        public TextView brokenHeader;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            brokenHeader = (TextView)itemView.findViewById(R.id.broken_text);
        }
    }
}

