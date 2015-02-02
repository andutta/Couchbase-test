package com.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

import java.util.Arrays;
import java.util.List;

/**
 * Created by anshumandutta on 2/1/15.
 */
@Configuration
@EnableCouchbaseRepositories
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {
    @Override
    protected List<String> bootstrapHosts() {
        return Arrays.asList("localhost");
    }

    @Override
    protected String getBucketName() {
        return "flex-test";
    }

    @Override
    protected String getBucketPassword() {
        return "flex-test";
    }
}
