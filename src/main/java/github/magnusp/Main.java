package github.magnusp;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Main {
	static void main(String[] args) {
		System.exit(SpringApplication.exit(new SpringApplicationBuilder(Runner.class)
			.logStartupInfo(false)
			.bannerMode(Banner.Mode.OFF)
			.web(WebApplicationType.NONE)
			.run(args)));
	}
}
