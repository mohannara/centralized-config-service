package lk.dialog.crm.config.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Mohan_02392
 *
 */

@EnableConfigServer
@SpringBootApplication
public class CentralizedConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentralizedConfigServiceApplication.class, args);
	}

}
