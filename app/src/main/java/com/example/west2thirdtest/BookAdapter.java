package com.example.west2thirdtest;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {
    private List<Book> mBookList;
    static  class ViewHolder extends RecyclerView.ViewHolder {
        TextView bookName;
        LinearLayout linearLayout;
        ViewHolder(View view) {
            super(view);
            bookName=view.findViewById(R.id.book_name);
            linearLayout = view.findViewById(R.id.name_layout);
        }

    }

    public BookAdapter(List<Book> mBookList) {
        this.mBookList = mBookList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate
                (R.layout.book_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Book book = mBookList.get(i);
        viewHolder.bookName.setText(book.getName());
        viewHolder.linearLayout.setBackgroundColor(book.getColor());
    }

    @Override
    public int getItemCount() {
        return mBookList.size();
    }
}