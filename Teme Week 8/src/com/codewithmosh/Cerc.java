package com.codewithmosh;

public class Cerc {

    private double raza;

    

    public double getRaza() {
        return this.raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }

    public double formula(int raza, double area) {
        area = Math.PI * this.raza * this.raza;
        return area;
    }
}
