package org.no1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;


/**
 * @author yamashita
 * @version $Revision$, 2013/03/19
 */
public class LoveSeeker {

  public static void main(String[] args) {
    FileReader in = null;
    LineNumberReader lnr = null;

    try {
      in = new FileReader("test.txt");
      lnr = new LineNumberReader(in);
      String line;

      while ((line = lnr.readLine()) != null) {
        System.out.println(line);
      }
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        lnr.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

  }
}
