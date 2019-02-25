[![Build Status](https://travis-ci.com/StratfordHS-APCS/lab-14-strings-username.svg?token=L8ZuTUsXtxKqevAPVWLC&branch=master)](https://travis-ci.com/StratfordHS-APCS/lab-14-strings-username)

# Lab 14 - Strings

## Lab Goal
This lab is designed to give you some more practice with String methods while completing some problems.

## Instructions
 * Complete the `dasher` method.  This method receives a String as a parameter and returns a String containing the original String with a dash between each letter.  Input: "abcd" -> Output: "a-b-c-d".
 * Complete the `lastF` method.  This method receives a String containing a first and last name as a parameter.  This method should return the name formatted in a last-name-first-initial manner.  Input: "Dave Avis" -> Output: "Avis, D."
 * Complete the `pairFlipper` method.  This method receives a String as a parameter.  This method should return the String where each pair of letters have been reversed.  If there is an odd number of letters then the last letter doesn't get swapped with anything.  Input: "abcde" -> Output: "badce"
 * Add a `main` method to test each of the previous 3 methods.
 * Make sure you add a javadoc comment on each method.  You'll need to include a `@param` tag for each method that accepts a parameter.  Include a `@return` tag on any method that returns a value.

## Notes
* Checkstyle config link is http://www.daveavis.com/cs/checkstyle_SHS.xml
* After cloning your repo from GitHub you can open your code in BlueJ by double clicking on the **package** file.
* Edit the first line of the Readme.md file and put your username in both locations that say "username".  This is necessary if you want the badge at the top of the instructions to show red or green based on your most recent commit.

## Grading
* 30 - `dasher`
* 30 - `lastF`
* 30 - `pairFlipper`
* 10 - style

Note that these are potential maximums; the computer can only check so much.  If your code passes Checkstyle, but I see non-descriptive variable names, then your style grade will go down.  If your code passes all tests, but I see code that was copied off of the internet or from another student your grade will go *way* down.
