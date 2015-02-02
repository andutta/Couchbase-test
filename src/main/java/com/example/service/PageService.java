package com.example.service;

import com.example.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by anshumandutta on 2/1/15.
 */

public interface PageService {

    public List<Page> getPages();
    public Page getPage(String key);
    public void savePage(Page page);
    public void saveAllPage(List<Page> pages);

}
