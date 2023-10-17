package ru.netology.stats;

public class StatsService {
    public long calculateTotalSales(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public double calculateAverageSales(long[] sales) {
        double totalSales = calculateTotalSales(sales);
        return totalSales / sales.length;
    }

    public int findMaxSalesMonth(long[] sales) {
        long maxSales = sales[0];
        int maxSalesMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                maxSalesMonth = i;
            }
        }
        return maxSalesMonth + 1;
    }

    public int findMinSalesMonth(long[] sales) {
        long minSales = sales[0];
        int minSalesMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < minSales) {
                minSales = sales[i];
                minSalesMonth = i;
            }
        }
        return minSalesMonth + 1;
    }

    public int countMonthsBelowAverage(long[] sales) {
        long countMonthsBelowAverageSales = sales[0];
        int averageSalesMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > countMonthsBelowAverageSales) {
                countMonthsBelowAverageSales = sales[i];
                averageSalesMonth = i;
            }
        }
        return averageSalesMonth + 1;
    }

    public int countMonthsAboveAverage(long[] sales) {
        double averageSales = calculateAverageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > averageSales) {
                count++;
            }
        }
        return count;
    }
}