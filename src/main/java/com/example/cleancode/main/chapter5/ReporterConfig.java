package com.example.cleancode.main.chapter5;

import org.yaml.snakeyaml.introspector.Property;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ReporterConfig {
    /**
    * 리포터 리스너의 클래스 이름
    **/
    private String m_className;

    /**
     * 리포터 리스너의 속성
     **/
    private List<Property> m_properties = new ArrayList<>();
    public void addProperty(Property property) {
        m_properties.add(property);
    }
}
