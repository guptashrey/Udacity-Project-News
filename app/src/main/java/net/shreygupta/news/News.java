package net.shreygupta.news;

/**
 * Created by Shrey Gupta on 14/08/17.
 */

class News {

    final String mUrl;
    private final String mTitle;
    private final String mAuthor;
    private final String mDate;
    private final String mSection;

    News(String title, String author, String url, String date, String section) {
        mTitle = title;
        mAuthor = author;
        mUrl = url;
        mDate = date;
        mSection = section;
    }

    String getTitle() {
        return mTitle;
    }

    String getAuthor() {
        return mAuthor;
    }

    String getDate() {
        return mDate;
    }

    String getSection() {
        return mSection;
    }
}