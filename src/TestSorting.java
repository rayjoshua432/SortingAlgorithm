import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class TestSorting{
 	public static void MainMenu() {
 		int num[] = new int [10];
 		int copy[] = new int [10];

		Random rnd = new Random();
		SortingAlgorithm sort = new SortingAlgorithm();
		
		String menu[] = {"Create Array", "Choose Sorting Algorithm", "Exit"};
		String sortAlgo[] = {"Bubble", "Exchange", "Selection", "Insertion", "Back"};
		String arr[] = {"Input Elements", "Given Array", "Random Elements", "Back"};
		String choice = "", option_array = "", option_algo = "", all = "", hold = "";
		
		do {
			hold = "Original Array Elements:\n";
			for (int a = 0; a < num.length; a++) {
				hold += num[a] + " ";
			}
			
			choice = JOptionPane.showInputDialog(null, new JTextArea(hold + "\n\nOptions:"), "Main Menu", -1, null, menu,menu[0]).toString();
			
			switch(choice) {
				case "Create Array":
					boolean exit = false;
					while(!exit) {
						option_array = JOptionPane.showInputDialog(null, "Options:", "Create an Array by?", -1, null, arr, arr[0]).toString();
						
						switch (option_array) {
						case "Input Elements":
							for (int a = 0; a < num.length; a++) {
								int element = Integer.parseInt(JOptionPane.showInputDialog(null, "Array Element Index: " + a , "Input Elements", -1));
								num[a] = element;
							}
							exit = true;
							break;
						case "Given Array":
							num = new int[]{12, 45, 23, 51, 19, 8};
							exit = true;
							break;
						case "Random Elements":
							for (int a = 0; a < num.length; a++) {
								num[a] = rnd.nextInt(100)+1;
							}
							exit = true;
							break;
						}
					}
					break;
				case "Choose Sorting Algorithm":
					do {
						all = "\nSorted Elements: \n";
						option_algo = JOptionPane.showInputDialog(null, "Options:", "What Sorting Algorithm?", -1, null, sortAlgo, sortAlgo[0]).toString();
						copy = Arrays.copyOf(num, num.length);
						
						switch (option_algo) {
						case "Bubble":
							all += sort.bubbleSort(copy);
							JOptionPane.showMessageDialog(null, new JTextArea(hold+"\n"+ all), "Bubble Sort Algorithm", -1);
							break;
						case "Exchange":
							all += sort.exchangeSort(copy);
							JOptionPane.showMessageDialog(null, new JTextArea(hold+"\n"+ all), "Exchange Sort Algorithm", -1);
							break;
						case "Selection":
							all += sort.selectionSort(copy);
							JOptionPane.showMessageDialog(null, new JTextArea(hold+"\n"+ all), "Selection Sort Algorithm", -1);
							break;
						case "Insertion":
							all += sort.insertionSort(copy);
							JOptionPane.showMessageDialog(null, new JTextArea(hold+"\n"+ all), "Insertion Sort Algorithm", -1);
							break;
						}
					} while(!option_algo.equals("Back"));
					break;
				}
		} while(!choice.equals("Exit"));
	}
	public static void main(String[] args) {
		MainMenu();
	}
}
