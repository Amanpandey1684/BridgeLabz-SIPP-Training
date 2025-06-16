public class profit_and_loss {
    public static void main(String[] args) {
        int costPrice=129;
        int sellingPrice=191;
        int profit = sellingPrice - costPrice;
        int profitPercentage = (profit * 100) / costPrice;
        System.out.println("The Cost Price is INR"+ costPrice + "and the Selling Price is INR" + sellingPrice+
                           "\nThe Profit in INR" + profit + " and the Profit Percentage is " + profitPercentage + "%.");
    }
    
}
