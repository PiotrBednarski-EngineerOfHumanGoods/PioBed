package pl.pjatk.PioBed.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.PioBed.model.HomeworkModel;
import pl.pjatk.PioBed.service.HomeworkService;

@RestController
@RequestMapping("/homework")
public class HomeworkController {
    private final HomeworkService homeworkService;

    public HomeworkController(HomeworkService homeworkService) {
        this.homeworkService = homeworkService;
    }

    @GetMapping("/{value}")
    public ResponseEntity<HomeworkModel> getByPathVariable(@PathVariable String value) {
        return ResponseEntity.ok(homeworkService.getByPathVariable(value));
    }

    @GetMapping
    public ResponseEntity<HomeworkModel> getByRequestParam(@RequestParam String value) {
        return ResponseEntity.ok(homeworkService.getByRequestParam(value));
    }

    @PostMapping
    public ResponseEntity<HomeworkModel> create(@RequestBody HomeworkModel homeworkModel) {
        return ResponseEntity.ok(homeworkService.create(homeworkModel));
    }

    @PutMapping("/{value}")
    public ResponseEntity<HomeworkModel> update(@PathVariable String value, @RequestBody HomeworkModel homeworkModel) {
        return ResponseEntity.ok(homeworkService.update(value, homeworkModel));
    }

    @DeleteMapping("/{value}")
    public ResponseEntity<Void> delete(@PathVariable String value) {
        return ResponseEntity.ok().build();
    }
}
