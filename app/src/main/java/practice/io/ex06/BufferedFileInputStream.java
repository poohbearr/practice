package practice.io.ex06;

import java.io.FileInputStream;
import java.io.IOException;

public class BufferedFileInputStream extends FileInputStream {

  byte[] buf = new byte[8192];
  int size;
  int cursor;
  int readCount;

  public BufferedFileInputStream(String file) throws Exception {
    super(file);
  }

  @Override
  public int read() throws IOException {
    if (size == cursor) {
      if ((size = super.read(buf)) == -1) {
        return -1;
      }
      readCount++;
      System.out.printf("버퍼 왕창 읽음!--%d번째\n", readCount);
      cursor = 0;
    }
    return buf[cursor++] & 0x000000ff;
  }
}