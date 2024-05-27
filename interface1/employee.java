package interface1;

class employee implements Payable {
    private Integer registrationNumber;
    private String name;
    private Integer salaryPerMonth;
    private Invoice[] invoices;

    public employee(Integer registrationNumber, String name, Integer salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public double getPayableAmount() {
        double totalInvoices = 0;
        for (Invoice invoice : invoices) {
          totalInvoices += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoices;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nomor Registrasi: ").append(registrationNumber).append("\n");
        sb.append("Nama: ").append(name).append("\n");
        sb.append("Gaji per Bulan: Rp").append(salaryPerMonth).append("\n");
        sb.append("Faktur:\n");
        for (Invoice invoice : invoices) {
          sb.append("- ").append(invoice.toString()).append("\n");
        }
        sb.append("Total Gaji setelah Potongan: Rp").append(getPayableAmount());
        return sb.toString();
      }
}

