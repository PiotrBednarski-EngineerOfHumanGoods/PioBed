package pl.pjatk.PioBed.environment;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FacadeServiceTests {

    @Test
    void shouldReturnDevMessage() {
        FacadeService facadeService = new FacadeService("DEV", createServices());

        String result = facadeService.execute();

        assertEquals("Hello from Dev", result);
    }

    @Test
    void shouldReturnQaMessage() {
        FacadeService facadeService = new FacadeService("QA", createServices());

        String result = facadeService.execute();

        assertEquals("Hello from QA", result);
    }

    @Test
    void shouldReturnProdMessage() {
        FacadeService facadeService = new FacadeService("PROD", createServices());

        String result = facadeService.execute();

        assertEquals("Hello from Prod", result);
    }

    @Test
    void shouldReturnStagingMessage() {
        FacadeService facadeService = new FacadeService("STAGING", createServices());

        String result = facadeService.execute();

        assertEquals("Hello from Staging", result);
    }

    @Test
    void shouldReturnDevMessageForUnknownEnvironment() {
        FacadeService facadeService = new FacadeService("UNKNOWN", createServices());

        String result = facadeService.execute();

        assertEquals("Hello from Dev", result);
    }

    private List<HandlerServiceInterface> createServices() {
        return List.of(
                new DevService(),
                new QaService(),
                new ProdService(),
                new StagingService()
        );
    }
}
