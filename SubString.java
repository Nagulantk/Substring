import java.util.Scanner;
public class SubString {
    public  static void main(String[] args)
    {
    Scanner input=new Scanner(System.in);
    String string=input.nextLine();
    string=string.toLowerCase();
    findingSubString(string);
    }
    public static void findingSubString(String string)
    {
        boolean condition;
        int indexOne;
        int count,countOne=0;
        for(int i=0;i<string.length();i++)
        {
            for(int j=i+1;j<string.length();j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    count = 0;
                    indexOne = i;
                    condition = true;
                    while (condition) {
                        if (i < string.length() && j < string.length()) {
                            if (string.charAt(i) == string.charAt(j)) {
                                count++;
                                i++;
                                j++;
                            }
                            else {
                                if (count > 2) {
                                    printingString(indexOne,i,string);
                                    System.out.println();countOne=1;
                                }
                            else {
                                    i = indexOne;
                                }
                                condition = false;
                            }
                        }
                        else {
                          if (count >=2) {
                              printingString(indexOne-1,i+1,string);
                             i = string.length();
                                j = string.length();countOne=1;
                           }
                            condition = false;
                        }
                    }
                }
            }
        }
        if(countOne==0)
        {
            System.out.println("None");
        }
    }
    public static void printingString(int indexOne,int indexTwo,String string)
    {
        for (int k = indexOne ; k < indexTwo; k++) {
            System.out.print(string.charAt(k));
        }
    }
}