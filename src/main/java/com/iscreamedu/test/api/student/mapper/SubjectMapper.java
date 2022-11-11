package com.iscreamedu.test.api.student.mapper;

import com.iscreamedu.test.api.student.domain.Subject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SubjectMapper {

    List<Subject> getSubjectList();
}
