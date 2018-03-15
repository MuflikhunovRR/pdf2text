package ru.gotoqa;

import java.io.IOException;

public class JavaPDFTest {

    public static void main(String[] args) throws IOException {

        PDFManager pdfManager = new PDFManager();
        pdfManager.setFilePath("D:\\JAVA\\Java_SRC\\pdf2text\\src\\main\\resources\\Apple_Environmental_2017.pdf");
        System.out.println(pdfManager.ToText().hashCode());
    }
}