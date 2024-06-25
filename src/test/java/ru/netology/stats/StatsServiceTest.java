package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test //1. Сумма всех продаж за месяц
    public void salesAmount() {
        StatsService service = new StatsService();

        //данные о продажах по месяцам
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.salesAmount(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test //2. Средняя сумма всех продаж за месяц
    public void calcAverage() {
        StatsService service = new StatsService();

        //данные о продажах по месяцам
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.calcAverage(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test //3. Номер месяца в который был максимум продаж (на макс. сумму)
    public void maxSalesMonth() {
        StatsService service = new StatsService();

        //данные о продажах по месяцам
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 7;
        int actualMaxMonth = service.getMaxSalesMonth(sales);


        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);

    }

    @Test //4. Номер месяца, в который был минимум продаж (на мин. сумму)
    public void minSalesMonth() {
        StatsService service = new StatsService();

        //данные о продажах по месяцам
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 8;
        int actualMinMonth = service.getMinSalesMonth(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test //5. Количество месяцев, в которых продажи были ниже среднего
    public void salesBelowAverege() {
        StatsService service = new StatsService();

        //данные о продажах по месяцам
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedQuantityB = 5;
        int actualQuantityB = service.getSalesBelowAverage(sales);

        Assertions.assertEquals(expectedQuantityB, actualQuantityB);
    }

    @Test //6. Количество месяцев, в который продажибыли выше среднего
    public void salesAboveAverage() {
        StatsService service = new StatsService();

        //данные о продажах по месяцам
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedQuantityA = 5;
        int actualQuantityA = service.getSalesAboveAverage(sales);

        Assertions.assertEquals(expectedQuantityA, actualQuantityA);
    }





}
