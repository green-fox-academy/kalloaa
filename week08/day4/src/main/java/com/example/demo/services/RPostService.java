package com.example.demo.services;

import com.example.demo.models.RPost;
import com.example.demo.repositories.RPostRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RPostService {
  private RPostRepository rPostRepository;

  @Autowired
  public RPostService(RPostRepository rPostRepository) {
    this.rPostRepository = rPostRepository;
  }
  private int maxPostsShown = 10;

  public List<RPost>loadNextPosts(){
   return rPostRepository.findTopX(maxPostsShown);
  }

  public void increaseMaxPostsShown(){
    maxPostsShown+=10;
  }

  public void addRPost(RPost rPost){
    rPostRepository.save(rPost);
  }

  public RPost getRPostById(Long Id){
    return rPostRepository.findById(Id).orElse(null);
  }

  public void upvoteScore(RPost rPost){
    rPost.setScore(rPost.getScore()+1);
  }

  public void downvoteScore( RPost rPost){
    rPost.setScore(rPost.getScore()-1);
  }


}
