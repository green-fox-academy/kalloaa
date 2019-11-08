package com.example.demo.repositories;

import com.example.demo.models.RPost;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPostRepository extends CrudRepository<RPost,Long> {
  @Query(value = "SELECT TOP x * FROM RPost ", nativeQuery = true)
  List<RPost> findTopX(int x);
}
