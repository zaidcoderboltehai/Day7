public class ArraySum {

    public static void main(String[] args) {

        // Step 1: Array declaration and initialization
        int[] numbers = {1, 2, 3, 4, 5};  // Single-dimensional array of integers

        // Step 2: Variable to store the sum
        int sum = 0;

        // Step 3: Loop through the array and calculate the sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];  // Add each element to the sum
        }

        // Step 4: Print the sum of all elements
        System.out.println("The sum of all elements in the array is: " + sum);
    }
}


public class MatrixSum {

    public static void main(String[] args) {

        // Step 1: 2D Array (Matrix) Declaration and Initialization
        int[][] matrix = {
                {1, 2, 3},  // First row
                {4, 5, 6},  // Second row
                {7, 8, 9}   // Third row
        };

        // Step 2: Variable to store the sum
        int sum = 0;

        // Step 3: Loop through the 2D array and calculate the sum
        for (int i = 0; i < matrix.length; i++) {  // Loop through rows
            for (int j = 0; j < matrix[i].length; j++) {  // Loop through columns
                sum += matrix[i][j];  // Add each element to sum
            }
        }

        // Step 4: Print the sum of all elements in the matrix
        System.out.println("The sum of all elements in the matrix is: " + sum);
    }
}

public class ArrayCopyExample {

    public static void main(String[] args) {

        // Step 1: Original Array
        int[] originalArray = {1, 2, 3, 4, 5};  // Ye original array hai jisme values hain

        // Step 2: New Array (Destination Array)
        int[] copiedArray = new int[5];  // Ye new array hai jisme hum values copy karenge

        // Step 3: Using arraycopy() to copy elements from originalArray to copiedArray
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        // Step 4: Print both arrays to see the result
        System.out.println("Original Array: ");
        for (int i : originalArray) {
            System.out.print(i + " ");  // Original array ko print karenge
        }

        System.out.println("\nCopied Array: ");
        for (int i : copiedArray) {
            System.out.print(i + " ");  // Copied array ko print karenge
        }
    }
}

public class ArraySubsetCopyExample {

    public static void main(String[] args) {

        // Step 1: Original Array
        int[] originalArray = {10, 20, 30, 40, 50, 60, 70};  // Ye original array hai

        // Step 2: New Array (Destination Array)
        int[] copiedArray = new int[3];  // Ye new array hai jisme hum subset copy karenge

        // Step 3: Copying a subset of elements from originalArray to copiedArray
        System.arraycopy(originalArray, 2, copiedArray, 0, 3);

        // Step 4: Print the arrays to see the result
        System.out.println("Original Array: ");
        for (int i : originalArray) {
            System.out.print(i + " ");  // Original array ko print karenge
        }

        System.out.println("\nCopied Subset Array: ");
        for (int i : copiedArray) {
            System.out.print(i + " ");  // Copied array ko print karenge
        }
    }
}

public class ManualArrayCopyExample {

    public static void main(String[] args) {

        // Step 1: Original Array
        int[] originalArray = {1, 2, 3, 4, 5};  // Humne ek original array banaya hai

        // Step 2: New Array (Destination Array)
        int[] copiedArray = new int[originalArray.length];  // Hum new array banate hain jisme copied elements jaayenge

        // Step 3: Manually Copying Elements using a loop
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];  // Har element ko originalArray se copiedArray mein daalte hain
        }

        // Step 4: Print Both Arrays
        System.out.println("Original Array: ");
        for (int i : originalArray) {
            System.out.print(i + " ");  // Original array ko print karenge
        }

        System.out.println("\nCopied Array: ");
        for (int i : copiedArray) {
            System.out.print(i + " ");  // Copied array ko print karenge
        }
    }
}

public class MultiDimensionalArrayCopy {

    public static void main(String[] args) {

        // Step 1: Original 2D Array (Matrix)
        int[][] originalMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Step 2: New 2D Array (Matrix) for copying
        int[][] copiedMatrix = new int[originalMatrix.length][originalMatrix[0].length];

        // Step 3: Manually Copying Elements using Nested Loops
        for (int i = 0; i < originalMatrix.length; i++) {
            for (int j = 0; j < originalMatrix[i].length; j++) {
                copiedMatrix[i][j] = originalMatrix[i][j];  // Copying element from original to copied matrix
            }
        }

        // Step 4: Print Both Matrices to verify
        System.out.println("Original Matrix: ");
        for (int i = 0; i < originalMatrix.length; i++) {
            for (int j = 0; j < originalMatrix[i].length; j++) {
                System.out.print(originalMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nCopied Matrix: ");
        for (int i = 0; i < copiedMatrix.length; i++) {
            for (int j = 0; j < copiedMatrix[i].length; j++) {
                System.out.print(copiedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {

    // Board declaration
    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    // Function to print the board
    public static void printBoard() {
        System.out.println("Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j != 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i != 2) {
                System.out.println("--+---+--");
            }
        }
    }

    // Function to check if the game is won by any player
    public static boolean checkWin(char player) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    // Function to check if the board is full
    public static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // Function for computer's turn to randomly pick a cell
    public static void computerTurn() {
        Random rand = new Random();
        int row, col;
        do {
            row = rand.nextInt(3);
            col = rand.nextInt(3);
        } while (board[row][col] != ' '); // Keep trying if cell is already occupied
        board[row][col] = 'O';  // Computer marks 'O'
        System.out.println("Computer marked at row: " + (row + 1) + " and column: " + (col + 1));
    }

    // Function for user's turn to input a cell
    public static void userTurn(Scanner sc) {
        int row, col;
        do {
            System.out.print("Enter row (1-3): ");
            row = sc.nextInt() - 1;
            System.out.print("Enter column (1-3): ");
            col = sc.nextInt() - 1;
        } while (board[row][col] != ' ');  // Keep asking if the cell is already occupied
        board[row][col] = 'X';  // User marks 'X'
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Game loop
        while (true) {
            printBoard();  // Print board after every turn

            // User's turn
            userTurn(sc);
            if (checkWin('X')) {
                printBoard();
                System.out.println("Congratulations! You win!");
                break;
            }
            if (checkDraw()) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }

            // Computer's turn
            computerTurn();
            if (checkWin('O')) {
                printBoard();
                System.out.println("Computer wins!");
                break;
            }
            if (checkDraw()) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }
        }
    }
}

public class PrimeNumbers {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;  // 1 aur negative numbers prime nahi hote
        for (int i = 2; i <= Math.sqrt(num); i++) {  // Number ko check karte hain
            if (num % i == 0) return false;  // Agar divisor mil gaya toh not prime
        }
        return true;  // Agar koi divisor nahi mila, toh prime number hai
    }

    // Main function to find prime numbers in ranges 0-1000 and store them in 2D array
    public static void main(String[] args) {
        // 2D Array to store prime numbers in different ranges
        // There are 10 ranges (0-100, 100-200, ..., 900-1000)
        int[][] primeNumbers = new int[10][];

        // Loop through ranges 0-100, 100-200, ..., 900-1000
        for (int i = 0; i < 10; i++) {
            int lowerBound = i * 100;  // Lower bound of the range (0, 100, 200, ...)
            int upperBound = (i + 1) * 100;  // Upper bound of the range (100, 200, 300, ...)

            // ArrayList to store primes in this range
            ArrayList<Integer> primesInRange = new ArrayList<>();

            // Loop through numbers in the current range
            for (int num = lowerBound; num < upperBound; num++) {
                if (isPrime(num)) {  // Check if the number is prime
                    primesInRange.add(num);  // If prime, add it to the list
                }
            }

            // Convert ArrayList to array and store in 2D array
            primeNumbers[i] = new int[primesInRange.size()];
            for (int j = 0; j < primesInRange.size(); j++) {
                primeNumbers[i][j] = primesInRange.get(j);  // Copy prime numbers into the 2D array
            }
        }

        // Print the prime numbers stored in the 2D array
        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.print("Prime numbers in range " + (i * 100) + " - " + ((i + 1) * 100) + ": ");
            for (int j = 0; j < primeNumbers[i].length; j++) {
                System.out.print(primeNumbers[i][j] + " ");  // Print each prime number
            }
            System.out.println();  // New line after printing each range
        }
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeAnagramNumbers {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;  // 1 aur negative numbers prime nahi hote
        for (int i = 2; i <= Math.sqrt(num); i++) {  // Number ko check karte hain
            if (num % i == 0) return false;  // Agar divisor mil gaya toh not prime
        }
        return true;  // Agar koi divisor nahi mila, toh prime number hai
    }

    // Function to check if two numbers are anagrams
    public static boolean areAnagrams(int num1, int num2) {
        // Convert numbers to strings, sort the characters and compare
        char[] num1Chars = String.valueOf(num1).toCharArray();
        char[] num2Chars = String.valueOf(num2).toCharArray();

        Arrays.sort(num1Chars);  // Sort the digits of num1
        Arrays.sort(num2Chars);  // Sort the digits of num2

        return Arrays.equals(num1Chars, num2Chars);  // If both sorted arrays are same, they are anagrams
    }

    public static void main(String[] args) {
        // 2D Array to store prime numbers that are anagrams
        int[][] primeAnagrams = new int[10][];

        // Loop through ranges 0-100, 100-200, ..., 900-1000
        for (int i = 0; i < 10; i++) {
            int lowerBound = i * 100;  // Lower bound of the range (0, 100, 200, ...)
            int upperBound = (i + 1) * 100;  // Upper bound of the range (100, 200, 300, ...)

            // ArrayList to store prime anagram numbers in this range
            ArrayList<Integer> primeAnagramList = new ArrayList<>();

            // Loop through numbers in the current range
            for (int num = lowerBound; num < upperBound; num++) {
                if (isPrime(num)) {  // Check if the number is prime
                    // Check if any previously found prime number is an anagram of the current prime
                    for (int prime : primeAnagramList) {
                        if (areAnagrams(prime, num)) {
                            primeAnagramList.add(num);  // If it's an anagram, add it to the list
                            break;
                        }
                    }
                    // If no anagram is found, add the prime number to the list
                    primeAnagramList.add(num);
                }
            }

            // Convert ArrayList to array and store in 2D array
            primeAnagrams[i] = new int[primeAnagramList.size()];
            for (int j = 0; j < primeAnagramList.size(); j++) {
                primeAnagrams[i][j] = primeAnagramList.get(j);  // Copy prime anagram numbers into the 2D array
            }
        }

        // Print the prime anagram numbers stored in the 2D array
        for (int i = 0; i < primeAnagrams.length; i++) {
            System.out.print("Prime Anagrams in range " + (i * 100) + " - " + ((i + 1) * 100) + ": ");
            for (int j = 0; j < primeAnagrams[i].length; j++) {
                System.out.print(primeAnagrams[i][j] + " ");  // Print each prime anagram number
            }
            System.out.println();  // New line after printing each range
        }
    }
}

import java.util.ArrayList;

public class PrimePalindromeNumbers {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;  // 1 aur negative numbers prime nahi hote
        for (int i = 2; i <= Math.sqrt(num); i++) {  // Number ko check karte hain
            if (num % i == 0) return false;  // Agar divisor mil gaya toh not prime
        }
        return true;  // Agar koi divisor nahi mila, toh prime number hai
    }

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;  // Extract the last digit
            reversedNum = reversedNum * 10 + digit;  // Reverse the number
            num /= 10;  // Remove the last digit from the number
        }

        return originalNum == reversedNum;  // If original number equals reversed, it's a palindrome
    }

    public static void main(String[] args) {
        // 2D Array to store prime numbers that are palindromes
        int[][] primePalindromes = new int[10][];

        // Loop through ranges 0-100, 100-200, ..., 900-1000
        for (int i = 0; i < 10; i++) {
            int lowerBound = i * 100;  // Lower bound of the range (0, 100, 200, ...)
            int upperBound = (i + 1) * 100;  // Upper bound of the range (100, 200, 300, ...)

            // ArrayList to store prime palindrome numbers in this range
            ArrayList<Integer> primePalindromeList = new ArrayList<>();

            // Loop through numbers in the current range
            for (int num = lowerBound; num < upperBound; num++) {
                if (isPrime(num) && isPalindrome(num)) {  // Check if the number is both prime and palindrome
                    primePalindromeList.add(num);  // If true, add to the list
                }
            }

            // Convert ArrayList to array and store in 2D array
            primePalindromes[i] = new int[primePalindromeList.size()];
            for (int j = 0; j < primePalindromeList.size(); j++) {
                primePalindromes[i][j] = primePalindromeList.get(j);  // Copy prime palindrome numbers into the 2D array
            }
        }

        // Print the prime palindrome numbers stored in the 2D array
        for (int i = 0; i < primePalindromes.length; i++) {
            System.out.print("Prime Palindromes in range " + (i * 100) + " - " + ((i + 1) * 100) + ": ");
            for (int j = 0; j < primePalindromes[i].length; j++) {
                System.out.print(primePalindromes[i][j] + " ");  // Print each prime palindrome number
            }
            System.out.println();  // New line after printing each range
        }
    }
}

public class Calendar {

    // Function to calculate the day of the week for a given date using Zeller's formula
    public static int getDayOfWeek(int day, int month, int year) {
        int y0 = year - (14 - month) / 12;  // Calculate y0
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;  // Calculate x
        int m0 = month + 12 * ((14 - month) / 12) - 2;  // Calculate m0
        int d0 = (day + x + 31 * m0 / 12) % 7;  // Calculate the day of the week (0 = Saturday, 1 = Sunday, ...)

        return d0;  // Return the day of the week
    }

    // Function to print the calendar for the given month and year
    public static void printCalendar(int month, int year) {
        // Array for storing the calendar (weeks x days of the week)
        int[][] calendar = new int[6][7];  // 6 weeks (maximum in a month) x 7 days in a week

        // First day of the month (using Zeller's formula)
        int dayOfWeek = getDayOfWeek(1, month, year);  // 1st day of the month

        // Days in the given month
        int daysInMonth;
        if (month == 2) {  // February
            daysInMonth = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;  // Leap year check
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {  // April, June, September, November
            daysInMonth = 30;
        } else {  // Other months
            daysInMonth = 31;
        }

        // Fill the 2D calendar array with the days
        int day = 1;
        for (int week = 0; week < 6; week++) {
            for (int dayOfWeekInWeek = 0; dayOfWeekInWeek < 7; dayOfWeekInWeek++) {
                if (week == 0 && dayOfWeekInWeek < dayOfWeek) {
                    // Empty slots before the first day of the month
                    calendar[week][dayOfWeekInWeek] = 0;
                } else if (day <= daysInMonth) {
                    // Fill the calendar with days of the month
                    calendar[week][dayOfWeekInWeek] = day++;
                } else {
                    // Empty slots after the last day of the month
                    calendar[week][dayOfWeekInWeek] = 0;
                }
            }
        }

        // Print the calendar
        System.out.println("Calendar for " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print each week of the month
        for (int week = 0; week < 6; week++) {
            for (int dayOfWeekInWeek = 0; dayOfWeekInWeek < 7; dayOfWeekInWeek++) {
                if (calendar[week][dayOfWeekInWeek] != 0) {
                    // Print the day if it's not 0 (indicating empty slot)
                    System.out.printf("%2d ", calendar[week][dayOfWeekInWeek]);
                } else {
                    // Print spaces for empty slots
                    System.out.print("   ");
                }
            }
            System.out.println();  // Newline after each week
        }
    }

    // Helper function to get the name of the month from the month number
    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    public static void main(String[] args) {
        // Get the month and year from command-line arguments
        if (args.length < 2) {
            System.out.println("Please provide month and year as command-line arguments.");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);

        // Validate the month and year
        if (month < 1 || month > 12 || year < 0) {
            System.out.println("Invalid month or year.");
            return;
        }

        // Print the calendar for the given month and year
        printCalendar(month, year);
    }
}

import java.util.*;

public class CardGame {

    // Card class to represent each card with a suit and rank
    static class Card {
        String suit;
        String rank;

        // Constructor to initialize a card
        public Card(String suit, String rank) {
            this.suit = suit;
            this.rank = rank;
        }

        // Override toString() method to print the card easily
        @Override
        public String toString() {
            return this.rank + " of " + this.suit;
        }
    }

    public static void main(String[] args) {

        // Step 1: Initialize deck of cards
        List<Card> deck = initializeDeck();

        // Step 2: Shuffle the deck
        shuffleDeck(deck);

        // Step 3: Distribute 9 cards to 4 players
        List<Card>[] players = distributeCards(deck);

        // Step 4: Print cards received by each player
        printPlayerCards(players);
    }

    // Function to initialize the deck of cards
    public static List<Card> initializeDeck() {
        List<Card> deck = new ArrayList<>();

        String[] suits = { "Hearts", "Spades", "Diamonds", "Clubs" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

        // Loop through each suit and rank to create a card
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(suit, rank));
            }
        }

        return deck;
    }

    // Function to shuffle the deck of cards
    public static void shuffleDeck(List<Card> deck) {
        // Randomly shuffle the cards in the deck
        Collections.shuffle(deck);
    }

    // Function to distribute 9 cards to 4 players
    public static List<Card>[] distributeCards(List<Card> deck) {
        List<Card>[] players = new List[4];

        // Initialize the players' hands
        for (int i = 0; i < 4; i++) {
            players[i] = new ArrayList<>();
        }

        // Distribute 9 cards to each player
        int cardIndex = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 4; j++) {
                players[j].add(deck.get(cardIndex++));
            }
        }

        return players;
    }

    // Function to print cards received by each player
    public static void printPlayerCards(List<Card>[] players) {
        for (int i = 0; i < 4; i++) {
            System.out.println("Player " + (i + 1) + "'s cards: ");
            for (Card card : players[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}

import java.util.*;

public class SumOfThree {

    // Method to find the triplets whose sum is zero
    public static void findTriplets(int[] arr) {
        int n = arr.length;
        Set<List<Integer>> result = new HashSet<>(); // To store unique triplets

        // Step 1: Use 3 nested loops to find all triplets
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Check if sum of the triplet is zero
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        // Step 2: Add the triplet to result (ensure it's unique)
                        List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(triplet); // Sorting to ensure uniqueness
                        result.add(triplet);
                    }
                }
            }
        }

        // Step 3: Print the result
        System.out.println("Number of distinct triplets: " + result.size());

        System.out.println("The distinct triplets are:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }

    // Main method to test the code
    public static void main(String[] args) {
        // Input: N integers
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int N = scanner.nextInt();

        int[] arr = new int[N];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call the method to find triplets
        findTriplets(arr);

        scanner.close();
    }
}

import java.util.*;

public class GamblingSimulator {

    // Method to simulate one gambling game
    public static void simulateGame(int stake, int goal, int trials) {
        // 2D array to store results: each row represents a trial, columns represent Win (1) or Lose (0)
        int[][] results = new int[trials][2]; // [trials][0] => Games won, [trials][1] => Bets made in that game

        // Run the simulation for 'trials' times
        for (int t = 0; t < trials; t++) {
            int currentStake = stake; // Start with the initial stake
            int betsMade = 0; // Track the number of bets made
            int gamesWon = 0; // Track the number of games won in this trial

            // Run until the gambler goes broke or reaches the goal
            while (currentStake > 0 && currentStake < goal) {
                betsMade++; // Increment the bet count
                // Simulate a bet (1 means win, 0 means lose)
                if (Math.random() < 0.5) {
                    currentStake++; // Won the bet, increase stake by 1
                    gamesWon++; // Increment games won count
                } else {
                    currentStake--; // Lost the bet, decrease stake by 1
                }
            }

            // Store the result in the 2D array (column 0 for games won, column 1 for bets made)
            results[t][0] = gamesWon;
            results[t][1] = betsMade;

            // Display whether the gambler won or lost in this trial
            if (currentStake >= goal) {
                System.out.println("Game " + (t + 1) + " won!");
            } else {
                System.out.println("Game " + (t + 1) + " lost.");
            }
        }

        // Output the 2D array results after all trials are done
        System.out.println("\nSummary of all trials:");
        for (int i = 0; i < trials; i++) {
            System.out.println("Trial " + (i + 1) + ": Games won = " + results[i][0] + ", Bets made = " + results[i][1]);
        }
    }

    // Main method to take input and start the simulation
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Stake (initial money), Goal (target), and Trials (how many times the game is played)
        System.out.print("Enter the initial stake (INR): ");
        int stake = sc.nextInt();

        System.out.print("Enter the goal (target money): ");
        int goal = sc.nextInt();

        System.out.print("Enter the number of trials: ");
        int trials = sc.nextInt();

        // Call the simulateGame method to run the simulation
        simulateGame(stake, goal, trials);

        sc.close();
    }
}
