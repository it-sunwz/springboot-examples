package com.its.po;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "posts")
public class Posts {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer posts_id;

    private String posts_theme;
    private String posts_content;
    private String posts_author;
    private String posts_public_time;
    private Integer classify_id;
}
