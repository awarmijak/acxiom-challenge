package com.example.acxiomchallenge.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter

public class Apps {
    @Id
    private Long licenseNumber;
    private String lastName;
    private String firstName;
    private String middleName;
    private String city;
    private String state;
    private String status;
    private String issueDate;
    private String expirationDate;
    private String boardAction;

    @Override
    public String toString() {
        return "Apps{" +
                "licenseNumber=" + licenseNumber +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", status='" + status + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", boardAction='" + boardAction + '\'' +
                '}';
    }
}

