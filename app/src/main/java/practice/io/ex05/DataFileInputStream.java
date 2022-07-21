package practice.io.ex05;

import java.io.FileInputStream;

public class DataFileInputStream extends FileInputStream {

  public DataFileInputStream(String file) throws Exception {
    super(file);
  }

  public String readUTF() throws Exception {
    int size = this.read();
    byte[] buf = new byte[size];
    this.read(buf);
    return new String(buf, "UTF-8");
  }

  public int readInt() throws Exception {

    int value = 0;
    value = this.read() << 24;
    value += this.read() << 16;
    value += this.read() << 8;
    value += this.read();
    return value;
  }

  public long readLong() throws Exception {

    long value = 0;
    value = (long) this.read() << 56;
    value += (long) this.read() << 48;
    value += (long) this.read() << 40;
    value += (long) this.read() << 32;
    value += (long) this.read() << 24;
    value += (long) this.read() << 16;
    value += (long) this.read() << 8;
    value += (long) this.read();
    return value;
  }

  public Boolean readBoolean() throws Exception {
    if (this.read() == 1) {
      return true;
    } else {
      return false;
    }
  }

}