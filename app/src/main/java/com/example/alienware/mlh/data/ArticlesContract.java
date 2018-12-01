package com.example.alienware.mlh.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

public class ArticlesContract {
    static final String CONTENT_AUTHORITY = "com.example.alienware.mlh";
    static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    static final String PATH = "articles";

    private ArticlesContract() {

    }
    public static final class ArticleEntry implements BaseColumns {
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH);
        public static final String TABLE_NAME = "Articles";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_ARTICLE_TITLE = "Title";
        public static final String COLUMN_ARTICLE_URL = "Url";
        public static final String COLUMN_ARTICLE_PICTURE = "Image";

        static final String CONTENT_LIST_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH;
        static final String CONTENT_ITEM_TYPE = ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" +PATH;
    }
}
