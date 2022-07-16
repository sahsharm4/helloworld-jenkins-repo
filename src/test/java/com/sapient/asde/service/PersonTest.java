package com.sapient.asde.service;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@Tag("Person POJO Test")
class PersonTest {
    private Person person;

    @BeforeEach
    void setUp() {
        person=
                new Person(123445671223L,"Ravi Kumar",
                        LocalDate.of(1995,10,15),"New Delhi",9876787689L);
    }

    @AfterEach
    void tearDown() {
        person=null;
    }

    @Test
    void getAdharCardForValidData() {
        assertEquals(123445671223L,person.getAdharCard());
    }


    @Test
    void getAdharCardForInValidData() {
        assertNotEquals(123445671200L,person.getAdharCard());
    }

    @Disabled
    @Test
    void setAdharCard() {
    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void getBirthdate() {
    }

    @Test
    void setBirthdate() {
    }

    @Test
    void getAddress() {
    }

    @Test
    void setAddress() {
    }

    @Test
    void getMobile() {
    }

    @Test
    void setMobile() {
    }

    @Test
    void testToString() {
    }
}