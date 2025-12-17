package com.example.demo.controller;
@RestController
public class StudentController(){
    @Autowired
    StudentService ser;


    @PostMapping("/adddata")
    public class createData(@RequestBody Student stu){
        return stu.createData;
    }

    @GetMapping("/fetchdata")
    public List<Student>fetchRecord(){
        return ser.fetchRecord();
    }
}