package com.laomao.interfaces;

import android.view.View;

/**
 * Created by laomao on 16/11/2.
 */

public interface OnListItemClickListener<T> {
    void onItemClick(View view, int position, T data);
}