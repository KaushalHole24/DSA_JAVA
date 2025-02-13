package Java_Basic;
public class IMP_BinaryToDecimal {
    
    public static void BintoDec(int binNum){
        int myNum = binNum;
        int power = 0;
        int decimal = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decimal = (decimal + (lastDigit * (int) Math.pow(2, power)));
            power ++;
            binNum/=10;
        }
        System.out.println("Decimal of "+myNum+" is : "+decimal);
    }

    public static void DecToBin(int DecNum){
        int myNum = DecNum;
        int power = 0;
        int binary = 0;

        while(DecNum > 0){
            int lastDigit = DecNum % 2;
            binary = binary + (lastDigit * (int) Math.pow(10, power));
            power++;
            DecNum/=2;
        }
        System.out.println("Binary of "+myNum+" is : "+binary);
    }

    public static void main(String[] args){
        BintoDec(100);
        // DecToBin(10);
    }
}