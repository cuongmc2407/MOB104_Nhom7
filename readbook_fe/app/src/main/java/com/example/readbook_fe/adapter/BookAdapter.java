package com.example.readbook_fe.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.readbook_fe.R;
import com.example.readbook_fe.fragment.DetailBook;
import com.example.readbook_fe.model.Book;
import com.squareup.picasso.Picasso;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder>{
    private Context context;
    private List<Book> bookList;

    public BookAdapter(Context context) {
        this.context = context;
    }

    public void setDataBook(List<Book> bookList) {
        this.bookList = bookList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book, parent, false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        Book book = bookList.get(position);
        if (book == null) {
            return;
        }

//        String currentImageUrl = holder.image_imgbook.getTag();
        Picasso.get().load(book.getCoverImage()).placeholder(R.drawable.imageload).error(R.drawable.imageload).into(holder.image_imgbook);
        holder.tv_bookname.setText(book.getName());
        holder.relativeLayout.setOnClickListener(view -> {
            FragmentManager fragmentManager = ((AppCompatActivity) view.getContext()).getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.layout_content, DetailBook.newInstance(book.get_id())).addToBackStack(null).commit();
        });
    }

    @Override
    public int getItemCount() {
        return bookList == null ? 0 : bookList.size();
    }

    public class BookViewHolder extends RecyclerView.ViewHolder {
        ImageView image_imgbook;
        TextView tv_bookname;
        RelativeLayout relativeLayout;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            image_imgbook = itemView.findViewById(R.id.image_imgbook);
            tv_bookname = itemView.findViewById(R.id.tv_bookname);
            relativeLayout = itemView.findViewById(R.id.item_book);
        }
    }
}
