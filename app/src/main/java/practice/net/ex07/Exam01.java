package practice.net.ex07;

import java.net.URL;

public class Exam01 {

  public static void main(String[] args) throws Exception {

    URL url = new URL("https://search.naver.com/search.naver?"
        + "sm=tab_hty.top&where=nexearch&query=querystring&oquery=querystring&"
        + "tqi=hl5Rxsprvh8ssC8hbRZsssssteV-503775");

    System.out.println(url.getProtocol());
    System.out.println(url.getHost());
    System.out.println(url.getPort());
    System.out.println(url.getPath());
    System.out.println(url.getQuery());
  }

}
