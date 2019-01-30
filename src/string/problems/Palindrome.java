package string.problems;

class Palindrome{

    public static void main(String args[]){

        String sample = "NAYAN";
        char[] sampleArray = sample.toCharArray();
        System.out.println(istPalindrome(sampleArray));
    }

    public static boolean istPalindrome(char[] sample){
        boolean palindrome = false;
        if(sample.length%2 == 0){
            for(int i = 0; i < sample.length/2-1; i++){
                if(sample[i] != sample[sample.length-i-1]){
                    return false;
                }else{
                    palindrome = true;
                }
            }
        }else{
            for(int i = 0; i < (sample.length-1)/2-1; i++){
                if(sample[i] != sample[sample.length-i-1]){
                    return false;
                }else{
                    palindrome = true;
                }
            }
        }
        return palindrome;
    }
}

//   Sample: NAYAN