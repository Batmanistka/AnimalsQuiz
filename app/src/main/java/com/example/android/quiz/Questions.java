package com.example.android.quiz;

import android.os.Bundle;

//questions, images and answers
public class Questions {

    public static String [] mQuestions = {
            "What is the maximum speed of a running cat?",
            "Can birds fly back?",
            "What is the kangaroo tail for?",
            "What species have menopausal similar to women?",
            "Which sea creature sleeps with one open eye?",
            "What percent of life sloth is sleeping?",
            "The largest frog in the world, the goliat frog, is able to jump:",
            "Which animal has an unusually blue-black color of the tongue?",
            "Why flamingos are pink?",
            "Which animal is faster than Usain Bolt?",
    };

    public String mChoices [] [] = {
            {"21 km", "34 km", "48 km", "62 km" },
            {"only hummingbirds can", "they can not", "yes, of course!", "only when they get scared"},
            {"to lure partners", "to get away from insects", "for body balance during jumps", "to play"},
            {"brown bear and panda", "kiwi and tiger", "cat and dog", "whale and elephant"},
            {"octopus", "dolphin", "seahorse", "jellyfish"},
            {"60%", "40%", "up to 80%", "20%"},
            {"3 meters", "1 meter", "10 meters", "0.5 meters"},
            {"lama", "crocodile", "squirrel", "giraffe"},
            {"it is their natural color", "because they eat plankton and shrimp", "the color serves as their camouflage",
                    "they just like to look sexy!;)"},
            {"polar bear", "house cat", "alligator", "raccoon"},
    };


    private String mCorrectAnswers [] = {"48 km", "only hummingbirds can", "for body balance during jumps",
            "whale and elephant", "dolphin", "up to 80%", "3 meters", "giraffe", "because they eat plankton and shrimp", "house cat"};


    public int[] getImageView = new int[]{
            R.drawable.cat, R.drawable.gesi, R.drawable.kangaroo, R.drawable.mis, R.drawable.seahorse,
            R.drawable.sloth, R.drawable.frog, R.drawable.tongue, R.drawable.flamingo, R.drawable.cheetah};


    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = mChoices[a] [0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoices[a] [1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a] [2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice3 = mChoices[a] [3];
        return choice3;
    }


    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}