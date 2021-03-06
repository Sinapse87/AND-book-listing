package com.example.android.booklistingapp;

public class Books {

    //default Books Title holder
    private String mTitle;
    //default Books Authors Name holder
    private String mAuthors;
    //default published date of the books holder
    private String mPublishedDate;
    //default Preview Link holder
    private String mPreviewLink;

    /**
     * Constructor
     *
     * @param title
     * @param publishedDate
     * @param authors
     * @param previewLink
     */
    public Books(String title, String publishedDate, String authors, String previewLink) {
        this.mTitle = title;
        this.mPublishedDate = publishedDate;
        this.mAuthors = authors;
        this.mPreviewLink = previewLink;
    }

    /**
     * getter for the books title
     *
     * @return title
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * getter for books Authors Name
     *
     * @return Authors name
     */
    public String getAuthors() {
        return mAuthors;
    }

    /**
     * getter for getting published date of the books
     *
     * @return Published Date
     */
    public String getPublishedDate() {
        return mPublishedDate;
    }

    /**
     * getter for getting preview link
     *
     * @return Preview URL Link
     */
    public String getPreviewLink() {
        return mPreviewLink;
    }
}
