package github.magnusp;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.assertj.core.api.Assertions.assertThat;


class HelloCommandTest {
	@Test
	void shouldSayHello() throws Exception {
		var command = new HelloCommand();
		var result = tapSystemOut(command::call);
		assertThat(result).isEqualTo("Hello World!\n");
	}
}
