package com.bridgelabz;

public class MoodAnalyser {
    String mood_swing;
    MoodAnalyser(String mood_swing) {
        this.mood_swing = mood_swing;
    }

    public static void validate (String str) throws  InvalidAgeException {
        throw new InvalidAgeException("Invalid Mood");
    }

    }
    public void analyseMood(String mood){
        System.out.println("Current Mood is"+mood);
    }
    public static void main(String[] args) {
        System.out.println("Mood analyser to analyze Happy or sad Mood.");
        MoodAnalyser obj = null MoodAnalyser();
        obj.analyseMood("Happy");
        MoodAnalyser obj_swing = new MoodAnalyser("Sad");
        System.out.println("My mood is:" + obj_swing)

        try {
            validate("Enjoying");
        } catch (InvalidAgeException ex) {
            System.out.println("Caught the Exception");

            System.out.println("Exception ocuured:" + ex);

        }
    }
}
class InvalidAgeException extends Exception
{
    public InvalidAgeException(String str)
    {
        super(str);
        
    }
}
