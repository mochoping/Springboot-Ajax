package com.kh.AjaxSpringProject.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Cafe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date openingTime;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date closingTime;
    private String description;
}
