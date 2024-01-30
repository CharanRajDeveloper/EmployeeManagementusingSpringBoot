package com.ems.EmployeeManagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


// this is creating JPA entity
/*JPA stands for Java Persistence API. 
It is an object-relational mapping (ORM) framework that allows us 
to map Java objects to tables in a relational database.*/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity   /*The @Entity annotation in Spring Boot is used to map a Java class to a database table. 
           It is a javax.persistence.Entity annotation.
            It is used to tell Spring Boot that the class is an entity and 
            that it should be persisted to the database.*/
@Table(name = "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email_id",nullable = false,unique = true)
	private String email;

}
