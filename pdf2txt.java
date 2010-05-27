import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class pdf2txt {
  public static void main(String[] args) {
    try {
      String path     = args[0];
      String dir      = args[1];
      String encoding = args[2];

      File file = new File(path);
      PDDocument document = PDDocument.load(file);
      FileOutputStream fos = new FileOutputStream(dir + file.getName().replaceAll("\\.pdf$", ".txt"));
      (new PDFTextStripper()).writeText(document, new OutputStreamWriter(fos, encoding));

      document.close();
      fos.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
