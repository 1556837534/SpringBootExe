package com.study.SpringBoot.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author ceshi
 * @Title:  一个实体bean 用来测试 yaml 文件
 *           将application.yml 文件中配置的每一个属性值 映射到该实体bean中
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/4/617:07
 */

/**  只有这个组件是容器中的组件，才可以使用容器中提供的功能
 *@ConfigurationProperties 告诉Springboot 本类中所有的属性与配置文件中的值进行绑定
 *                              prefix ="person" 配置文件中哪个属性中的配置进行一一映射 (默认是从全局配置文件中获取值)
 *                              @Validated JSPs303 数据校验
 *
 *                              @PropertySource：加载指定的配置文件  加载指定的properties属性文件
 *
 */
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {
    //名称必须是邮件格式
    @Email
    private String lastName;
    private Integer age;
    private boolean boss;
    private Date birthday;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birthday=" + birthday +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
