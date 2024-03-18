package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    public void calculateSumTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        long expectedSum = 180;
        long actualSum = service.calculateSum(sales);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void calculateAverageTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        double expectedAverage = 15;
        double actualAverage = service.calculateAverage(sales);

        assertEquals(expectedAverage, actualAverage, 0.001);
    }

    @Test
    public void countMonthsBelowAverageTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int expectedMonthsBelowAverage = 4;
        int actualMonthsBelowAverage = service.countMonthsBelowAverage(sales);

        assertEquals(expectedMonthsBelowAverage, actualMonthsBelowAverage);
    }

    @Test
    public void countMonthsAboveAverageTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int expectedMonthsAboveAverage = 7;
        int actualMonthsAboveAverage = service.countMonthsAboveAverage(sales);

        assertEquals(expectedMonthsAboveAverage, actualMonthsAboveAverage);
    }

    @Test
    public void findMaxMonthTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int expectedMaxMonth = 7;
        int actualMaxMonth = service.findMaxMonth(sales);

        assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void findMinMonthTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int expectedMinMonth = 0;
        int actualMinMonth = service.findMinMonth(sales);

        assertEquals(expectedMinMonth, actualMinMonth);
    }
}
