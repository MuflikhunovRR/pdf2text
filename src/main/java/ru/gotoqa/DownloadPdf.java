package ru.gotoqa;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class DownloadPdf {

    public static void main(String[] args) {

        String fromFile = "https://images.apple.com/environment/pdf/Apple_Environmental_Responsibility_Report_2017.pdf";
        String toFile = "D:\\JAVA\\temp\\filetemp222.pdf";

        try {

            //connectionTimeout, readTimeout = 10 seconds
            FileUtils.copyURLToFile(new URL(fromFile), new File(toFile), 10000, 10000);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}