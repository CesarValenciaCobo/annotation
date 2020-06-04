package com.example.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebController implements WebMvcConfigurer{

//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/userForm").setViewName("userForm");
//        registry.addViewController("/hello").setViewName("hello");
//        //registry.addViewController("/index").setViewName("index");
//        //registry.addViewController("/form").setViewName("form");
//    }

//    @RequestMapping(value="/user/add", method = RequestMethod.GET)
//    public String getHomePage(){
//        return "userForm";
//    }

//    @RequestMapping(value="/form", method=RequestMethod.GET)
//    public String showForm(Person person) {
//        return "form";
//    }

//    @RequestMapping(value="/form", method=RequestMethod.POST)
//    public String checkPersonInfo(@Valid Person person, BindingResult bindingResult) {
//
//        if (bindingResult.hasErrors()) {
//            return "form";
//        }
//        return "redirect:/results";
//    }

//    @Bean
//    public ViewResolver getViewResolver() {
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("/WEB-INF/resources/templates/");
//        resolver.setSuffix(".jsp");
//        return resolver;
//    }

//    @Override
//    public void configureDefaultServletHandling(
//        DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }

}