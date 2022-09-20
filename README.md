# Swagger 적용

## 설정

의존성 추가

```groovy
// https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-ui
implementation group: 'org.springdoc', name: 'springdoc-openapi-ui', version: '1.6.11'
```

* 기본 경로: http://localhost:8080/v3/api-docs/
  + JSON 으로 표현되어 있음
  + `application.yml` 에서 `springdoc.api-docs.path` 속성을 통해 변경할 수 있다.
* UI 적용 기본 경로: http://localhost:8080/swagger-ui.html
  + `application.yml` 에서 `springdoc.swagger-ui.path` 속성을 통해 변경할 수 있다.




