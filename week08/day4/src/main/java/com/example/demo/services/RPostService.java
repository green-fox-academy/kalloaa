package com.example.demo.services;

import com.example.demo.models.RPost;
import com.example.demo.repositories.RPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RPostService {
  private RPostRepository rPostRepository;

  @Autowired
  public RPostService(RPostRepository rPostRepository) {
    this.rPostRepository = rPostRepository;
  }

  public void upvoteScore(RPost rPost){
    rPost.setScore(rPost.getScore()+1);
  }

  public void downvoteScore( RPost rPost){
    rPost.setScore(rPost.getScore()-1);
  }




}
