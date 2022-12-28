package com.example.zeitaufzeichnung;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class CardsAdapter extends ArrayAdapter<CardModel> {
    public CardsAdapter(Context context) {
        super(context, R.layout.task);
    }

    @NonNull @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = inflater.inflate(R.layout.task, parent, false);
            holder = new ViewHolder(convertView);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        CardModel model = getItem(position);
        holder.examName.setText(model.getExamName());
        holder.examDate.setText(model.getExamDate());
        holder.examMessage.setText(model.getExamMessage());

        return convertView;
    }

    static class ViewHolder {
        TextView examName;
        TextView examDate;
        TextView examMessage;

        ViewHolder(View view) {
            examName = view.findViewById(R.id.examName);
            examDate = view.findViewById(R.id.examDate);
            examMessage = view.findViewById(R.id.examMessage);
        }
    }
}