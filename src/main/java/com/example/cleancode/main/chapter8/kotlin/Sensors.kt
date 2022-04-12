package com.example.cleancode.main.chapter8.kotlin

class Sensors(sensors: Map<String, Sensor>) {
    fun getById(sensorId: String): Sensor? {
        return sensors[sensorId]
    }
}