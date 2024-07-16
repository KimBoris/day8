package org.example;

import org.example.salary.CalcSalary;
import org.example.salary.ContractWorker;
import org.example.salary.Freelancer;
import org.example.salary.PartTimer;
import org.example.vend.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //Map<String, String> fileMapping = new HashMap<>();

        //fileMapping.put("turtle and rabbit", "turtleandrabbit.txt");

        File file = new File("ReadPhrase.txt");

        Scanner scanner = new Scanner(file);

        Map<Character, Integer> wordCount = new HashMap<>();

        for (char c = 'c'; c <= 'z'; c++) {
            wordCount.put(c, 0);
        }

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            line = line.toLowerCase();
            line = line.replaceAll("[^a-z]", "");

            for (char c = 0; c < line.length(); c++) {
                if (wordCount.containsKey(line.charAt(c))) {
                    wordCount.put(line.charAt(c), wordCount.get(line.charAt(c)) + 1);
                }
            }

        }
        System.out.println(wordCount);
        scanner.close();
    }

}

     /*   Map<String, Msg> langMap = new HashMap<String, Msg>();

        langMap.put("ko", new KoreanMsg());
        langMap.put("en", new EnglishMsg());
        langMap.put("gm",  new GermanMsg());
        langMap.put("fr", new FranchMsg());

        Scanner scanner = new Scanner(System.in);
        System.out.println("언어를 선택하세요. \tko\ten\tgm\tfr");

        Msg msg = langMap.get(scanner.nextLine());

        VendingMachine machine = new VendingMachine(msg);
        machine.start();*/

       /* Scanner in = new Scanner(System.in);
        CommonUI[] arr = {new CreateUI(in), new ReadUI(in)};

        TotalUI totalUI = new TotalUI(in, arr);

        totalUI.execute();*/
       /* File file = new File("list.txt");
        Scanner scanner = new Scanner(file);

        java.util.List<CalcSalary> empList = new ArrayList<CalcSalary>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);

            String[] arr = line.split(",");

            if (arr[0].equals("A")) {
                empList.add(new PartTimer(arr[1],Integer.parseInt(arr[2]), Integer.parseInt(arr[3])));
            } else if (arr[0].equals("C")) {
                empList.add(new ContractWorker(arr[1], Integer.parseInt(arr[2])));
            }
            else if(arr[0].equals("F"))
            {
                empList.add(new Freelancer(arr[1],Integer.parseInt((arr[2]))));
            }
        }
        scanner.close();

        System.out.println("---------------------------------------");

        empList.forEach(emp -> System.out.println(emp.getName()+ " : "+ emp.calcMonth()));
*/


