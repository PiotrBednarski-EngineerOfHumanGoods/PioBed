package pl.pjatk.PioBed.environment;

import org.springframework.stereotype.Service;

@Service
public class ProdService implements HandlerServiceInterface {

    @Override
    public String getEnvironmentName() {
        return "PROD";
    }

    @Override
    public String execute() {
        return "Hello from Prod";
    }
}
