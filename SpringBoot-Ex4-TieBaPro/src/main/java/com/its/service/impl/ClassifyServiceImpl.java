package com.its.service.impl;

import com.its.mapper.ClassifyMapper;
import com.its.po.Classify;
import com.its.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClassifyServiceImpl implements ClassifyService {

    @Autowired
    private ClassifyMapper classifyMapper;

    @Override
    public List<Classify> findClassifyList() {
        return classifyMapper.selectAll();
    }
}
