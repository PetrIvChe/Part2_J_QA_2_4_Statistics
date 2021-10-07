import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StatisticsBySalesTest {

    StatisticsBySales service = new StatisticsBySales();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalculateSumSale() {
        //SatatisticsBySales service = new SatatisticsBySales();
        //int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        long actual = service.sumSale(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateaveragesSum() {
        //SatatisticsBySales service = new SatatisticsBySales();
        //int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        double actual = service.averageSumSale(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxSales() {
        int expected = 8;
        double actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinSales() {
        int expected = 9;
        double actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculatelessThenAverageSumSale() {
        long expected = 11; //возвращает только последний месяц
        long actual = service.lessThenAverageSumSale(sales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateMoreThenAverageSumSale() {
        long expected = 12; //возвращает только последний месяц
        long actual = service.moreThenAverageSumSale(sales);
        assertEquals(expected, actual);
    }
}


