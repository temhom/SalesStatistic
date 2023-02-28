import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {


    @Test
    public void calcSummarySales() {

        StatsService statsService = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = StatsService.summarySales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcAverageSales() {

        StatsService statsService = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = StatsService.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcMaxSalesMonth() {

        StatsService statsService = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = StatsService.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcMinSalesMonth() {

        StatsService statsService = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = StatsService.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void calcUnderAverage() {

        StatsService statsService = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = StatsService.underAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcUpperAverage() {

        StatsService statsService = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = StatsService.upperAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}