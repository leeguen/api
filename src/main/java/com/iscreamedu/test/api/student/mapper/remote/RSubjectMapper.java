package com.iscreamedu.test.api.student.mapper.remote;

import com.iscreamedu.test.api.student.domain.Subject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RSubjectMapper {

    List<Subject> getRSubjectList();

}
