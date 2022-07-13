package com.company.test;

import com.company.main.GradeCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeCalculatorTest {
    // test for each grade
    @Test
    void testAThree() {
        assertEquals('A', GradeCalculator.calculateGrade(240, 3));
    }

    @Test
    void testBThree() {
        assertEquals('B', GradeCalculator.calculateGrade(210, 3));
    }

    @Test
    void testCThree() {
        assertEquals('C', GradeCalculator.calculateGrade(180, 3));
    }

    @Test
    void testFThree() {
        assertEquals('F', GradeCalculator.calculateGrade(179, 3));
    }

    @Test
    void testAFour() {
        assertEquals('A', GradeCalculator.calculateGrade(320, 4));
    }

    @Test
    void testBFour() {
        assertEquals('B', GradeCalculator.calculateGrade(280, 4));
    }

    @Test
    void testCFour() {
        assertEquals('C', GradeCalculator.calculateGrade(240, 4));
    }

    @Test
    void testFFour() {
        assertEquals('F', GradeCalculator.calculateGrade(239, 4));
    }


    // boundary value test
    @Test
    void aHighGradeThreeCredit() {
        assertEquals('A', GradeCalculator.calculateGrade(300, 3));
    }

    @Test
    void aLowGradeThreeCredit() {
        assertEquals('A', GradeCalculator.calculateGrade(239.5, 3));
    }

    @Test
    void bHighGradeThreeCredit() {
        assertEquals('B', GradeCalculator.calculateGrade(239.4, 3));
    }

    @Test
    void bLowGradeThreeCredit() {
        assertEquals('B', GradeCalculator.calculateGrade(209.5, 3));
    }

    @Test
    void cHighGradeThreeCredit() {
        assertEquals('C', GradeCalculator.calculateGrade(209.4, 3));
    }

    @Test
    void cLowGradeThreeCredit() {
        assertEquals('C', GradeCalculator.calculateGrade(179.5, 3));
    }

    @Test
    void fHighGradeThreeCredit() {
        assertEquals('F', GradeCalculator.calculateGrade(179.4, 3));
    }

    @Test
    void fLowGradeThreeCredit() {
        assertEquals('F', GradeCalculator.calculateGrade(0, 3));
    }

    @Test
    void aHighGradeFourCredit() {
        assertEquals('A', GradeCalculator.calculateGrade(400, 4));
    }

    @Test
    void aLowGradeFourCredit() {
        assertEquals('A', GradeCalculator.calculateGrade(319.5, 4));
    }

    @Test
    void bHighGradeFourCredit() {
        assertEquals('B', GradeCalculator.calculateGrade(319.4, 4));
    }

    @Test
    void bLowGradeFourCredit() {
        assertEquals('B', GradeCalculator.calculateGrade(279.5, 4));
    }

    @Test
    void cHighGradeFourCredit() {
        assertEquals('C', GradeCalculator.calculateGrade(279.4, 4));
    }

    @Test
    void cLowGradeFourCredit() {
        assertEquals('C', GradeCalculator.calculateGrade(239.5, 4));
    }

    @Test
    void fHighGradeFourCredit() {
        assertEquals('F', GradeCalculator.calculateGrade(239.4, 4));
    }

    @Test
    void fLowGradeFourCredit() {
        assertEquals('F', GradeCalculator.calculateGrade(0, 4));
    }

    // invalid input test that exceeds the upper and lower bound
    @Test
    void invalidCredit0() {
        assertThrows(IllegalArgumentException.class, () -> {
            GradeCalculator.calculateGrade(300, 0);
        });
    }

    @Test
    void invalidCredit5(){
        assertThrows(IllegalArgumentException.class, () -> {
            GradeCalculator.calculateGrade(100, 5);
        });
    }

    @Test
    void invalidCreditNegative(){
        assertThrows(IllegalArgumentException.class, () -> {
            GradeCalculator.calculateGrade(100, -1);
        });
    }

    @Test
    void invalidScoreGreaterThanUpperBoundFourCredit() {
        assertThrows(IllegalArgumentException.class, () -> {
            GradeCalculator.calculateGrade(400.1, 4);
        });
    }

    @Test
    void invalidScoreLessThanLowerBoundFourCredit() {
        assertThrows(IllegalArgumentException.class, () -> {
            GradeCalculator.calculateGrade(-0.1, 4);
        });
    }

    @Test
    void invalidScoreGreaterThanUpperBoundThreeCredit() {
        assertThrows(IllegalArgumentException.class, () -> {
            GradeCalculator.calculateGrade(300.1, 3);
        });
    }

    @Test
    void invalidScoreLessThanLowerBoundThreeCredit() {
        assertThrows(IllegalArgumentException.class, () -> {
            GradeCalculator.calculateGrade(-0.1, 3);
        });
    }
}