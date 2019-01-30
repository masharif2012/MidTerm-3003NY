package string.problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Anagram
        Assert.assertEquals(true, Anagram.isAnagram("Elbow","Below"));
        //PERMUTATION
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
    }
}