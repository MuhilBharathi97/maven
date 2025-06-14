package com.facebook;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic_Library.TakeScreenshot_Utility;

public class ProTest {

	

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);

        // Prompt user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;

        // Logic to reverse the number
        while (number != 0) {
            int digit = number % 10;              // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append digit
            number /= 10;                         // Remove last digit
        }

    
	}
	}
