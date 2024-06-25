package ru.netology.stats;

public class StatsService {

    //1. Сервис для рассчёта суммы всех продаж за месяц
    public int salesAmount(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    //2.Сервис для рассчёта средней суммы продаж за месяц
    public int calcAverage(int[] sales) {
        int average = 0;
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
            average = sum / sales.length;
        }
        return average;
    }

    //3. Сервис для поиска номера месяца, в который был максимум продаж (на макс. сумму)
    public int getMaxSalesMonth(int[] sales) {
        int maxSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSalesMonth]) {
                maxSalesMonth = i;
            }
        }
        return maxSalesMonth;
    }

    //4. Сервис для поиска номера месяца,в который был минимум продаж (на мин. сумму)
    public int getMinSalesMonth(int[] sales) {

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
    public int getSalesBelowAverage(int[] sales) {
        int belowAverage = 0;
        int saleAverage = calcAverage(sales);

        for (int sale : sales) {
            if (sale < saleAverage) {
                belowAverage++;
            }

        }
        return belowAverage;

    }

    //6. Сервис для рассчёта количества месяцев, в которых продажи были выше среднего
    public int getSalesAboveAverage(int[] sales) {
        int aboveAverage = 0;
        int saleAverage = calcAverage(sales);

        for (int sale : sales) {
            if (sale > saleAverage) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }

}