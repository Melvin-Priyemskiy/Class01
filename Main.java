import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Set;
public class Main {

    public static void main(String[] args) 
    {

        System.out.println("hello");
        System.out.println(isEven(9));;
    }

    //Question 1
    public static void fizzBuzz()
    {
        for(int x=1; x<=15; x++)
        {
            if(x%3==0)
            {
                if(x%5==0)
                {
                    System.out.println("Fizzbuzz");
                    return;
                }
                System.out.println("Fizz");
            }
            if(x%5==0)
            {
                System.out.println("buzz");
            }
        }
    }

    //Question 2
    public static boolean isEven(Integer num)
    {
        if(num%2==0)
        {
            return true;
        }
        return false;
    }

    //Question 3
    public static Integer getMinimum(Integer[] numbers)
    {
        
        return null;
    }

/*
    //Question 4
    public static ArrayList<User> getParsedUsers(String[] strings){

    }

    //Question 5
    public static void printUsers_OMN(ArrayList<User> users){

    }


    //Question 6
    public static void printUsersSortedByAge(ArrayList<User> users){

    }

    //Question 7
    public static void printUsersOldest10(ArrayList<User> users){

    }

    //Question 8
    public static void printUserStateStats(ArrayList<User> users){

    }

    //Question 9
    public static Set<String> getWordOverlap(String[] listA, String[] listB){

    }

    //Question 10
    public static ArrayList<User> getUserOverlap(ArrayList<User> usersA, ArrayList<User> usersB){

    }
*/


}
