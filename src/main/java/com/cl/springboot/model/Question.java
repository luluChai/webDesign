package com.cl.springboot.model;

import lombok.Data;

@Data
public class Question {

  private Integer id;
  private String title;
  private String description;
  private long gmtCreate;
  private long gmtModified;
  private Integer creator;
  private Integer commonCount;
  private Integer viewCount;
  private Integer likeCount;
  private String tag;
}
