package com.project.VacationManagerProject;

import javax.persistence.*;

@Entity
@Table(name = "users_table")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
}
