package com.jpa.SpringJpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.SpringJpa.entity.Project;

public interface ProjectRepository extends JpaRepository<Project,Long>{
	List<Project> findByTitle(String title);
}
