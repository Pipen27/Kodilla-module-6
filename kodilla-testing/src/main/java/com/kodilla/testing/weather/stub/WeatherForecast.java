package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        double sum = 0;

        for (Map.Entry<String, Double> entry : temperatures.getTemperatures().entrySet()) {

            sum += entry.getValue();

        }


        return (double) (sum) / (temperatures.getTemperatures().size());

    }

    public double calculateMedianTemperature() {
        List<Double> temperaturesAscend = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(temperaturesAscend);

        double f = temperaturesAscend.size();
        double n = (f / 2);
        double m = n - 0.5;
        int o = (int) m;


        int l = (int) n + 1;
        if (temperaturesAscend.size() % 2 != 0) {
            double medianEven = temperaturesAscend.get(o);
            return medianEven;
        } else {
            double sumTwoTemperatures = temperaturesAscend.get(o) + temperaturesAscend.get(l);
            double medianOdd = sumTwoTemperatures / 2;
           return medianOdd;
        }

    }
}
