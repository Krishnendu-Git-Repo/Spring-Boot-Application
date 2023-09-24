package com.crud.demo.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "tbl_student")
public class StudentProfile {
    @Id
	private Integer id;
	private String name;
	private String address;
	private Integer rollNo;
	private Integer age;
	@JsonFormat(shape= Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dob;
}
