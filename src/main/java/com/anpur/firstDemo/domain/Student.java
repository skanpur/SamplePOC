package com.anpur.firstDemo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.util.Date;

@Document(collection = "studentInfo")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Student {

    @Id
    private int studentID;
    private String firstName;
    private String lastName;
    private String middleName;
    private Date dateOfBirth;
    private String gender;
    private Address CommunicationAddress;
    private Address permenetAddress;
}
