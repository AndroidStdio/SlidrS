package com.r0adkll.slidr.example;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.r0adkll.deadskunk.adapters.BetterRecyclerAdapter;
import com.r0adkll.slidr.example.model.AndroidOS;

import butterknife.ButterKnife;
import butterknife.InjectView;


/**
 * 适配器
 */
public class OSVersionAdapter extends BetterRecyclerAdapter<AndroidOS, OSVersionAdapter.OSViewHolder> {

    /**
     * 重写方法创建ViewHolder
     *
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public OSViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_item, parent, false);
        return new OSViewHolder(view);
    }

    /**
     * 绑定数据
     *
     * @param viewHolder
     * @param i
     */
    @Override
    public void onBindViewHolder(OSViewHolder viewHolder, int i) {
        super.onBindViewHolder(viewHolder, i);
        AndroidOS os = getItem(i);
        viewHolder.title.setText(os.name);
        viewHolder.description.setText(os.description);
    }

    /**
     * Viewholder
     */
    public static class OSViewHolder extends RecyclerView.ViewHolder {
        @InjectView(R.id.title)
        public TextView title;
        @InjectView(R.id.description)
        public TextView description;

        public OSViewHolder(View itemView) {
            super(itemView);
            ButterKnife.inject(this, itemView);
        }
    }

}
