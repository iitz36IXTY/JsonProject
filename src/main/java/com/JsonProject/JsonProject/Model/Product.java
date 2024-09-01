package com.JsonProject.JsonProject.Model;

public class Product {
    private char packageType;
    private double mins;
    private double total;

    public Product() {
    }

    public Product(char packageType, double mins, double total) {
        this.packageType = packageType;
        this.mins = mins;
        this.total = total;
    }

    public char getPackageType() {
        return packageType;
    }

    public void setPackageType(char packageType) {
        this.packageType = packageType;
    }

    public double getMins() {
        return mins;
    }

    public void setMins(double mins) {
        this.mins = mins;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
