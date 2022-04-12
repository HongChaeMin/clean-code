package com.example.cleancode.main.chapter8.java;

import java.util.HashMap;
import java.util.Map;

public class ExMap {

    Map<String, Sensor> sensorMap = new HashMap<>();

    int sensorId = 4;

    Sensor s = sensorMap.get(sensorId);

    Sensors sensors = new Sensors();
    Sensor sensor = sensors.getById("admin1");

}
