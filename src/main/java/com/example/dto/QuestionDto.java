package com.example.dto;

import com.example.model.User;
import lombok.Data;

@Data
public class QuestionDto {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer comment_count;
    private Integer view_count;
    private Integer like_count;
    private Integer creator;
    private User user;
}
