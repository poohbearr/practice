package practice.openapi.json.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ExamTest {

  public static void main(String[] args) throws Exception {

    String jsonStr = "{\"no\":100,\"name\":\"홍길동\",\"email\":\"hong@test.com\",\"password\":\"1111\",\"photo\":\"hong.gif\",\"tel\":\"010-2222-1111\",\"registeredDate\":1642991105179}";

    ObjectMapper mapper = new ObjectMapper();

    Member m = mapper.readValue(jsonStr, Member.class);

    System.out.println(m);
    System.out.println("----------");

    jsonStr = mapper.writeValueAsString(m);

    System.out.println(jsonStr);
  }

}
