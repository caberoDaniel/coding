package org.fundacionjala.coding.danielcabero.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by administrator on 3/10/2017.
 */
public class RegularTest {

    /**
     * Test to verify the amount if the rented days
     * for a Regular movie is less than 2 e.g. 1
     */
    @Test
    public void testCalculateAmountWhenTheRentedDaysIsLessThanThree() {
        // given:
        Regular regularInstance = new Regular("Test");

        // when:
        final double actualResult = regularInstance.calculateAmount(1);

        // then
        final double expectedResult = 2;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Test to verify the amount if the rented days
     * for a Regular movie is greater than 2 e.g. 10
     */
    @Test
    public void testCalculateAmountWhenTheRentedDaysIsGreaterThanThree() {
        // given:
        Regular regularInstance = new Regular("Test");

        // when:
        final double actualResult = regularInstance.calculateAmount(10);

        // then:
        final double expectedResult = 14;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Test to verify the frequent renter points for a Regular movie
     * is 1 for different rented days.
     */
    @Test
    public void testCalculateFrequentRenterPointsVerifyTheResultIsOne() {
        // given:
        Regular regularInstance = new Regular("Test");

        // when:
        final int actualResultOne = regularInstance.frequentPointsRenter(1);

        // then:
        final int expectedResultOne = 1;
        assertEquals(expectedResultOne, actualResultOne);

        // given: regularInstance

        // when:
        final int actualResultTwo = regularInstance.frequentPointsRenter(3);

        // then:
        final int expectedResultTwo = 1;
        assertEquals(expectedResultTwo, actualResultTwo);

        // give: regularInstance

        // when:
        final int actualResultThree = regularInstance.frequentPointsRenter(1000);

        // then:
        final int expectedResultThree = 1;
        assertEquals(actualResultThree, expectedResultThree);
    }

}
