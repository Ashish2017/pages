package org.dell.kube.pages;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HomeControllerTests {
<<<<<<< HEAD:src/test/java/org/dell/kube/pages/HomeControllerTests.java
    private final String message = "YellowPages";
=======
    private final String message = "Hello Yellow Pages";
>>>>>>> config-work:src/test/java/org/dell/kube/pages/HomeControllerTests.java

    @Test
    public void itSaysYellowPagesHello() throws Exception {
        HomeController controller = new HomeController(message);

        assertThat(controller.getPage()).contains(message);
    }


}
