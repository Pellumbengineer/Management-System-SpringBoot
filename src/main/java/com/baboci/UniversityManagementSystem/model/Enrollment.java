package com.baboci.UniversityManagementSystem.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

enum Grade{
    A,B,C,D,E,F
}

@Entity
@Table(name = "tbl_enrollment")
@Getter
@Setter
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enrollment_id")
    private Integer id;

    @Column(name = "grade")
    private Grade grade;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE, CascadeType.DETACH})
    @JoinColumn(name="course_id")
    private Course courseID;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE, CascadeType.DETACH})
    @JoinColumn(name="student_id")
    private Student studentID;

    @Override
    public String toString(){
        return "Enrollment [id=" + id + ", Course ID=" + courseID +
                ", Student ID=" + studentID + "Grade="+ grade +"]";
    }

}
