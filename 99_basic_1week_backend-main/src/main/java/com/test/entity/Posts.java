package com.test.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.test.Dto.PostsRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends Timestamped {


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
//    @JsonIgnore
    private Long id;

    @Column(nullable = false)
    private String username;

    @JsonIgnore
    @Column(nullable = false)
    private String password;

//    @JsonIgnore
    @Column(nullable = false)
    private String post;

    @Column(nullable = false)
    private String title;



//    @Column(nullable = false)
//    private LocalDateTime modifiedtime;

//    public Posts(String username, String password, String post){
//        this.username = username;
//        this.password = password;
//        this.post = post;
//
//    }

    public Posts(PostsRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.username = requestDto.getUsername();
        this.password = requestDto.getPassword();
        this.post = requestDto.getPost();

    }


    public void update(PostsRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.username = requestDto.getUsername();
        this.password = requestDto.getPassword();
        this.post = requestDto.getPost();

    }
//    public Posts(PostssRequest_testDto postssRequest_testDto){
//        this.title = postssRequest_testDto.getTitle();
//        this.username = postssRequest_testDto.getUsername();
//        this.post = postssRequest_testDto.getPost();
//    }



}
