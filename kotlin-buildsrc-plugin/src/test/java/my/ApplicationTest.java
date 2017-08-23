package my;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static my.Application.greeting;

public class ApplicationTest {

    @Test
    public void testGreeting() {
        assertThat(
            greeting(),
            equalTo("Hello, world!"));
    }
}
