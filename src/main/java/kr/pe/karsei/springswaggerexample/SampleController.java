package kr.pe.karsei.springswaggerexample;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sample")
public class SampleController {
    @GetMapping("/{id}")
    @Operation(summary = "문자열을 그대로 출력")
    public String hello(@PathVariable String id) {
        return id;
    }
}
