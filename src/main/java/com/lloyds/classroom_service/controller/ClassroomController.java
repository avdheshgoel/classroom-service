package com.lloyds.classroom_service.controller;

import com.lloyds.classroom_service.exception.ClassroomNotFoundException;
import com.lloyds.classroom_service.model.Classroom;
import com.lloyds.classroom_service.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClassroomController {

    @Autowired
    ClassroomService classroomService;
    @GetMapping ("/classrooms")
    public List<Classroom> getAllClassrooms()
    {
        return classroomService.getAllClassrooms();
    }

    @GetMapping("/classroom/{id}")
    public ResponseEntity<Classroom> getClassroom(@PathVariable("id") int id) throws ClassroomNotFoundException {
        return new ResponseEntity<>(classroomService.getClassroomById(id), HttpStatus.OK);
    }

    @PostMapping("/classroom")
    private ResponseEntity<Classroom> saveClassroom(@RequestBody Classroom classroom) {
        return new ResponseEntity<>(classroomService.save(classroom), HttpStatus.OK);
    }

}
