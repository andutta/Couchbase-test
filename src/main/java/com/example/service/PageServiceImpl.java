package com.example.service;

import com.example.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by anshumandutta on 2/1/15.
 */
@Component("PageService")
public class PageServiceImpl implements PageService {

    @Autowired
    private PageRepository pageRepository;

    @Override
    public List<Page> getPages() {
        return pageRepository.all();
    }

    @Override
    public Page getPage(String key) {
        return pageRepository.findOne(key);
    }

    @Override
    public void savePage(Page page) {
        pageRepository.save(page);
    }

    @Override
    public void saveAllPage(List<Page> pages) {
        for (Page page:pages) {
            pageRepository.save(page);
        }
    }
}
