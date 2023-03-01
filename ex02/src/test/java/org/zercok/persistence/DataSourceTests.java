package org.zercok.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//JAVA 설정을 사요하는 경우
//@ContetConfiguration(classes = {RootConfig.class})
@Log4j
public class DataSourceTests {

@Setter(onMethod_ = { @Autowired })
 private DataSource dataSource;
	
	  @Setter(onMethod_ = { @Autowired })
 private SqlSessionFactory sqlSessionFactory;

 @Test
 public void testConnection() {
	 
	 try (Connection con = dataSource.getConnection()){
		 
		 log.info(con);
	 }catch(Exception e) {
		 fail(e.getMessage());
	 }
 }
}
