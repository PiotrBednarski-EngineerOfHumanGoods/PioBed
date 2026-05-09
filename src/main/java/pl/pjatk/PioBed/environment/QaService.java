package pl.pjatk.PioBed.environment;

import org.springframework.stereotype.Service;

@Service
public class QaService implements HandlerServiceInterface {

    @Override
    public String getEnvironmentName() {
        return "QA";
    }

    @Override
    public String execute() {
        return "Hello from QA";
    }
}
