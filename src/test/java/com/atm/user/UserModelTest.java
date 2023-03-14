package com.atm.user;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

class UserModelTest {
    private static final Logger log = LoggerFactory.getLogger(UserModelTest.class);

    @BeforeAll
    static void setup() {
        log.info("@BeforeAll - executes once before all test methods in this class");
    }

    @BeforeEach
    void init() {
        log.info("@BeforeEach - executes before each test method in this class");
    }


}


