package org.dell.kube.pages;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HomeControllerTests {
<<<<<<< HEAD:src/test/java/org/dell/kube/pages/HomeControllerTests.java
=======
    private final String message = "Hello Yellow Pages";
>>>>>>> 93e5a9558e64d7fa7e42a709e6292e90a74b12f6:src/test/java/org/dell/kube/pages/HomeControllerTests.java

    private final String message = "Hello Yellow Pages";
    @Test
    public void itSaysYellowPagesHello() throws Exception {
        HomeController controller = new HomeController(message);

        assertThat(controller.getPage()).contains(message);
    }


}
