package <%=group%>;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class <%=appname%> {

  public static void main(String[] args) {
    SpringApplication.run(<%=appname%>.class, args);
  }
}
