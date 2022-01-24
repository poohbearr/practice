package practice.openapi.json.jackson;

import java.sql.Date;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Exam0110test {

  public static void main(String[] args) throws Exception {

    Member m = new Member();
    m.setNo(100);
    m.setName("홍길동");
    m.setEmail("hong@test.com");
    m.setPassword("1111");
    m.setPhoto("hong.gif");
    m.setTel("010-2222-1111");
    m.setRegisteredDate(new Date(System.currentTimeMillis()));

    ObjectMapper mapper = new ObjectMapper();

    String jsonStr = mapper.writeValueAsString(m);

    System.out.println(jsonStr);
  }

}
