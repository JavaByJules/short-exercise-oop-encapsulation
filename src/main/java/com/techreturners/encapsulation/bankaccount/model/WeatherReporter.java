package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private String location;
    private double temperature;

    private final String LONDON = "London";
    private final String CALIFORNIA = "California";
    private final String CAPETOWN = "Cape Town";

    private final String TOOHOTPHRASE = "It's too hot 🥵!";
    private final String TOOCOLDPHRASE = "It's too cold 🥶!";
    private final String JUSTRIGHTPHRASE = "Ahhh...it's just right 😊!";
    private final int hotTemperature = 30;
    private final int coldTemperature = 10;
    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    private double calculateTemperature(double temperature){
        return (9.0 / 5.0) * temperature + 32;
    }
    public String printCityAndLocation() {
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, checkLocation(), checkTemperature(), calculateTemperature(temperature));
    }

    public String checkLocation() {
        return switch (location) {
            case LONDON -> "🌦";
            case CALIFORNIA -> "🌅";
            case CAPETOWN -> "🌤";
            default -> "🔆";
        };
    }

    public String checkTemperature() {
        if (temperature > hotTemperature) {
            return TOOHOTPHRASE;
        } else if (temperature < coldTemperature) {
            return TOOCOLDPHRASE;
        }
        return JUSTRIGHTPHRASE;
    }

}
