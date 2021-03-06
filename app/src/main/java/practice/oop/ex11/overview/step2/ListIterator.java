package practice.oop.ex11.overview.step2;

public class ListIterator implements Iterator {

  MyList list;
  int cursor;

  public ListIterator(MyList list) {
    this.list = list;
  }

  @Override
  public boolean hasNext() {
    return cursor < list.size;
  }

  @Override
  public Object next() {
    return list.get(cursor++);
  }
}
