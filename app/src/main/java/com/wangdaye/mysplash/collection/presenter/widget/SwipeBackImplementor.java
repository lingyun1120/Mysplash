package com.wangdaye.mysplash.collection.presenter.widget;

import com.wangdaye.mysplash.common.i.presenter.SwipeBackPresenter;
import com.wangdaye.mysplash.common.i.view.SwipeBackView;

/**
 * Swipe back implementor.
 *
 * A {@link SwipeBackPresenter} for
 * {@link com.wangdaye.mysplash.collection.view.widget.CollectionPhotosView}.
 *
 * */

public class SwipeBackImplementor
        implements SwipeBackPresenter {
    // model & view.
    private SwipeBackView view;

    /** <br> life cycle. */

    public SwipeBackImplementor(SwipeBackView view) {
        this.view = view;
    }

    /** <br> presenter. */

    @Override
    public boolean checkCanSwipeBack(int dir) {
        return view.checkCanSwipeBack(dir);
    }
}
