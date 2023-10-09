package com.mihaibotnariuc.maib.filemanagementservice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileTaskExecution {
    public static void main(String[] args) throws IOException {
        File fileObject = new File("src/main/java/com/mihaibotnariuc/maib/filemanagementservice/test.txt");
        System.out.println(FileManager.createTheFileIfItDoesNotExist(fileObject));
FileManager.informIfTheFileExists(fileObject);
FileManager.printTheFileName(fileObject);
FileManager.printTheAbsolutePath(fileObject);
FileManager.printIfItIsADirectoryOrAFile(fileObject);


OutputFileWriterManager.writeInformationIntoAFileUsingFileWriter(fileObject.getPath(), "Content");
        OutputFileWriterManager.writeInformationIntoAFileUsingFileWriter(fileObject.getPath(), "Altceva");
        OutputFileWriterManager.writeInformationIntoAFileByUsingBufferedWriter(fileObject,"Value Free 2");
        InputFileReadManager.printDataOnTheConsole(fileObject);
        System.out.println();
        InputFileReadManager.printDataFromTheFileUsingBufferedReader(fileObject);
        InputFileReadManager.printDataUsingTheEasiestWay(fileObject);
    }
}

