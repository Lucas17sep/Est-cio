package com.example.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TodoAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final ArrayList<String> tasks;

    public TodoAdapter(Context context, ArrayList<String> tasks) {
        super(context, 0, tasks);
        this.context = context;
        this.tasks = tasks;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String task = tasks.get(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1, parent, false);
        }
        TextView textViewTask = convertView.findViewById(android.R.id.text1);
        textViewTask.setText(task);
        return convertView;
    }
}
