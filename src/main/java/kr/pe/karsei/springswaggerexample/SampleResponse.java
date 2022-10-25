package kr.pe.karsei.springswaggerexample;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

@Schema(description = "결과")
@Builder
@Getter
public class SampleResponse {
    @Schema(description = "시퀀스 번호", type = "long", example = "1")
    private Long seqNo;
    @Schema(description = "나이", type = "int", example = "20")
    private Integer age;
}
