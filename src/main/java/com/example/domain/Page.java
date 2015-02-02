package com.example.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

/**
 * Created by anshumandutta on 2/1/15.
 */
@Document
public class Page {

    @Field
    @Id
    private String pageKey;

    @Field
    private String pageValue;

    public String getPageKey() {
        return pageKey;
    }

    public void setPageKey(String pageKey) {
        this.pageKey = pageKey;
    }

    public String getPageValue() {
        return pageValue;
    }

    public void setPageValue(String pageValue) {
        this.pageValue = pageValue;
    }
}
