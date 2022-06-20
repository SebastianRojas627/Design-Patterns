package structural.proxy.example;

public class Client {

    public static void main(String[] args) {

        IServer fileS = new FileServerProxy("10.10.10.10",
                "9595",
                "fileserver",
                "90TB"
        );

        File pdf = new File("ci", "pdf");
        pdf.setDescription("123123123");

        File pdf2 = new File("inscipcion", "PDF");
        pdf2.setDescription("datos");

        File word = new File("carta", "doc");
        word.setDescription("datos");

        fileS.saveFile(word);
        fileS.saveFile(pdf);
        fileS.saveFile(pdf2);

    }
}
