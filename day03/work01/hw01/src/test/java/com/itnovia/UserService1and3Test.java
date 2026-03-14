package com.itnovia;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Optional;

import static org.junit.Assert.*;

public class UserService1and3Test {

    EmpService service = new EmpService();

    @Test
    public void testIsBeijing() {
        assertTrue(service.isBeijing("110101199001011234"));
        assertFalse(service.isBeijing("300101199001011235"));
    }

    @Test
    public void testGetAge() {
        assertEquals((Integer) 36, service.getAge("110101199001011234"));
    }

    @Test
    public void testGetGender() {
        assertEquals("男", service.getGender("110101199001011234"));
        assertEquals("女", service.getGender("110101199001011285"));
    }

    @Test
    public void testGetYear() {
        assertEquals("1990", service.getYear("110101199001011234"));
    }

    @Test
    public void testGetMonth() {
        assertEquals("01", service.getMonth("110101199001011234"));
    }
}
