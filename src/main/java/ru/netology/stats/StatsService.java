package ru.netology.stats;

public class StatsService {

    public static long summarySales(long[] sales) {
        long monthSummary = 0;
        for (long sale : sales) {
            monthSummary = monthSummary + sale;
        }
        return monthSummary;
    }

    public static long averageSales(long[] sales) {
        long average = summarySales(sales) / sales.length;

        return average;
    }

    public static int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public static int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale < sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    public static int underAverageSales(long[] sales) {
        int lowerThenAverage = 0;

        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                lowerThenAverage = lowerThenAverage + 1;
            }
        }
        return lowerThenAverage;
    }

    public static int upperAverageSales(long[] sales) {
        int higherThenAverage = 0;

        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                higherThenAverage = higherThenAverage + 1;
            }
        }
        return higherThenAverage;
    }
}