package ru.netology.stats;

import org.junit.jupiter.api.Test;

public class StaticSalesTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void StaticSalesTestSum() {
        StatsService sumtest = new StatsService();

        int sumsales = sumtest.sum(sales);

        System.out.println("Общая сумма продаж = " + sumsales);
    }

    @Test
    public void StaticSalesTestaverage() {
        StatsService Averagetest = new StatsService();

         int averagesales = Averagetest.average(sales);

        System.out.println("Средняя сумма продаж = " + averagesales);
    }

    @Test
    public void StaticSalesTestMonthmax() {
        StatsService Monthmaxtest = new StatsService();

        int monthmaxsales = Monthmaxtest.monthmax(sales) + 1;

        System.out.println("Лучший месяц по продажам № " + monthmaxsales);
    }

    @Test
    public void StaticSalesTestMonthmin() {
        StatsService Monthmintest = new StatsService();

        int monthminsales = Monthmintest.monthmin(sales) + 1;

        System.out.println("Худший месяц по продажам № " + monthminsales);

    }

    @Test
    public void StaticSalesTestMonthHighAverage() {
        StatsService MonthHighAveragetest = new StatsService();

        int HighAveragetest = MonthHighAveragetest.MonthHighAverage(sales);

        System.out.println("Количество месяцев, в которых продажи выше среднего = " + HighAveragetest);

    }

    @Test
    public void StaticSalesTestMonthUnderAverage() {
        StatsService MonthUnderAveragetest = new StatsService();

        int UnderAveragetest = MonthUnderAveragetest.MonthUnderAverage(sales);

        System.out.println("Количество месяцев, в которых продажи ниже среднего = " + UnderAveragetest);

    }

    @Test
    public void StaticSalesTestMonthEquallyAverage() {
        StatsService MonthEquallyAveragetest = new StatsService();

        int EquallyAveragetest = MonthEquallyAveragetest.MonthEquallyAverage(sales);

        System.out.println("Количество месяцев, в которых средние продажи = " + EquallyAveragetest);

    }
}