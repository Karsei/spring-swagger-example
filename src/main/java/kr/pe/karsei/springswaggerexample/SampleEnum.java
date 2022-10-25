package kr.pe.karsei.springswaggerexample;

import lombok.Getter;

@Getter
public enum SampleEnum {
    PLATINUM("P"),
    GOLD("G"),
    BRONZE("B")
    ;

    private final String value;

    SampleEnum(String value) {
        this.value = value;
    }
}
