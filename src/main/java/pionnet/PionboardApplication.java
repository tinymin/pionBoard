package pionnet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
public class PionboardApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PionboardApplication.class, args);

		// 이 시점의 Datasource와 JUnit 실행시의 Datasource는 다름.
		// 이를 동일하게 설정해주기 위해서는 resources/application.properties을 설정 후 반드시 빌드한 다음 실행한다.
		DataSource dataSource = context.getBean(javax.sql.DataSource.class);
		System.out.println("DATASOURCE = " + dataSource);
	}
}
