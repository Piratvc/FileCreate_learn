package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    static void dirCreate(String dir, StringBuilder stringBuilder) {

        File dir1 = new File(dir);
        if (dir1.mkdir())
            stringBuilder.append(dir + " - директория создана успешно" + "\n");

    }

    static void fileCreate(String dir, StringBuilder stringBuilder) {
        File myFile = new File(dir);
        try {
            if (myFile.createNewFile())
                stringBuilder.append(dir + " - файл создан успешно" + "\n");
        } catch (IOException ex) {
            stringBuilder.append(dir + " - ошибка создания файла" + "\n");
            System.out.println(ex.getMessage());
        }
    }

    static void logFileCreate(String dir, String text) throws IOException {
        FileWriter logFile = new FileWriter(dir);
        logFile.write(text);
        logFile.close();
    }

    public static void main(String[] args) throws Exception {
        StringBuilder log = new StringBuilder();

        dirCreate("C:\\Games\\src", log);
        dirCreate("C:\\Games\\res", log);
        dirCreate("C:\\Games\\savegames", log);
        dirCreate("C:\\Games\\temp", log);
        dirCreate("C:\\Games\\src\\main", log);
        dirCreate("C:\\Games\\src\\test", log);
        dirCreate("C:\\Games\\res\\drawables", log);
        dirCreate("C:\\Games\\res\\vectors", log);
        dirCreate("C:\\Games\\res\\icons", log);

        fileCreate("C:\\Games\\src\\main\\Main.java", log);
        fileCreate("C:\\Games\\src\\main\\Utils.java", log);

        logFileCreate("C:\\Games\\temp\\temp.txt", String.valueOf(log));

    }

}

