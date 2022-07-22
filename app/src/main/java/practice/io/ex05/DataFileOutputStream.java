package practice.io.ex05;

import java.io.FileOutputStream;

public class DataFileOutputStream extends FileOutputStream {

  public DataFileOutputStream(String file) throws Exception {
    super(file);
  }

  public void writeUTF(String str) throws Exception {
    byte[] bytes = str.getBytes("UTF-8");
    this.write(bytes.length);
    this.write(bytes);
  }

  public void writeInt(int age) throws Exception {
    this.write(age >> 24);
    this.write(age >> 16);
    this.write(age >> 8);
    this.write(age);
  }

  public void writeBoolean(Boolean gender) throws Exception {
    if (gender) {
      this.write(1);
    } else {
      this.write(0);
    }
  }

}