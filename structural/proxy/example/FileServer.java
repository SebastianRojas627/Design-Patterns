package structural.proxy.example;

import java.util.ArrayList;
import java.util.List;

public class FileServer implements IServer {

    private String ipHost;
    private String port;
    private String hostName;
    private String sizeStorage;
    private List<File> fileList;

    public FileServer() {
        fileList = new ArrayList<>();
    }

    @Override
    public void saveFile(File file) {
        fileList.add(file);
        System.out.println("saving...");
        file.showInfo();
    }

    public String getIpHost() {
        return ipHost;
    }

    public String getPort() {
        return port;
    }

    public String getHostName() {
        return hostName;
    }

    public String getSizeStorage() {
        return sizeStorage;
    }

    public FileServer setIpHost(String ipHost) {
        this.ipHost = ipHost;
        return this;
    }

    public FileServer setPort(String port) {
        this.port = port;
        return this;
    }

    public FileServer setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    public FileServer setSizeStorage(String sizeStorage) {
        this.sizeStorage = sizeStorage;
        return this;
    }
}