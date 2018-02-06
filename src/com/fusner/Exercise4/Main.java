package com.fusner.Exercise4;


import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Map<String, ArrayList<Integer>> cities = new HashMap<String, ArrayList<Integer>>();
        String input;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a city or END to stop: ");
        input = scanner.nextLine();

        while (!input.equals("END"))
        {
            String name = input;
            System.out.println("Enter the temperatures for the next 5 Days in " + name);
            ArrayList<Integer> temps = new ArrayList<Integer>();
            for (int i = 0; i < 5; i++)
            {
                temps.add(scanner.nextInt());
            }
            cities.put(name, temps);

            System.out.print("Enter a city or END to stop: ");
            input = scanner.next();
        }

        for(String key: cities.keySet())
        {
            int sum = 0;
            for(int i =0; i<cities.get(key).size(); i++)
            {
                sum += cities.get(key).get(i);
            }
            double avg = sum/cities.get(key).size();

            System.out.println("The average for the next five days in " + key + " is " + avg);
        }

    }
}
