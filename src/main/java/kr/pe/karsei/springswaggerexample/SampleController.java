package kr.pe.karsei.springswaggerexample;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Tag(name = "샘플 API 목록", description = "그러합니다.")
@Validated
@RestController
@RequestMapping("/api/sample")
public class SampleController {
    @Operation(summary = "문자열을 그대로 출력", description = "문자열을 그대로 출력합니다.", tags = { "태애애애그", "예아" })
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "500", description = "내부 서버 오류")
    })
    @GetMapping("/{id}")
    public String hello(@PathVariable String id,
                        @ModelAttribute @ParameterObject SampleBody body) {
        return id;
    }

    @PostMapping("/{id}")
    @Operation(summary = "요청 파라미터를 그대로 출력",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "양식", content = @Content(schema = @Schema(implementation = Sample.class))),
            description = "요청 파라미터에 있는 것들을 그대로 출력하는 메서드입니다."
    )
    public ResponseEntity<SampleResponse> postTest(@PathVariable String id,
                                                   @Valid @RequestBody Sample sample) {
        return ResponseEntity.ok(SampleResponse.builder().build());
    }
}
