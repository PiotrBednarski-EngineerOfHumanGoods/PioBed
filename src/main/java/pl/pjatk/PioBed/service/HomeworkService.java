package pl.pjatk.PioBed.service;

import org.springframework.stereotype.Service;
import pl.pjatk.PioBed.model.HomeworkModel;

@Service
public class HomeworkService {

    public HomeworkModel getByPathVariable(String value) {
        return new HomeworkModel("PathVariable", value);
    }

    public HomeworkModel getByRequestParam(String value) {
        return new HomeworkModel("RequestParam", value);
    }

    public HomeworkModel create(HomeworkModel homeworkModel) {
        return homeworkModel;
    }

    public HomeworkModel update(String value, HomeworkModel homeworkModel) {
        homeworkModel.setValue(value);
        return homeworkModel;
    }
}
