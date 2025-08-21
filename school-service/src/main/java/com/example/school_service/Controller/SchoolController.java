package com.example.school_service.Controller;

import com.example.school_service.Model.FullSchoolResponse;
import com.example.school_service.Model.School;
import com.example.school_service.Service.SchoolService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
@Slf4j
public class SchoolController {

    private final SchoolService service;
    private Logger logger = Logger.getLogger(this.getClass().getName());

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(
            @RequestBody School school
    ) {
        service.saveSchool(school);
    }

    @GetMapping
    public ResponseEntity<List<School>> findAllSchools() {
        return ResponseEntity.ok(service.findAllSchools());
    }

    @GetMapping("/with-students/{school-id}")
    public ResponseEntity<FullSchoolResponse> findAllSchools(
            @PathVariable("school-id") Integer schoolId
    ) {
        log.info(log.getClass().getName());
        return ResponseEntity.ok(service.findSchoolsWithStudents(schoolId));
    }
}