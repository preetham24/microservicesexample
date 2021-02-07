package com.pbsite.pbdepartment.controller;

import com.pbsite.pbdepartment.entity.Department;
import com.pbsite.pbdepartment.service.DepartmentService;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {


    @Autowired
    private DepartmentService departmentService;

    Logger log = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("*/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId)
    {
        log.info("inside getDepartmentById of DepartmentController");
        return departmentService.getdepartmentyId(departmentId);
    }
}
