package com.example.test.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@TableName("student")
public class Student {
    private String sno;
    private String sname;
    private String ssex;
    private Integer sage;
    private String sdept;
}
