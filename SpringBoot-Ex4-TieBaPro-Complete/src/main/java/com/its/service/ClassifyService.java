package com.its.service;

import com.its.po.Classify;

import java.util.List;

public interface ClassifyService {
    public List<Classify> findClassifyList();

    int addClassify(Classify classify);

    int deleteClassify(Classify classify);

    Classify findClassifyById(Classify classify);
}
