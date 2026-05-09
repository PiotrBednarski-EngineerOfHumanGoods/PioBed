package pl.pjatk.PioBed.environment;

import org.springframework.stereotype.Service;

@Service
public class StagingService implements HandlerServiceInterface {

    @Override
    public String getEnvironmentName() {
        return "STAGING";
    }

    @Override
    public String execute() {
        return "Hello from Staging";
    }
}
