package com.BikkadIT.StudentDatabase.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.StudentDatabase.model.Student;

public interface StudentRepository extends JpaRepository<Student, String>{

}
