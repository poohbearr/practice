package practice.io.ex09;

import java.io.InputStream;

public class DataInputStream extends DecoratorInputStream {

  public DataInputStream(InputStream in) {
    super(in);
  }

  public String readUTF() throws Exception {
    int size = in.read();
    byte[] bytes = new byte[size];
    in.read(bytes);
    return new String(bytes, "UTF-8");
  }

  public int readInt() throws Exception {
    int value = 0;
    value += in.read() << 24;
    value += in.read() << 16;
    value += in.read() << 8;
    value += in.read();
    return value;
  }

  public long readLong() throws Exception {
    long value = 0;
    value += (long) in.read() << 56;
    value += (long) in.read() << 48;
    value += (long) in.read() << 40;
    value += (long) in.read() << 36;
    value += (long) in.read() << 24;
    value += (long) in.read() << 16;
    value += (long) in.read() << 8;
    value += in.read();
    return value;
  }

  public Boolean readBoolean() throws Exception {
    if (in.read() == 1) {
      return true;
    } else {
      return false;
    }
  }
}