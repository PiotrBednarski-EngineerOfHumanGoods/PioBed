package pl.pjatk.PioBed.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.PioBed.service.ExceptionService;

@RestController
public class ExceptionController {
    private final ExceptionService exceptionService;

    public ExceptionController(ExceptionService exceptionService) {
        this.exceptionService = exceptionService;
    }

    @GetMapping("/exception")
    public ResponseEntity<Void> throwException() {
        exceptionService.throwException();
        return ResponseEntity.ok().build();
    }
}
