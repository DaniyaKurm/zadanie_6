package ru.netology.stats;

public class StatsService {
    public long calculateTotalSales(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public float calculateAverageSales(long[] sales) {
        float totalSales = calculateTotalSales(sales);
        return totalSales / sales.length;
    }

    public int findMaxSalesMonth(long[] sales) {
        int maxSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxSalesMonth]) {
                maxSalesMonth = i;
            }
        }
        return maxSalesMonth + 1;
    }

    public int findMinSalesMonth(long[] sales) {
        int minSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minSalesMonth]) {
                minSalesMonth = i;
            }
        }
        return minSalesMonth + 1;
    }

    public int countMonthsBelowAverage(long[] sales) {
        double averageSales = calculateAverageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < averageSales) {
                count++;
            }
        }
        return count;
    }

    public int countMonthsAboveAverage(long[] sales) {
        float averageSales = calculateAverageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > averageSales) {
                count++;
            }
        }
        return count;
    }
}

