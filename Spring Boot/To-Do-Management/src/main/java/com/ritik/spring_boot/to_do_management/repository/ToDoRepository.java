package com.ritik.spring_boot.to_do_management.repository;

import com.ritik.spring_boot.to_do_management.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
