package com.alevel.java.nix.homework;

public class Min_Max {
	public static void main(String[] args) {
		// write your code here
		int[] myArray;
		myArray = new int[]{4,5,0,-4,7,3};
		System.out.println(metod_min(myArray));
		System.out.println(metod_max(myArray));
		bubbleSorter(myArray);
		System.out.println(myArray);
		System.out.println((multiplicity(myArray,5)));

	}



	public static int metod_min(int myArray[])
	{
		int ar_min = myArray[0];
		for (int i = 0; i < myArray.length; i++)
		{
			if(myArray[i] < ar_min)
				ar_min = myArray[i];
		}
		return ar_min;
	}
	public static int metod_max(int myArray[])
	{
		int ar_max = myArray[0];
		for (int i = 0; i < myArray.length; i++)
		{
			if(myArray[i] > ar_max)
				ar_max = myArray[i];
		}
		return ar_max;
	}
	public void printer(int myArray[])
	{
		for (int i = 0; i < myArray.length; i++)
		{
			System.out.print(myArray[i] + " ");
			System.out.println("");
		}
		System.out.println("----Окончание вывода массива----");
	}

	public static void bubbleSorter(int myArray[])
	{     //МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
		for (int i = myArray.length - 1; i > 0; i--)
		{
			for (int j = 0; j < i; j++)
			{
				if (myArray[j] > myArray[j + 1])
				{
					int tmp = myArray[j];
					myArray[j] = myArray[j + 1];
					myArray[j + 1] = tmp;
				}
			}
		}
	}

	public static int[] multiplicity(int[] myArray, int k) {
		int[] multiplicityArray = new int[myArray.length];
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i]%k==0)
			{
				multiplicityArray[i] = myArray[i];
			}

		}
		return multiplicityArray ;
	}
}
