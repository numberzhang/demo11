package com.example.demo.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by admin on 2017/7/17.
 */
@Configurable
@ImportResource(locations = {"classpath:application-bean.xml"})
public class ConfigClass {
}
