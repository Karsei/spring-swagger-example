package kr.pe.karsei.springswaggerexample;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sample")
public class SampleController {
    @GetMapping("/{id}")
    @Operation(summary = "문자열을 그대로 출력", description = "문자열을 그대로 출력합니다.", tags = { "태애애애그", "예아" })
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "500", description = "내부 서버 오류")
    })
    public String hello(@PathVariable String id) {
        return id;
    }
}
