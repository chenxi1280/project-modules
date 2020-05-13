package com.qf.pojo.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserQuery {

    private Long userId;

    private Date minTime;

    private Date maxTime;

    private String likeText;



}
