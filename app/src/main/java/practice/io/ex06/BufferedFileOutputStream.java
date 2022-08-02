package practice.io.ex06;

import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedFileOutputStream extends FileOutputStream {

  byte[] buf = new byte[8192];
  int cursor;

  public BufferedFileOutputStream(String file) throws Exception {
    super(file);
  }

  @Override
  public void write(int b) throws IOException {
    if (cursor == buf.length) {
      super.write(buf);
      cursor = 0;
    }
    buf[cursor++] = (byte) b;
  }

  @Override
  public void flush() throws IOException {
    if (cursor > 0) {
      this.write(buf, 0, cursor);
      cursor = 0;
    }
  }

  @Override
  public void close() throws IOException {
    this.flush();
    super.close();
  }
}