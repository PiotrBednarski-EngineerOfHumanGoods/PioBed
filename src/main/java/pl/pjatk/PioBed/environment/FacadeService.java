package pl.pjatk.PioBed.environment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FacadeService {
    private final String environment;
    private final Map<String, HandlerServiceInterface> services = new HashMap<>();

    public FacadeService(@Value("${app.environment:DEV}") String environment, List<HandlerServiceInterface> services) {
        this.environment = environment;
        services.forEach(service -> this.services.put(service.getEnvironmentName(), service));
    }

    public String execute() {
        return services.getOrDefault(environment, services.get("DEV")).execute();
    }
}
