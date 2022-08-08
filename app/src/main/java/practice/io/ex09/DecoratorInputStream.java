package practice.io.ex09;

import java.io.IOException;
import java.io.InputStream;

public abstract class DecoratorInputStream extends InputStream {

  InputStream in;
  public DecoratorInputStream(InputStream in) {
    this.in = in;
  }

  @Override
  public int read() throws IOException {
    return in.read();
  }

  @Override
  public void close() throws IOException {
    in.close();
  }

}