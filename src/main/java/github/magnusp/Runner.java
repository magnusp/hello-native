package github.magnusp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import picocli.CommandLine;

import java.io.PrintStream;

@Component
public class Runner implements CommandLineRunner, ExitCodeGenerator {
	private final HelloCommand helloCommand;
	private final CommandLine.IFactory factory;
	private int exitCode;

	public Runner(HelloCommand helloCommand, CommandLine.IFactory factory) {
		this.helloCommand = helloCommand;
		this.factory = factory;
	}

	@Override
	public void run(String... args) {
		exitCode = new CommandLine(helloCommand, factory).execute(args);
	}

	@Override
	public int getExitCode() {
		return exitCode;
	}
}
