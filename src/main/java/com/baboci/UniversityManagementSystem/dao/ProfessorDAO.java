package com.baboci.UniversityManagementSystem.dao;

import com.baboci.UniversityManagementSystem.model.Professor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProfessorDAO {

    void save(Professor professor);
    Professor get(int id);
    Page<Professor> get(Pageable pageable);
    void delete (int id);
    List<Professor> search(String keyword);
}
