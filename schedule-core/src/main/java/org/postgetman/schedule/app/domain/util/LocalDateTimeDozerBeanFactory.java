package org.postgetman.schedule.app.domain.util;

import org.dozer.BeanFactory;

import java.time.LocalDateTime;

public class LocalDateTimeDozerBeanFactory implements BeanFactory {

    @Override
    public LocalDateTime createBean(Object source, Class<?> sourceClass, String targetBeanId) {
        return LocalDateTime.parse((String) source);
    }

}
