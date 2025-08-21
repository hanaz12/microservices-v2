package com.example.school_service.Repository;

import com.example.school_service.Model.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}
