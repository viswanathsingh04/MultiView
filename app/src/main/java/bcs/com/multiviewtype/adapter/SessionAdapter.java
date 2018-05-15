package bcs.com.multiviewtype.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import bcs.com.multiviewtype.R;
import bcs.com.multiviewtype.model.Data;

/**
 * Author: VPS
 * Created on 15-05-2018
 */
public class SessionAdapter extends RecyclerView.Adapter<SessionAdapter.ViewHolder> {
    private Context mContext;
    private List<Data> mDataList;

    public SessionAdapter(Context context, List<Data> dataList) {
        this.mContext = context;
        this.mDataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_session_adapter, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        final Data entity = mDataList.get(position);
        holder.textView.setText(entity.getName());

    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textv);
        }
    }

}
