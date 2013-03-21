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

    String key = "あい"; //$NON-NLS-1$

    try {
      in = new FileReader("test.txt");
      lnr = new LineNumberReader(in);
      String line;

      while ((line = lnr.readLine()) != null) {
        if (line.contains(key)) {
          System.out.println(lnr.getLineNumber() + "行目");
          System.out.println(line);
        }
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
