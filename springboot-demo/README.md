# Spring Boot hello world

##一、所需环境
1. jdk 1.6+
2. maven 3.2+
> 尽管Spring Boot 兼容 Java 6 or 7, 如果可能的话，我们最好还是使用java 8
##二、编写pom文件
```
在parent里配置spring-boot-starter-parent，如果是web项目，则需要引入spring-boot-starter-web模块  

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
        <modelVersion>4.0.0</modelVersion>
    
        <groupId>com.example</groupId>
        <artifactId>springboot-demo</artifactId>
        <version>0.0.1-SNAPSHOT</version>
        <packaging>jar</packaging>
    
        <name>springboot-demo</name>
        <description>Demo project for Spring Boot</description>
    
        <parent>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-parent</artifactId>
            <version>1.5.6.RELEASE</version>
            <relativePath/> <!-- lookup parent from repository -->
        </parent>
    
        <properties>
            <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
            <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
            <java.version>1.8</java.version>
        </properties>
    
        <dependencies>
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-web</artifactId>
            </dependency>
    
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-test</artifactId>
                <scope>test</scope>
            </dependency>
    
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-actuator</artifactId>
            </dependency>
    
        </dependencies>
    
        <build>
            <plugins>
                <plugin>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-maven-plugin</artifactId>
                </plugin>
            </plugins>
        </build>
</project>}

```
##三、编写代码
1.新建一个类，SpringBootDemoApplication
```$xslt
@SpringBootApplication
public class SpringbootDemoApplication {
        public static void main(String[] args) {
            SpringApplication.run(SpringbootDemoApplication.class, args);
        }
}
@SpringBootApplication这个注解springboot的语法，该注解包含@Configuration、@EnableAutoConfiguration和  @ComponentScan 3个注解，其中EnableAutoConfiguration代表的是启用springboot自动配置
SpringApplication.run(SpringbootDemoApplication.class, args);启动项目
注：springboot自动集成了tomcat，jetty 等servlet容器，默认配置的是tomcat，所以这里默认启动的web端口为8080，如果我们想要改变这个启动的端口，可以从配置文件或者启动参数中进行改变
args 表示的是命令行启动的参数，如果我们想要改变端口，可以SpringApplication.run(SampleController.class, "--server.port=8888");
启动一下main方法，通过网页访问http://localhost:8080/hello
springboot demo !
```