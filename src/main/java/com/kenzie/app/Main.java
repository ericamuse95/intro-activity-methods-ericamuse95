package com.kenzie.app;

import java.util.Arrays;

public class Main {
    /* To run this assignment, select Run --> Run 'Main" from the file menu at the top of IntelliJ IDEA */

    /********************************/
    /* Writing and Calling Methods  */
    /*******************************/
    // ----------------------------------------------------------------------
    // Complete the Following Exercises
    // ----------------------------------------------------------------------


    // Create helper methods to help you complete each Exercise
    // Your methods should all be public static methods

    /*******************************/
    //      EXERCISE ONE
    /******************************/

    //Here we will walk through writing a method and calling it to find the longest word in a String sentence.
    //Write static findLongestWord()

    public static String findLongestWord(String sentence){
        //First convert your sentence to an array of words
        //Loop through the words and find the longest word
        //Store the longest word in a variable
        //Return the longest word stored in that variable
        //HINT: if the multiple words have the same length return the first longest
        String longestWord = "";

        //Write your code below
        //creating variable to hold a string sentence
        //converted sentence1 to an array of words
        String [] sentenceArray = sentence.split(" ");
        //iterate through sentence1
        for(int i = 0; i < sentenceArray.length; i++){
            if(sentenceArray[i].length() > longestWord.length()){
                //store the longest word in a variable
                longestWord = sentenceArray[i];
            }
        }

        return longestWord;
    }

    public static void exerciseOne(){
        System.out.println("Exercise 1");
        String sentence = "The best thing about a boolean is even if you are wrong you are only off by a bit";
        //Now we call findLongestWord inside the method exerciseOne.
        String longestWord = findLongestWord(sentence);
        System.out.println("The longest word is: " + longestWord);

    }
    //To run exerciseOne to test your code scroll down and run main()


    /*******************************/
    //      EXERCISE TWO
    /******************************/

    //Now write a method to find the shortest word. It will be very similar to findLongestWord
    //For this exercise we provide a little less scaffolding
    //HINT: if the multiple words have the same length return the first shortest word
    public static String findShortestWord(String sentence){
        //Fill out a method for finding the shortest word
        String shortestWord = "";

        //Write your code below
        //creating variable to hold a string sentence
        //converted sentence1 to an array of words
        String [] sentenceArray = sentence.split(" ");
        String first = sentenceArray[0];

        //iterate through sentence1
        for(int i = 0; i < sentenceArray.length; i++){
            if(sentenceArray[i].length() < first.length()){
                //store the longest word in a variable
                shortestWord = sentenceArray[i];
            }
        }

        return shortestWord;
    }

    public static void exerciseTwo(){
        System.out.println("Exercise 2");
        String sentence = "The best thing about a boolean is even if you are wrong you are only off by a bit";
        //Call findShortestWord()  to print out the shortest word
        //Print out the shortest word in a message:  "The shortest word is: {shortest word}"
        //Do not include the braces {} in the output
        //Write your code below
        String shortestWord = findShortestWord(sentence);
        System.out.println("The shortest word is: " + shortestWord);







    }

    /*******************************/
    //      EXERCISE THREE
    /******************************/
    //Now we will have you write a method that returns the length of the longest word.
    //HINT:  You will need to return an int!

    //Write your method here
    public static int findLongestWordLength(String sentence){
        int longestWordLength = 0;
        String [] sentenceArray = sentence.split(" ");
        //iterate through sentence1
        for(int i = 0; i < sentenceArray.length; i++){
            if(sentenceArray[i].length() > longestWordLength) {
                //store the longest word in a variable
                longestWordLength = sentenceArray[i].length();
            }
        }

        return longestWordLength;
    }




    //Now call your method in exerciseThree()
    public static void exerciseThree(){
        System.out.println("Exercise 3");
        String sentence = "The best thing about a boolean is even if you are wrong you are only off by a bit";
        // Print the longest word to the console like this "The length of the longest word is: {length}"
        // Do not include curly braces in your output
        //Write your code below
        System.out.println("The length of the longest word is: " + findLongestWordLength(sentence));


    }

    /*******************************/
    //      EXERCISE FOUR
    /******************************/

    //Write a static countLetter() method that takes two arguments, a letter and a string. The method will count
    //how many times the letter appears in the string. Count both upper and lower case versions of the letter
    //Hint: Even though the letter is a single character long, you can still use it as a String parameteter
    //Write your method below:
    //method
    public static int countLetter(char letter, String sentence){
        int letterCount = 0;
        char fromSentence = letter;
        sentence = sentence.toLowerCase();
        String [] sentenceArray = sentence.split(" ");
        String s = "";
        for (String n:sentenceArray)
            s+=n;
        char [] charactersInSentence = s.toCharArray();

        //iterate through sentence
        //count method for vowels a e i o u including capital and lower case
        for(int i = 0; i < charactersInSentence.length; i++) {
            if (fromSentence == charactersInSentence[i]){
                letterCount++;
            }
        }
        return letterCount;




    }

    //Use your count letter in the exerciseFour method.

    public static void exerciseFour(){
        System.out.println("Exercise 4");
        String sentence = "The best thing about a boolean is even if you are wrong you are only off by a bit";
        // Call the same countLetter() method for each vowel "a", "e", "i", "o" and "u" on the sentence, upper or lower case
        // Print out the total number of each vowel
        // Then add all the totals together and display the total Count
        // Print out the total together
        //HINT USE System.out.println() for each. You can declare additional variables to store values
        //It should look something like this:
        // "Number of a's: 6"
        // ...
        // ... {other vowels}
        // ...
        // Total number of vowels: 28
        char vowelA = 'a';
        char vowelE = 'e';
        char vowelI='i';
        char vowelO='o';
        char vowelU='u';
        int numberOfA = countLetter(vowelA, sentence);
        int numberOfE = countLetter(vowelE, sentence);
        int numberOfI = countLetter(vowelI, sentence);
        int numberOfO = countLetter(vowelO, sentence);
        int numberOfU = countLetter(vowelU, sentence);
        int totalVowels = numberOfA + numberOfE + numberOfI + numberOfO + numberOfU;
        System.out.println("Number of a's: " + numberOfA);
        System.out.println("Number of e's: " + numberOfE);
        System.out.println("Number of i's: " + numberOfI);
        System.out.println("Number of o's: " + numberOfO);
        System.out.println("Number of u's: " + numberOfU);
        System.out.println("Total number of vowels: " + totalVowels);





    }

    public static void main(String[] args) {
        /* To run this assignment, select Run --> Run 'Main" from the file menu at the top of IntellliJ IDEA */
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();
    }

}
