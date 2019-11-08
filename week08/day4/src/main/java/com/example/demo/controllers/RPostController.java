package com.example.demo.controllers;

import com.example.demo.models.RPost;
import com.example.demo.services.RPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RPostController {
  private RPostService rPostService;

  @Autowired
  public RPostController(RPostService rPostService) {
    this.rPostService = rPostService;
  }

  @GetMapping("/reddit")
  public String showIndex(Model model){
    model.addAttribute("posts",rPostService.loadNextPosts());
    return "index";
  }

  @PostMapping(value = "/reddit/loadmorepages")
  public String loadMorePages(){
    rPostService.increaseMaxPostsShown();
    return "redirect:/reddit";
  }

  @GetMapping("/reddit/new-post")
  public String showAddPage(){
    return "addpage";
  }

  @PostMapping(value = "/reddit/new-post/add")
  public String addNewPost(@RequestParam String name, @RequestParam String link){
    rPostService.addRPost(new RPost(name,link));
    return "redirect:/reddit";
  }

  @PostMapping (value = "/reddit/upvote/{PostId}")
  public String upvotePost(@PathVariable (name = "PostId") Long PostId){
    rPostService.upvoteScore(rPostService.getRPostById(PostId));
    return "redirect:/reddit";
  }

  @PostMapping (value = "/reddit/downvote/{PostId}")
  public String downvotePost(@PathVariable (name = "PostId") Long PostId){
    rPostService.downvoteScore(rPostService.getRPostById(PostId));
    return "redirect:/reddit";
  }


}
