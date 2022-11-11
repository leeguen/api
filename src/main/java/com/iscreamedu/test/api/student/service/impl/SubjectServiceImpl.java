package com.iscreamedu.test.api.student.service.impl;

import com.iscreamedu.test.api.student.domain.Subject;
import com.iscreamedu.test.api.student.mapper.SubjectMapper;
import com.iscreamedu.test.api.student.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {


    @Autowired
    private SubjectMapper SubjectMapper;



    @Override
    public List<Subject> getSubjectList() {
        return SubjectMapper.getSubjectList();
    }


}
