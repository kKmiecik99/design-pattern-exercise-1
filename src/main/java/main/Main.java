package main;

import chart.BarChart;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        BarChart barChart= BarChart.builder()
                .withTitle("Title 1")
                .withFontName("Arial")
                .withFontSize(72)
                .withBackgroundColor("Black")
                .withFontColor("White")
                .build();
        System.out.println(barChart.toString());
    }
}
