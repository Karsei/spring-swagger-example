package kr.pe.karsei.springswaggerexample;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

@Schema(description = "양식 파라미터")
@Builder
@Getter
public class Sample {
    @Schema(description = "이름", type = "string", example = "홍길동")
    private String name;
    @Schema(description = "수량", type = "integer", example = "100")
    private int amount;
}
