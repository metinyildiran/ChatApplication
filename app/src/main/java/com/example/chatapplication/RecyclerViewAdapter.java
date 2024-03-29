package com.example.chatapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private List<String> chatMessages;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        String chatMessage = chatMessages.get(position);  //Recycler_list_view daki elemanın sırasını verir
        holder.chatMessage.setText(chatMessage);
    }

    @Override
    public int getItemCount() {  //Listedeki eleman sayısını verir
        return chatMessages.size();
    }

    public RecyclerViewAdapter(List<String> chatMessages) {
        this.chatMessages = chatMessages;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView chatMessage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            chatMessage =  itemView.findViewById(R.id.recycler_view_text_view);  //Recycler_list_row daki recycler_view_text_view TextView elemanı chatMessage a atar
        }
    }
}
