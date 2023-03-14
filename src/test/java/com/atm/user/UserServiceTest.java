package com.atm.user;

import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumingThat;

@RunWith(MockitoJUnitRunner.class)
class UserServiceTest {
    private static final Logger log = LoggerFactory.getLogger(UserModelTest.class);

    @Mock
    UserModel userModel;

//    @InMock
//    UserModel userModel;




    @AfterEach
    void tearDown() {
        log.info("@AfterEach - executed after each test method.");
        System.out.println(userModel);
    }

    @AfterAll
    static void done() {
        log.info("@AfterAll - executed after all test methods.");
    }
    @Test
    void createUser() {
    }

    @Test
    @DisplayName("Sing test")
    void signIn() {
//        assumeFalse(true);
//        assumingThat(
//                true, () -> assertEquals(2 + 2, 4)
//        );
        int[] numbers = {0, 1, 2, 3, 4};
        assertAll("numbers",
                () -> assertEquals(numbers[0], 0),
                () -> assertEquals(numbers[3], 3),
                () -> assertEquals(numbers[4], 4)
        );
    }

    @Disabled
    @Test
    void credit() {
    }
}