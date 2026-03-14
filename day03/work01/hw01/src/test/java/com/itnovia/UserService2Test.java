package com.itnovia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.*;

public class UserService2Test {

    EmpService service = new EmpService();
    @ParameterizedTest
    @ValueSource(strings = {"610110201909091231", "110110201509091109", "510310198812120931"})
    public void testAll(String idcard) {
        System.out.println("idcard: " + idcard);
        System.out.println("isBeijing:" + service.isBeijing(idcard));
        System.out.println("getAge:" + service.getAge(idcard));
        System.out.println("getGender:" + service.getGender(idcard));
        System.out.println("getYear:" + service.getYear(idcard));
        System.out.println("getMonth:" + service.getMonth(idcard));
    }
}
