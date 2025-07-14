package jp.kobe_u.cs.daikibo.tsubuyaki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("jp.kobe_u.entity")
public class TsubuyakiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TsubuyakiApplication.class, args);
	}

}
