package pl.pjatk.PioBed.service;

import org.springframework.stereotype.Service;
import pl.pjatk.PioBed.exception.SandboxException;

@Service
public class ExceptionService {

    public void throwException() {
        throw new SandboxException("Student exception");
    }
}
