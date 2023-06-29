package com.ead.authuser.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "TB_USERS_COURSES")
public class UserCourseModel {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userCourseId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private UserModel user;

    @Column(nullable = false)
    private UUID courseId;

}
