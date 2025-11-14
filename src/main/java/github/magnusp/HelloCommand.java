package github.magnusp;

import org.springframework.stereotype.Component;
import picocli.CommandLine.Command;

import java.util.concurrent.Callable;

@Component
@Command(name = "hi", description = "Says hello", mixinStandardHelpOptions = true)
public class HelloCommand implements Callable<Integer> {

	@Override
	public Integer call() {
		System.out.println("Hello World!");
		return 0;
	}
}
