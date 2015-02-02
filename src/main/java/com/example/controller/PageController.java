package com.example.controller;

import com.example.domain.Page;
import com.example.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anshumandutta on 2/1/15.
 */
@RestController
@RequestMapping("/page")
public class PageController {

    @Autowired
    PageService pageService;


    @RequestMapping(value= "seed", method = RequestMethod.GET)
    public String seedPage(){
        List<Page> pages = new ArrayList<Page>();
        Page page = new Page();
        page.setPageKey("key1");
        page.setPageValue("value1");
        pages.add(page);

        page = new Page();
        page.setPageKey("key2");
        page.setPageValue("value2");
        pages.add(page);

        pageService.saveAllPage(pages);
        return "done";
    }
}
