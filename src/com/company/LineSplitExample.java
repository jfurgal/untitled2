import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class LineSplitExample {
    public static void main(String[] args) throws IOException {
        var fileName = "product.txt";
        var productPrice  = Paths.get(fileName);
        var productName = new ArrayList<String>();
        var productCount = new ArrayList<Integer>();
        var productLines  = Files.readAllLines(productPrice);
        for (var line : productLines){
            var splitLine  = line.split(",");
            productPrice.add(splitLine[0]);
            var productCount = Integer.parseInt(splitLine[1]);
            productName.add(productNumber);
        }
        for (int i = 0; i< productName.size(); i++){
            System.out.println("Product: "+ productPrice.get(i) + " productAvailable: " + productPrice.get(i));
            while(true) {
                if (productName == productCount) {
                    System.out.println("This is available" + productCount);
                    break;
                } else {
                    if(productName> productCount)
                        System.out.println("unfortunately " + productName +" is not available");
                    else
                        System.out.println("Unfortunately " +productName+ " is not available");
                    System.out.print("What else would you like to look up?:");
                    usersName = inputReader.nextInt();
        }
    }
}
