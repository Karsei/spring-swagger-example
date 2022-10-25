package kr.pe.karsei.springswaggerexample;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Schema(description = "기타 파라미터")
@Builder
@Getter @Setter
public class SampleBody {
    @Parameter(name = "거리", description = "거리", required = true, schema = @Schema(type = "string", defaultValue = "대왕판교로"))
    private String street;
    @Parameter(description = "도시", schema = @Schema(type = "string", defaultValue = "성남시"))
    private String city;
    @Parameter(description = """
                            우편번호
                            * 대한민국 기준
                               + 마크다운 테스트임
                            """, schema = @Schema(type = "string", defaultValue = "16509"))
    private String zipCode;
    @Parameter(description = "등급")
    private SampleEnum grade;
    @Parameter(description = "등급 값 기준")
    private SampleEnum2 valueGrade;
    @Parameter(description = "선택적 등급", schema = @Schema(type = "string", allowableValues = {"P", "G"}))
    private SampleEnum2 selectedGrade;
    @Parameter(description = "연락처")
    private InnerClass contact = new InnerClass();

    @Builder
    @Getter
    @NoArgsConstructor @AllArgsConstructor
    public static class InnerClass {
        @Parameter(description = "핸드폰 번호")
        private String phone;
        @Parameter(description = "팩스 번호")
        private String fax;
    }
}
