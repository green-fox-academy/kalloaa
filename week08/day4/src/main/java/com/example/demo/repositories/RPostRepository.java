package com.example.demo.repositories;

import com.example.demo.models.RPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPostRepository extends CrudRepository<RPost,Long> {
}
