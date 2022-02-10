package practice.oop.ex11.overview.step3;

public class QueueIterator implements Iterator {

  MyQueue queue;

  public QueueIterator(MyQueue queue) {
    this.queue = queue;
  }

  @Override
  public boolean hasNext() {
    return queue.size > 0;
  }

  @Override
  public Object next() {
    return queue.poll();
  }
}
