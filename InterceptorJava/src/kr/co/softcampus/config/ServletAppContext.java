package kr.co.softcampus.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import kr.co.softcampus.interceptor.TestInterceptor1;
import kr.co.softcampus.interceptor.TestInterceptor4;
import kr.co.softcampus.interceptor.TestInterceptor6;

//Spring MVC 프로젝트에 관련된 설정을 하는 클래스
@Configuration
// Controller 어노테이션이 셋팅되어 있는 클래스를 Controller로 등록한다
@EnableWebMvc
//스캔할 패키지를 지정한다
@ComponentScan("kr.co.softcampus.controller")
public class ServletAppContext implements WebMvcConfigurer{
	// Contorller의 메서드가 반환하는 jsp의 이름 앞뒤에 경로와 확장자를 붙혀주도록 설정한다.
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/", ".jsp");
	}
	
	// 정적 파일의 경로를 매핑한다
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/resources/");
	}
	
	//인터셉터 등록.
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addInterceptors(registry);
		
		TestInterceptor1 inter1 = new TestInterceptor1();//인터셉터객체만들기
		TestInterceptor4 inter4 = new TestInterceptor4();
		TestInterceptor6 inter6 = new TestInterceptor6();
		
		
		InterceptorRegistration reg1 = registry.addInterceptor(inter1);//인터셉터등록
		InterceptorRegistration reg4 = registry.addInterceptor(inter4);
		InterceptorRegistration reg6 = registry.addInterceptor(inter6);
		
//		reg1.addPathPatterns("/test1");
//		reg4.addPathPatterns("/test2");
		reg4.addPathPatterns("/test1","/test2");
		reg6.addPathPatterns("/**");
		reg6.excludePathPatterns("/폴더이름/*");
	}
}
