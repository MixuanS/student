package config;

import bean.BeanA;
import mysql.Index;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author hc
 * @version 1.0.0
 * @date 2019/6/27
 */
@ComponentScan(basePackageClasses = {BeanA.class, Index.class})
public class BeanConfig {

}
