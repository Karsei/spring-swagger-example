package kr.pe.karsei.springswaggerexample;

import lombok.Getter;

@Getter
public enum SampleEnum2 {
    PLATINUM("P"),
    GOLD("G"),
    BRONZE("B")
    ;

    private final String value;

    SampleEnum2(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
