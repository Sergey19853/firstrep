package edu.training.js.simple_output;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TableOutput {

	public static void main(String[] args) {
		printStrip(33);
		print("id","role");
		printStrip(33);
		print("1","guest");
		print("10","user");
		print("100","admin");
		printStrip(33);
	}

	private static void printStrip(int numberRepetitions) {
		System.out.println("-".repeat(numberRepetitions));
	}
	
	private static void print(String ...arg) {
		System.out.print("|\t".concat(Arrays.stream(arg).collect(Collectors.joining("\t|\t"))).concat("\t"+"|\n"));
	}
}
