package com.pluralsight;

public class Receipt {
    {
        private String filename;
        private LocalDateTime datetime;

        public Receipt(String filename) {
        this.filename = filename;
        this.datetime = LocalDateTime.now();
    }

        public void generateReceipt (Order order){
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(formatReceipt(order));
            System.out.println("Receipt generated successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while generating the receipt.");
            e.printStackTrace();
        }
    }

        private String formatReceipt (Order order){
        StringBuilder receipt = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        receipt.append("Receipt\n");
        receipt.append("Date: ").append(datetime.format(formatter)).append("\n");
        receipt.append("----------------------------\n");
        receipt.append("Order ID: ").append(order.getOrderId()).append("\n");
        receipt.append("Customer: ").append(order.getCustomerName()).append("\n");
        receipt.append("----------------------------\n");
        receipt.append("Items:\n");

        double total = 0;
        for (OrderItem item : order.getItems()) {
            receipt.append(item.getQuantity()).append(" x ").append(item.getProductName())
                    .append(" @ $").append(item.getPrice()).append(" = $")
                    .append(item.getQuantity() * item.getPrice()).append("\n");
            total += item.getQuantity() * item.getPrice();
        }

        receipt.append("----------------------------\n");
        receipt.append("Total: $").append(total).append("\n");
        receipt.append("----------------------------\n");
        receipt.append("Thank you for your purchase!");

        return receipt.toString();
    }


