package com.iscreamedu.test.api.student.controller;

import com.iscreamedu.test.api.student.domain.Subject;
import com.iscreamedu.test.api.student.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/subject")
@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;



    @GetMapping("r")
    public List<Subject> getRSubjectList(){
        return subjectService.getRSubjectList();
    }


}
