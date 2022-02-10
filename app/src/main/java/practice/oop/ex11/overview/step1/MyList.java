package practice.oop.ex11.overview.step1;

import java.util.Arrays;

public class MyList {

  Object[] arr = new Object[10];
  int size;

  public void add(Object obj) {
    if (arr.length == size) {
      arr = Arrays.copyOf(arr, arr.length + (arr.length >> 1));
    }
    arr[size++] = obj;
  }

  public Object get(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException();
    }
    return arr[index];
  }

  public Object remove(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException();
    }

    Object old = arr[index];

    for (int i = index; i < (size - 1); i++) {
      arr[i] = arr[i+1];
    }
    arr[--size] = null;
    return old;
  }
}
