import java.util.Scanner;
 class profitOrLoss{
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter Cost Price:: ");
  int costPrice = sc.nextInt();

  System.out.println("Enter Selling Price:: ");
  int sellingPrice = sc.nextInt();
  
  if(sellingPrice > costPrice)
  {
      int profit = sellingPrice - costPrice;
      System.out.println("The Seller Made Profit :: " + profit);
  }
 else if (costPrice > sellingPrice)
 {
     int loss = costPrice - sellingPrice ;
     System.out.println("The Seller Incurred loss :: " + loss);
 }

 else{
     System.out.println("The Seller made no prfit or no loss.");
 }

}
}