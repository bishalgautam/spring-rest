package me.bgautam;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by bishalgautam on 6/19/17.
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "me.bgautam")
public class Application {


}
