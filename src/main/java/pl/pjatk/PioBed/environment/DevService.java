package pl.pjatk.PioBed.environment;

import org.springframework.stereotype.Service;

@Service
public class DevService implements HandlerServiceInterface {

    @Override
    public String getEnvironmentName() {
        return "DEV";
    }

    @Override
    public String execute() {
        return "Hello from Dev";
    }
}
