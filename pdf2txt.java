import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class pdf2txt {
  public static void main(String[] args) {
    try {
      File file = new File(args[0]);
      PDDocument document = PDDocument.load(file);
      FileOutputStream fos = new FileOutputStream("..\\txt\\" + file.getName().replaceAll("\\.pdf$", ".txt"));
      (new PDFTextStripper()).writeText(document, new OutputStreamWriter(fos, "utf-8"));
      document.close();
      fos.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
