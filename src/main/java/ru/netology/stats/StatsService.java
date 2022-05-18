package ru.netology.stats;

public class StatsService {

    public int sum(int[] sales) {

        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int average(int[] sales) {

        int sum = sum(sales);
        int average = sum / 12;
        return average;
    }

    public int monthmax(int[] sales) {

        int max = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[max])
                max = i;
        }
        return max;

    }

    public int monthmin(int[] sales) {

        int min = 0;
        for (int j = 0; j < sales.length; j++) {
            if (sales[j] <= sales[min])
                min = j;
        }
        return min;

    }

    public int MonthHighAverage(int[] sales) {

        int average = average(sales);
        int highAverage = 0;
        for (int sale : sales) {
            if (sale > average)
                highAverage++;
        }
        return highAverage;
    }

    public int MonthUnderAverage(int[] sales) {

        int average = average(sales);
        int underAverage = 0;
        for (int sale : sales) {
            if (sale < average)
                underAverage++;
        }
        return underAverage;
    }

    public int MonthEquallyAverage(int[] sales) {

        int average = average(sales);
        int equallyAverage = 0;
        for (int sale : sales) {
            if (sale == average)
                equallyAverage++;
        }
        return equallyAverage;
    }

}