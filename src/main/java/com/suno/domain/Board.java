package com.suno.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Board {
    @Id @GeneratedValue
    private String seq;
    private String name;
    private String password;
    private String content;
    private Date Date = new Date();
}
