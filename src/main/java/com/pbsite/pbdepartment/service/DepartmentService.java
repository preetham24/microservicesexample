package com.pbsite.pbdepartment.service;

import com.pbsite.pbdepartment.controller.DepartmentController;
import com.pbsite.pbdepartment.entity.Department;
import com.pbsite.pbdepartment.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    Logger log = LoggerFactory.getLogger(DepartmentService.class);

    public Department saveDepartment(Department department) {
        log.info("inside DepartmentService of DepartmentService ");
        return departmentRepository.save(department);
    }

    public Department getdepartmentyId(Long departmentId) {
        log.info("inside getdepartmentyId of DepartmentService ");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
