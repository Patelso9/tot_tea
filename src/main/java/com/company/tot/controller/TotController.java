package com.company.tot.controller;

import com.company.tot.dto.TeaTypes;
import com.company.tot.repository.TeaTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TotController {

    @Autowired
    TeaTypeRepository teaTypeRepository;

    @GetMapping("/teaType")
    public  List<TeaTypes> getAllTeaType(){
        return teaTypeRepository.findAll();
    }

    @PostMapping("teaType")
    public TeaTypes addTeaType(@RequestBody TeaTypes teaTypes){
        TeaTypes tt = teaTypeRepository.save(teaTypes);
        return tt;
    }


}
