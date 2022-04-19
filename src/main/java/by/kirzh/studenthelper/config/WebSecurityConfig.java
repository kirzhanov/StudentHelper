package by.kirzh.studenthelper.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //formatter: off
        http.csrf().disable()
                .authorizeRequests(a -> a
                        .antMatchers("/", "/courses").permitAll()
                        .anyRequest().authenticated())
                .oauth2Login();
        //formatter: on
    }
}
