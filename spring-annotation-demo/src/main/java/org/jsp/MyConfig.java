package org.jsp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.jsp")
public class MyConfig {
	@Bean
	public List<Integer> getList() {
		return new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
	}
}
