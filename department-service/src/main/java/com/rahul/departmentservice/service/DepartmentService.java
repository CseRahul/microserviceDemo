package com.rahul.departmentservice.service;

import com.rahul.departmentservice.entity.Department;
import com.rahul.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("inside saveDepartment method of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartment(Long departmentId) {
        log.info("inside findDepartment method of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
