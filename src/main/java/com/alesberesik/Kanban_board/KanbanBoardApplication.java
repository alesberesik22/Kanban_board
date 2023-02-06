package com.alesberesik.Kanban_board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class KanbanBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(KanbanBoardApplication.class, args);
	}

}
