package com.company.guruspring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanFactoryAware, BeanNameAware, ApplicationContextAware {
    public LifeCycleDemoBean() {
        System.out.println("# I'm in th The LifeCycleBean Constructor");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("# My bean name is:" + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("# The life cycle bean has bean destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("# The LifeCycleBean has its properties set ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application context has been set");

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("# My bean factory been set");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("# The Post Construct annotation method has been called");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("# The Pre Destroy annotation method has been called");
    }

    public void beforInit(){
        System.out.println("# - before init - called by bean post processor");
    }

    public void afterInit(){
        System.out.println("# - after init - called by bean post processor");
    }
}
