/**
 * 
 */
package com.rs.cdpapp.config.security;

import java.util.Arrays;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.rs.cdpapp.config.security.jwt.JWTAuthenticationFilter;
import com.rs.cdpapp.config.security.jwt.JwtAuthenticationProvider;
import com.rs.cdpapp.config.security.jwt.service.JWTTokenService;

/**
 * This is the configuration class for web security with JWT tokens
 * 
 * @author Nandhu
 * 
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	
//	private static final String[] AUTH_WHITELIST = { "/recoveryMovementTest"};

	@Resource
	private RestAuthenticationEntryPoint authenticationEntryPoint;

	@Resource
	LoginAuthenticationProvider loginAuthenticationProvider;

	@Resource
	LoginAuthenticationSuccessHandler successHandler;

	@Resource
	LoginAuthenticationFailureHandler failureHandler;

	@Resource
	JwtAuthenticationProvider jwtAuthenticationProvider;

	@Resource
	JWTTokenService jwtTokenService;

	/**
	 * This method is used to generate the JWTAuthenticationFilter
	 * 
	 * @return
	 * @throws Exception
	 */

	// protected JWTAuthenticationFilter buildJWTAuthenticationFilter() throws
	// Exception {
	// List<String> pathsToSkip = Arrays.asList("/api/**");
	// SkipPathRequestMatcher matcher = new SkipPathRequestMatcher(pathsToSkip,
	// "/");
	// JWTAuthenticationFilter filter = new
	// JWTAuthenticationFilter(failureHandler, matcher, jwtTokenService);
	// filter.setAuthenticationManager(this.authenticationManager());
	// return filter;
	// }

	protected JWTAuthenticationFilter buildJWTAuthenticationFilter() throws Exception {
		JWTAuthenticationFilter filter = new JWTAuthenticationFilter(failureHandler, jwtTokenService);
		filter.setAuthenticationManager(this.authenticationManager());
		return filter;
	}

	/**
	 * This method is contains information about how to authenticate our users.
	 * 
	 * @see WebSecurityConfig
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().and().csrf().disable().authorizeRequests().antMatchers("/").permitAll().antMatchers("/login")
				.permitAll().antMatchers("/refreshToken").permitAll()
				 .antMatchers("/swagger.json").permitAll()
				.and().authorizeRequests().anyRequest().authenticated().and().sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().exceptionHandling()
				.authenticationEntryPoint(authenticationEntryPoint).and()
				.addFilterBefore(buildJWTAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class)
				.addFilterBefore(new LoginFilter("/login", successHandler, failureHandler, authenticationManager()),
						UsernamePasswordAuthenticationFilter.class)
				.headers().cacheControl();
	}

	/**
	 * This method is used to configure the authentication providers
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.authenticationProvider(loginAuthenticationProvider);

		auth.authenticationProvider(jwtAuthenticationProvider);
	}

	@Bean
	CorsConfigurationSource corsConfigurationSource() {

		CorsConfiguration configuration = new CorsConfiguration();
		configuration.setAllowedOrigins(Arrays.asList("*"));
		configuration.setAllowedMethods(Arrays.asList("GET", "POST"));
		configuration.setAllowedHeaders(Arrays.asList("*"));
		configuration.setExposedHeaders(Arrays.asList("auth-token"));
		configuration.setMaxAge((long) 3600);
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return source;
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/v2/api-docs", "/configuration/ui", "/swagger-resources/**",
				"/configuration/security", "/swagger-ui.html", "/webjars/**","/swagger**","/api/viewCimsUploadFile**");
	}

}