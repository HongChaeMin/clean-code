package com.example.cleancode.main.chapter8.java;

import java.util.HashMap;
import java.util.Map;

public class Sensors {
    private final Map sensors = new HashMap();

    public Sensor getById(String id) {
        return (Sensor) sensors.get(id);
    }
}
