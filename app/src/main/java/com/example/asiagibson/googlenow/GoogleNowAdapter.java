package com.example.asiagibson.googlenow;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

public class GoogleNowAdapter extends RecyclerView.Adapter {

    private final int YELPCARD = 0, TRANSLATECARD = 1, REMINDERCARD = 2;

    // The items to display in the RecyclerView
    List<GoogleNowCard> mList = Arrays.asList(
            new ReminderCard(),
            new YelpCard(),
            new TranslateCard(),
            new ReminderCard(),
            new YelpCard(),
            new TranslateCard(),
            new ReminderCard(),
            new YelpCard(),
            new TranslateCard(),
            new ReminderCard(),
            new YelpCard(),
            new TranslateCard(),
            new ReminderCard(),
            new YelpCard(),
            new TranslateCard(),
            new ReminderCard(),
            new YelpCard(),
            new TranslateCard(),
            new ReminderCard(),
            new YelpCard(),
            new TranslateCard(),
            new ReminderCard(),
            new YelpCard(),
            new TranslateCard(),
            new ReminderCard(),
            new YelpCard(),
            new TranslateCard(),
            new ReminderCard(),
            new YelpCard(),
            new TranslateCard(),
            new ReminderCard(),
            new YelpCard(),
            new TranslateCard(),
            new ReminderCard(),
            new YelpCard(),
            new TranslateCard()
    );

    /*
    // Constructor
    public GoogleNowAdapter(List<GoogleNowCard> items) {
        this.mList = items;
    }
     */

    // Responsible for creating a ViewHolder based on the type of the item view
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null; // double check that this can be done
        switch (viewType) {
            case YELPCARD:
                viewHolder = new YelpViewHolder(parent);
                break;
            case TRANSLATECARD:
                viewHolder = new TranslateViewHolder(parent);
                break;
            case REMINDERCARD:
                viewHolder = new ReminderViewHolder(parent);
                break;
        }
        return viewHolder;
    }

    // Updates RecyclerView's contents with the item that's at the given position
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case YELPCARD:
                YelpViewHolder yelpViewHolder = (YelpViewHolder) holder;
                GoogleNowCard nowCard = mList.get(position);
                yelpViewHolder.bind(nowCard);
                break;
            case TRANSLATECARD:
                TranslateViewHolder translateViewHolder = (TranslateViewHolder) holder;
                GoogleNowCard nowCard1 = mList.get(position);
                translateViewHolder.bind(nowCard1);
                break;
            case REMINDERCARD:
                ReminderViewHolder reminderViewHolder = (ReminderViewHolder) holder;
                GoogleNowCard nowCard2 = mList.get(position);
                reminderViewHolder.bind(nowCard2);
                break;
        }
    }

    // Checks the type of the itemView and returns the int associated with that itemView
    @Override
    public int getItemViewType(int position) {
        if (mList.get(position) instanceof YelpCard) {
            return YELPCARD;
        } else if (mList.get(position) instanceof TranslateCard) {
            return TRANSLATECARD;
        } else if (mList.get(position) instanceof ReminderCard) {
            return REMINDERCARD;
        }
        return -1;
    }

    // Return size of dataset
    @Override
    public int getItemCount() {
        return mList.size();
    }
}