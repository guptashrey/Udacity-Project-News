package net.shreygupta.news;

/**
 * Created by shreygupta on 14/08/17.
 */

class News {

    String mUrl;
    private String mTitle;
    private String mAuthor;
    private String mDate;
    private String mSection;

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