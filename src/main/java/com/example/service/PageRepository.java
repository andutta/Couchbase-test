package com.example.service;

import com.example.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by anshumandutta on 2/1/15.
 */
@Component
public interface PageRepository extends CrudRepository<Page, String> {

    List<Page> all();

}
