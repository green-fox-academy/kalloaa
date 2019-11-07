package com.example.demo.repositories;

import com.example.demo.models.Assignee;
import com.example.demo.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee,Long> {
  Assignee findAssigneeByName(String name);
}
