package com.its.po;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Data
@Table(name = "classify")
public class Classify {
    @Id
    @KeySql(useGeneratedKeys = true) //数据回显
    private Integer classify_id;

    private String classify_name;

    private String classify_create_time;
    //@Transient可以注释临时非数据库字段
}
