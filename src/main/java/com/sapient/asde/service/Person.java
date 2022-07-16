package com.sapient.asde.service;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

/*
        Create tester class for Person testing getter, setter and constructor methods
        Code coverage:  >90%
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {
    private Long adharCard;
    private String name;
    private LocalDate birthdate;
    private String address;
    private Long mobile;


//    public Person(){
//
//    }
//
//    public Person(Long adharCard, String name, LocalDate birthdate, String address, Long mobile) {
//        this.adharCard = adharCard;
//        this.name = name;
//        this.birthdate = birthdate;
//        this.address = address;
//        this.mobile = mobile;
//    }
//
//    public Long getAdharCard() {
//        return adharCard;
//    }
//
//    public void setAdharCard(Long adharCard) {
//        this.adharCard = adharCard;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public LocalDate getBirthdate() {
//        return birthdate;
//    }
//
//    public void setBirthdate(LocalDate birthdate) {
//        this.birthdate = birthdate;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public Long getMobile() {
//        return mobile;
//    }
//
//    public void setMobile(Long mobile) {
//        this.mobile = mobile;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "adharCard=" + adharCard +
//                ", name='" + name + '\'' +
//                ", birthdate=" + birthdate +
//                ", address='" + address + '\'' +
//                ", mobile=" + mobile +
//                '}';
//    }

    /*
        Violating single state of responsibility
     */
//    public void showPersonDetailsOnConsole(List<Person> personList){
//        //TO DO
//    }
}
