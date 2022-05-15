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

        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }

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

        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int average = sum / 12;

        int HighAverage = 0;
        for (int sale : sales) {
            if (sale > average)
                HighAverage++;
        }
        return HighAverage;
    }

    public int MonthUnderAverage(int[] sales) {

        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int average = sum / 12;

        int UnderAverage = 0;
        for (int sale : sales) {
            if (sale < average)
                UnderAverage++;
        }
        return UnderAverage;
    }

    public int MonthEquallyAverage(int[] sales) {

        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int average = sum / 12;

        int EquallyAverage = 0;
        for (int sale : sales) {
            if (sale == average)
                EquallyAverage++;
        }
        return EquallyAverage;
    }

}