package com.codepath.apps.restclienttemplate;

import androidx.recyclerview.widget.RecyclerView;

abstract class EndlessRecyclerViewScrollListener extends RecyclerView.OnScrollListener {
    public EndlessRecyclerViewScrollListener(Object p0) {
    }

    public abstract void onLoadMore(int page, int totalItemsCount, RecyclerView view);
}
