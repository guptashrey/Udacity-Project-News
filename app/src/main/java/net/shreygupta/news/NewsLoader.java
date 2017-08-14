package net.shreygupta.news;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by Shrey Gupta on 14/08/17.
 */

class NewsLoader extends AsyncTaskLoader<List<News>> {

    private final String mUrl;

    NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        return QueryUtils.fetchNews(mUrl);
    }
}