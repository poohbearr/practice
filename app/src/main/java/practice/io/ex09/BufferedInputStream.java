package practice.io.ex09;

import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStream extends DecoratorInputStream {

  byte[] buf = new byte[8192];
  int size;
  int cursor;

  public BufferedInputStream(InputStream in) {
    super(in);
  }

  @Override
  public int read() throws IOException {
    if (cursor == size) {
      if ((size = in.read(buf)) == -1) {
        return -1;
      }
      cursor = 0;
    }
    return buf[cursor++] & 0x000000ff;
  }
}