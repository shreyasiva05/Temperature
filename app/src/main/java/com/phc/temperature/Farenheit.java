package com.phc.temperature;
//Farenheit Class
public class Farenheit {

    private float temperature;
    public Farenheit(String temp) {
        this.temperature = Float.parseFloat(temp);
    }
    public String convert(String temp) {
        double celsius = (temperature - 32.0f) * (5.0f / 9.0f);
        return String.format("%.2f °C", celsius);
    }
}

