package com.example;

public class MyShape {
    private MyPoint[] myPoints;
    private double perimeter;

    public MyShape(MyPoint[] myPoints) {
        this.myPoints = myPoints;
    }

    public double calculatePerimeter() {
        double shapePerimeter = 0;
        int len = myPoints.length;

        for (int i = 0; i < len; i++) {
            MyPoint currentPoint = myPoints[i];
            MyPoint nextPoint = myPoints[(i + 1) % len];
            shapePerimeter += currentPoint.calculateDistanceTo(nextPoint);
        }

        this.perimeter = shapePerimeter;
        return shapePerimeter;
    }

    public double calculateAverageSide() {
        int numOfSides = myPoints.length;
        return (perimeter / numOfSides);
    }

    public double findLongestSide() {
        double longestSide = 0;

        for (int i = 0; i < myPoints.length; i++) {
            MyPoint currentPoint = myPoints[i];
            MyPoint nextPoint = myPoints[(i + 1) % myPoints.length];
            longestSide = Math.max(currentPoint.calculateDistanceTo(nextPoint), longestSide);
        }

        return longestSide;
    }
}
