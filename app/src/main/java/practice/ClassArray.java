package practice;

public class ClassArray {

  static class MemberInfo{
    String name;
    int age;
    int height;
    int weight;
  }

  public static void main(String[] args) {

    MemberInfo[] arr = new MemberInfo[3];

    arr[0] = createInfo("서영범1", 29, 183, 80);
    arr[1] = createInfo("홍길동1", 35, 180, 75);
    arr[2] = createInfo("김두한1", 50, 182, 85);

    printInfo(arr);
  }

  static MemberInfo createInfo(String name, int age, int height, int weight) {
    MemberInfo info = new MemberInfo();

    info.name = name;
    info.age = age;
    info.height = height;
    info.weight = weight;

    return info;
  }

  static void printInfo(MemberInfo[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.printf("%s: 나이-%d 키-%d 몸무게-%d\n",
          arr[i].name, arr[i].age, arr[i].height, arr[i].weight);
    }
  }
}
