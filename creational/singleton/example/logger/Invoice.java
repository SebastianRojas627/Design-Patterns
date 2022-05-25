package creational.singleton.example.logger;

public class Invoice {
    private int nroInvoice;
    private int total;
    private String detail;

    public Invoice() {
        Logger.getInstance().info("Creation Invoice");
    }

    public int getNroInvoice() {
        Logger.getInstance().info("Invoice - getNroInvoice " + nroInvoice);
        return nroInvoice;
    }

    public void setNroInvoice(int nroInvoice) {
        Logger.getInstance().info("Invoice - nroInvoice " + nroInvoice);
        this.nroInvoice = nroInvoice;
    }

    public int getTotal() {
        Logger.getInstance().info("Invoice - getTotal " + total);
        return total;
    }

    public void setTotal(int total) {
        Logger.getInstance().info("Invoice - setTotal " + total);
        this.total = total;
    }

    public String getDetail() {
        Logger.getInstance().info("Invoice - getDetail " + detail);

        return detail;
    }

    public void setDetail(String detail) {
        Logger.getInstance().info("Invoice - setDetail " + detail);

        this.detail = detail;
    }
}