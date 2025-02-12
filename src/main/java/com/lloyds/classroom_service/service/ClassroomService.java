package com.lloyds.classroom_service.service;

import com.lloyds.classroom_service.exception.ClassroomNotFoundException;
import com.lloyds.classroom_service.model.Classroom;
import com.lloyds.classroom_service.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService {

    @Autowired
    ClassroomRepository classroomRepository;


    public List<Classroom> getAllClassrooms() {
        return classroomRepository.findAll();
    }

    public Classroom getClassroomById(int id) throws ClassroomNotFoundException {
        return classroomRepository.findById(id).orElseThrow(() -> new ClassroomNotFoundException("Classroom not found"));
    }
    public Classroom save(Classroom classroom) {
        return classroomRepository.save(classroom);
    }

    public int delete(int id) {
        classroomRepository.deleteById(id);
        return id;
    }
}
