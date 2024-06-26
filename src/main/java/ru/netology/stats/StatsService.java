package ru.netology.stats;

public class StatsService {

    //1. Сервис для рассчёта суммы всех продаж за месяц
    public long salesAmount(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    //2.Сервис для рассчёта средней суммы продаж за месяц
    public long calcAverage(long[] sales) {
        long average = 0;
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
            average = sum / sales.length;
        }
        return average;
    }

    //3. Сервис для поиска номера месяца, в который был максимум продаж (на макс. сумму)
    public int getMaxSalesMonth(long[] sales) {
        int maxSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSalesMonth]) {
                maxSalesMonth = i;
            }
        }
        return maxSalesMonth + 1;
    }

    //4. Сервис для поиска номера месяца,в который был минимум продаж (на мин. сумму)
    public int getMinSalesMonth(long[] sales) {

        //изначально продаж 0
        int minSalesMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minSalesMonth]) {
                minSalesMonth = i;
            }
        }
        return minSalesMonth;

    }

    //5. Сервис для рассчёта количества месяцев, в которых продажи были ниже среднего
    public int getSalesBelowAverage(long[] sales) {
        int belowAverage = 0;
        long saleAverage = calcAverage(sales);

        for (long sale : sales) {
            if (sale < saleAverage) {
                belowAverage++;
            }

        }
        return belowAverage;

    }

    //6. Сервис для рассчёта количества месяцев, в которых продажи были выше среднего
    public int getSalesAboveAverage(long[] sales) {
        int aboveAverage = 0;
        long saleAverage = calcAverage(sales);

        for (long sale : sales) {
            if (sale > saleAverage) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }

}