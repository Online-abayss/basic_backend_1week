package com.test.Dto;

import com.test.entity.Posts;
import com.test.entity.Timestamped;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@NoArgsConstructor

public class GetAllResponseDto {


    private Long id;

    private String title;

    private String post; // content

    private String username;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;

    public GetAllResponseDto(Posts posts){

        this.id = posts.getId();
        this.title = posts.getTitle();
        this.post = posts.getPost();
        this.username = posts.getUsername();
        this.createdAt = posts.getCreatedAt();
        this.modifiedAt = posts.getModifiedAt();

    }


//          List<GetAllResponseDto> getallResponseDtoList = new ArrayList<>();
}
