package practice.basic.ex01;

import java.util.Objects;

public class Exam0172test {

  static class Score implements Cloneable {

    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    public Score() {}

    public Score(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.sum = this.kor + this.eng + this.math;
      this.aver = sum / 3f;
    }

    @Override
    public String toString() {
      return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum="
          + sum + ", aver=" + aver + "]";
    }

    @Override
    public int hashCode() {
      return Objects.hash(aver, eng, kor, math, name, sum);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Score other = (Score) obj;
      return Float.floatToIntBits(aver) == Float.floatToIntBits(other.aver) && eng == other.eng
          && kor == other.kor && math == other.math && Objects.equals(name, other.name)
          && sum == other.sum;
    }

    @Override
    protected Score clone() throws CloneNotSupportedException {
      return (Score) super.clone();
    }
  }

  public static void main(String[] args) throws Exception{

    Score s1 = new Score("홍길동", 90, 84, 42);
    Score s2 = new Score("서영범", 84, 32, 53);

    Score s3 = s1.clone();

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);

    System.out.println(Integer.toHexString(s1.hashCode()));
    System.out.println(s3.hashCode());

    System.out.println(s1 == s3);
    System.out.println(s1.equals(s3));
  }

}
