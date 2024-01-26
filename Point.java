package com.example;

import java.lang.Math;

public class MyPoint {
    private double xCoordinate;
    private double yCoordinate;

    public MyPoint(double x, double y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    public double getXCord() {
        return xCoordinate;
    }

    public double getYCord() {
        return yCoordinate;
    }

    public double calculateDistanceTo(MyPoint destination) {
        double x1 = this.xCoordinate;
        double y1 = this.yCoordinate;

        // Use destination to get the values of the second coordinate
        double x2 = destination.getXCord();
        double y2 = destination.getYCord();

        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return distance;
    }

    @Override
    public String toString() {
        return "(" + xCoordinate + ", " + yCoordinate + ")";
    }
}
