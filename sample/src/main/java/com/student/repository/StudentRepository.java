package com.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.student.domain.Student;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student, Integer>{

	List<Student> findByName(@Param("name") String name);
	
	//@Query("SELECT s FROM STUDENT s where s.id = :id")
	Student findById(@Param("id") int id);
	
   // @Query("SELECT s.Name FROM STUDENT s where s.section = :section")
	List<Student> findBySection(@Param("section") String section);
}
