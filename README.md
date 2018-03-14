# spring boot基础工程  
## 包含组件
1、spring boot 热部署工具 devTools  
2、前端渲染框架 thymeleaf  
3、mysql数据库链接  
4、mybatis  
5、json处理工具fastjson  
6、数据库操作通用类tk.mybatis

## 本地安装测试地址:
  localhost:8080/test
## 测试数据库配置
spring.datasource.driver=com.mysql.jdbc.Driver  
spring.datasource.url=jdbc:mysql://localhost:3306/demo?autoReconnect=true&amp;failOverReadOnly=false&amp;useUnicode=true&amp;characterEncoding=UTF-8  
spring.datasource.username=root  
spring.datasource.password=123456
## 测试数据库建表sql
CREATE DATABASE DEMO;
USE DEMO;
USE DEMO1;
CREATE TABLE DEMO(
  ID INT(11) AUTO_INCREMENT NOT NULL PRIMARY KEY,
  NAME VARCHAR(255)
);
INSERT INTO DEMO VALUES(NULL,'TEST1');
INSERT INTO DEMO VALUES(NULL,'TEST2');
