package com.paddu.springdatajdbc.controller;


import com.paddu.springdatajdbc.domain.Emp;
import com.paddu.springdatajdbc.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/db")
@RestController
public class DbController {

    @Autowired
    private DbService service;

//    @PostMapping
//    public String save(@RequestBody Emp emp) {
//        service.saveOperation(
//                emp.getId(),
//                emp.getName(),
//                emp.getDob(),
//                emp.getManager()
//        );
//        return "Employee";
//
//    }

    @PostMapping(value = "/v2")
    public String saveV2(@RequestBody Emp emp) {
        service.saveOpV2(emp);
        return "Employee Saved";
    }

    @GetMapping   //http://localhost:8080/db
    public @ResponseBody
    List<Emp> employees() {
        return service.findEmployees();

    }


    @PutMapping // PUT -> http://localhost:8080/db/
    public String promoteEmployee(@RequestBody Emp emp) {
        service.promoteEmployee(emp);
        return "Employee Updated Successfully";
    }
}
