package kr.pe.karsei.springswaggerexample;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Sample {
    private String name;
    private int amount;
}
