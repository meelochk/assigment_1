package com.example;

public class MyGeometry {
    private MyPoint[] vertices;
    private double perimeterValue;

    public MyGeometry(MyPoint[] vertices) {
        this.vertices = vertices;
    }

    public double calculatePerimeter() {
        double perimeter = 0;
        int length = vertices.length;

        for (int i = 0; i < length; i++) {
            MyPoint currentVertex = vertices[i];
            MyPoint nextVertex = vertices[(i + 1) % length];
            perimeter += currentVertex.calculateDistanceTo(nextVertex);
        }

        this.perimeterValue = perimeter;
        return perimeter;
    }

    public double findAverageSide() {
        int numOfSides = vertices.length;
        return (perimeterValue / numOfSides);
    }

    public double findLongestSide() {
        double longestSide = 0;

        for (int i = 0; i < vertices.length; i++) {
            MyPoint currentVertex = vertices[i];
            MyPoint nextVertex = vertices[(i + 1) % vertices.length];
            longestSide = Math.max(currentVertex.calculateDistanceTo(nextVertex), longestSide);
        }

        return longestSide;
    }
}
