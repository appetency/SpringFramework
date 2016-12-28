package config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataConfig {

  @Bean
  public DataSource dataSource() {   /*创建嵌入式数据库*/
    DruidDataSource ds=new DruidDataSource();
    ds.setUrl("127.0.0.1:3306");
    ds.setUsername("root");
    ds.setPassword("root");
    return ds;
  }


}