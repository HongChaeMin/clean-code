package com.example.cleancode.main.chapter8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
public class AssertjTest {

    List<ExPersonEntity> basicEntityList = new ArrayList<>();

    @BeforeEach
    void dummyData() {
        for (int i = 0; i < 10; i++) {
            ExPersonEntity entity = new ExPersonEntity((long) i, "person" + i, 20 + i);
            basicEntityList.add(entity);
        }
    }

    @Test
    @DisplayName("더미 데이터 테스트")
    void withAssertions_examples() {
        for (int i = 0; i < 10; i++) {
            ExPersonEntity entity = basicEntityList.get(i);

            assertThat(entity.getPersonSeq()).isEqualTo(i);
            assertThat(entity.getPersonName()).isEqualTo("person" + i);
            assertThat(entity.getAge()).isEqualTo(20 + i);
        }
    }

    @Test
    @DisplayName("assertj simple test")
    void a_few_simple_assertions() {
        assertThat("The Lord of the Rings").isNotNull()
                .startsWith("The")
                .contains("Lord")
                .endsWith("Rings");
    }

}
