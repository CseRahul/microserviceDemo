package com.rahul.departmentservice.controller;

import com.rahul.departmentservice.entity.Department;
import com.rahul.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/")
    public Department SaveDepartment(@RequestBody Department department){
        log.info("inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{departmentId}")
    public Department findDepartmentById(@PathVariable Long departmentId){
        log.info("inside findDepartmentById method of DepartmentController");
        return departmentService.findDepartment(departmentId);
    }
}
