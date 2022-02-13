// inner class 응용 I : 1단계 - 스태틱 중첩 클래스 사용 
package practice.oop.ex11.c;

import java.util.ArrayList;
import java.util.List;

public class Exam0711 {

  public static void main(String[] args) {
    Musics1 m1 = new Musics1();
    m1.add("aaa.mp3");
    m1.add("bbb.mp3");
    m1.add("ccc.mp3");

    Musics1 m2 = new Musics1();
    m2.add("xxx.mp3");
    m2.add("yyy.mp3");

    Musics1.Player p1 = m1.createPlayer();
    Musics1.Player p2 = m2.createPlayer();

    p1.play();
    p2.play();
  }
}


class Musics1 {

  List<String> songs = new ArrayList<>();

  public void add(final String song) {
    songs.add(song);
  }

  public void delete(final int index) {
    songs.remove(index);
  }

  public Player createPlayer() {
    return new Player();
  }


  class Player {

    public void play() {
      for (final String song : Musics1.this.songs) {
        System.out.println(song);
      }
      System.out.println("-----------------------------");
    }
  }


}


