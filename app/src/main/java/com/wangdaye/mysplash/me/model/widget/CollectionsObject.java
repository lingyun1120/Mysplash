package com.wangdaye.mysplash.me.model.widget;

import android.app.Activity;

import com.wangdaye.mysplash._common.data.data.Collection;
import com.wangdaye.mysplash._common.data.service.CollectionService;
import com.wangdaye.mysplash._common.i.model.CollectionsModel;
import com.wangdaye.mysplash._common.ui.adapter.CollectionAdapter;

import java.util.ArrayList;

/**
 * Collections object.
 * */

public class CollectionsObject
        implements CollectionsModel {
    // data
    private CollectionAdapter adapter;
    private CollectionService service;

    private int collectionsPage;

    private boolean refreshing;
    private boolean loading;
    private boolean over;

    /** <br> life cycle. */

    public CollectionsObject(Activity a) {
        this.adapter = new CollectionAdapter(a, new ArrayList<Collection>());
        adapter.setOwn(true);
        this.service = CollectionService.getService();

        this.collectionsPage = 0;

        this.loading = false;
        this.over = false;
    }

    /** <br> model. */

    @Override
    public CollectionAdapter getAdapter() {
        return adapter;
    }

    @Override
    public CollectionService getService() {
        return service;
    }

    @Override
    public Object getRequestKey() {
        return null;
    }

    @Override
    public void setRequestKey(Object key) {
        // do nothing.
    }

    @Override
    public String getCollectionsType() {
        return null;
    }

    @Override
    public void setCollectionsType(String order) {
        // do nothing.
    }

    @Override
    public int getCollectionsPage() {
        return collectionsPage;
    }

    @Override
    public void setCollectionsPage(int page) {
        collectionsPage = page;
    }

    @Override
    public boolean isRefreshing() {
        return refreshing;
    }

    @Override
    public void setRefreshing(boolean refreshing) {
        this.refreshing = refreshing;
    }

    @Override
    public boolean isLoading() {
        return loading;
    }

    @Override
    public void setLoading(boolean loading) {
        this.loading = loading;
    }

    @Override
    public boolean isOver() {
        return over;
    }

    @Override
    public void setOver(boolean over) {
        this.over = over;
    }
}
