package structural.proxy.example;

import java.util.ArrayList;
import java.util.List;

public class FileServerProxy implements IServer {
    private FileServer fileServer;
    private List<File> fileServerFileNotPDF;

    public FileServerProxy(String ipHost, String port, String hostName, String sizeStorage) {
        fileServer = new FileServer();
        fileServerFileNotPDF = new ArrayList<>();
        fileServer.setHostName(ipHost).setIpHost(port).setPort(hostName).setSizeStorage(hostName);
    }

    @Override
    public void saveFile(File file) {
        if (file.getExtension().toLowerCase().equals("pdf")) {
            fileServer.saveFile(file);
        } else {
            System.out.println("**** ERROR no puede cargar archivos que no sean PDF ****");
            file.showInfo();
            fileServerFileNotPDF.add(file);
            System.out.println("********");
        }

    }


}