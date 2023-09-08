package com.example.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    private String sno;
    private String sname;
    private String ssex;
    private Integer sage;
    private String sdept;
}
