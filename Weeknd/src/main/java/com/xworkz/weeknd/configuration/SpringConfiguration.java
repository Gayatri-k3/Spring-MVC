package com.xworkz.weeknd.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
@ComponentScan(basePackages = "com.xworkz.weeknd.component")
public class SpringConfiguration {
    public SpringConfiguration(){
        System.out.println("Spring Configuration const");
    }
    @Bean
    public String id(){
        System.out.println("String 1");
        return "id";
    }

    @Bean
    public String name(){
        System.out.println("String 2");
        return "Gayatri";
    }

    @Bean
    public String email(){
        System.out.println("String 3");
        return "gayatri@outlook.com";
    }

    @Bean
    public String course(){
        System.out.println("String 4");
        return "Java";
    }

    @Bean
    public String gender(){
        System.out.println("String 5");
        return "Female";
    }

    @Bean
    public Object oj1(){
        System.out.println("Object 1");
        return 3;
    }
    @Bean
    public Object oj2(){
        System.out.println("Object 2");
        return "String";
    }
    @Bean
    public Object oj3(){
        System.out.println("Object 3");
        return 344.98;
    }
    @Bean
    public Object oj4(){
        System.out.println("Object 4");
        return 'C';
    }
    @Bean
    public Object oj5(){
        System.out.println("Object 5");
        return 6;
    }


    @Bean
    public ArrayList<String> arrayListOfNames() {
        System.out.println("ArrayList 1");
        return new ArrayList<>(Arrays.asList("Gayatri", "Anjali", "Kiran", "Ramesh", "Suresh"));
    }

    @Bean
    public ArrayList<Integer> arrayListOfNumbers() {
        System.out.println("ArrayList 2");
        return new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
    }

    @Bean
    public ArrayList<Double> arrayListOfPrices() {
        System.out.println("ArrayList 3");
        return new ArrayList<>(Arrays.asList(99.99, 199.99, 299.99, 399.99, 499.99));
    }

    @Bean
    public ArrayList<Boolean> arrayListOfFlags() {
        System.out.println("ArrayList 4");
        return new ArrayList<>(Arrays.asList(true, false, true, false, true));
    }

    @Bean
    public ArrayList<Character> arrayListOfChars() {
        System.out.println("ArrayList 5");
        return new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
    }
    @Bean
    public LinkedList<String> linkedListOfCities() {
        System.out.println("LinkedList 1");
        return new LinkedList<>(Arrays.asList("Hubballi", "Dharwad", "Bengaluru", "Mysuru", "Belgaum"));
    }

    @Bean
    public LinkedList<Integer> linkedListOfMarks() {
        System.out.println("LinkedList 2");
        return new LinkedList<>(Arrays.asList(85, 90, 75, 88, 92));
    }

    @Bean
    public LinkedList<Double> linkedListOfWeights() {
        System.out.println("LinkedList 3");
        return new LinkedList<>(Arrays.asList(55.5, 60.0, 65.3, 70.2, 68.4));
    }

    @Bean
    public LinkedList<Boolean> linkedListOfStatus() {
        System.out.println("LinkedList 4");
        return new LinkedList<>(Arrays.asList(true, false, true, true, false));
    }

    @Bean
    public LinkedList<Character> linkedListOfGrades() {
        System.out.println("LinkedList 5");
        return new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
    }

    @Bean
    public HashSet<String> hashSetOfNames() {
        System.out.println("HashSet 1");
        return new HashSet<>(Arrays.asList("Gayatri", "Anjali", "Ramesh", "Kiran", "Suresh"));
    }

    @Bean
    public HashSet<Integer> hashSetOfIds() {
        System.out.println("HashSet 2");
        return new HashSet<>(Arrays.asList(101, 102, 103, 104, 105));
    }

    @Bean
    public HashSet<Double> hashSetOfAmounts() {
        System.out.println("HashSet 3");
        return new HashSet<>(Arrays.asList(12.5, 45.0, 78.3, 22.2, 90.0));
    }

    @Bean
    public HashSet<Boolean> hashSetOfFlags() {
        System.out.println("HashSet 4");
        return new HashSet<>(Arrays.asList(true, false, true, false, true));
    }

    @Bean
    public HashSet<Character> hashSetOfSymbols() {
        System.out.println("HashSet 5");
        return new HashSet<>(Arrays.asList('X', 'Y', 'Z', 'A', 'B'));
    }
    @Bean
    public LinkedHashSet<String> linkedHashSetOfColors() {
        System.out.println("LinkedHashSet 1");
        return new LinkedHashSet<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Purple"));
    }

    @Bean
    public LinkedHashSet<Integer> linkedHashSetOfRollNos() {
        System.out.println("LinkedHashSet 2");
        return new LinkedHashSet<>(Arrays.asList(11, 22, 33, 44, 55));
    }

    @Bean
    public LinkedHashSet<Double> linkedHashSetOfHeights() {
        System.out.println("LinkedHashSet 3");
        return new LinkedHashSet<>(Arrays.asList(5.1, 5.4, 5.6, 5.8, 6.0));
    }

    @Bean
    public LinkedHashSet<Boolean> linkedHashSetOfResults() {
        System.out.println("LinkedHashSet 4");
        return new LinkedHashSet<>(Arrays.asList(true, false, true, false, true));
    }

    @Bean
    public LinkedHashSet<Character> linkedHashSetOfInitials() {
        System.out.println("LinkedHashSet 5");
        return new LinkedHashSet<>(Arrays.asList('G', 'K', 'A', 'R', 'S'));
    }
    @Bean
    public TreeSet<String> treeSetOfFruits() {
        System.out.println("TreeSet 1");
        return new TreeSet<>(Arrays.asList("Apple", "Mango", "Banana", "Grapes", "Orange"));
    }

    @Bean
    public TreeSet<Integer> treeSetOfNumbers() {
        System.out.println("TreeSet 2");
        return new TreeSet<>(Arrays.asList(50, 10, 30, 20, 40));
    }

    @Bean
    public TreeSet<Double> treeSetOfScores() {
        System.out.println("TreeSet 3");
        return new TreeSet<>(Arrays.asList(85.5, 92.0, 77.5, 90.0, 88.8));
    }

    @Bean
    public TreeSet<Character> treeSetOfLetters() {
        System.out.println("TreeSet 4");
        return new TreeSet<>(Arrays.asList('E', 'C', 'A', 'D', 'B'));
    }

    @Bean
    public TreeSet<String> treeSetOfCities() {
        System.out.println("TreeSet 5");
        return new TreeSet<>(Arrays.asList("Mumbai", "Delhi", "Bangalore", "Chennai", "Hyderabad"));
    }
    @Bean
    public Properties appProperties() {
        System.out.println("Properties 1");
        Properties prop = new Properties();
        prop.setProperty("app.name", "MyApplication");
        return prop;
    }

    @Bean
    public Properties dbProperties() {
        System.out.println("Properties 2");
        Properties prop = new Properties();
        prop.setProperty("db.url", "jdbc:mysql://localhost:3306/mydb");
        return prop;
    }

    @Bean
    public Properties emailProperties() {
        System.out.println("Properties 3");
        Properties prop = new Properties();
        prop.setProperty("email.from", "info@example.com");
        return prop;
    }

    @Bean
    public Properties userProperties() {
        System.out.println("Properties 4");
        Properties prop = new Properties();
        prop.setProperty("user.name", "Gayatri");
        return prop;
    }

    @Bean
    public Properties serverProperties() {
        System.out.println("Properties 5");
        Properties prop = new Properties();
        prop.setProperty("server.port", "8080");
        return prop;
    }
    @Bean
    public Map<String, String> hashMap1() {
        System.out.println("HashMap 1");
        Map<String, String> map = new HashMap<>();
        map.put("name", "Gayatri");
        return map;
    }

    @Bean
    public Map<String, String> hashMap2() {
        System.out.println("HashMap 2");
        Map<String, String> map = new HashMap<>();
        map.put("email", "gayatri@outlook.com");
        return map;
    }

    @Bean
    public Map<String, String> hashMap3() {
        System.out.println("HashMap 3");
        Map<String, String> map = new HashMap<>();
        map.put("course", "Java");
        return map;
    }

    @Bean
    public Map<String, String> hashMap4() {
        System.out.println("HashMap 4");
        Map<String, String> map = new HashMap<>();
        map.put("gender", "Female");
        return map;
    }

    @Bean
    public Map<String, String> hashMap5() {
        System.out.println("HashMap 5");
        Map<String, String> map = new HashMap<>();
        map.put("location", "Hubballi");
        return map;
    }

    @Bean
    public Map<String, String> linkedHashMap1() {
        System.out.println("LinkedHashMap 1");
        Map<String, String> map = new LinkedHashMap<>();
        map.put("id", "101");
        return map;
    }

    @Bean
    public Map<String, String> linkedHashMap2() {
        System.out.println("LinkedHashMap 2");
        Map<String, String> map = new LinkedHashMap<>();
        map.put("branch", "CSE");
        return map;
    }

    @Bean
    public Map<String, String> linkedHashMap3() {
        System.out.println("LinkedHashMap 3");
        Map<String, String> map = new LinkedHashMap<>();
        map.put("college", "AGMR");
        return map;
    }

    @Bean
    public Map<String, String> linkedHashMap4() {
        System.out.println("LinkedHashMap 4");
        Map<String, String> map = new LinkedHashMap<>();
        map.put("year", "2025");
        return map;
    }

    @Bean
    public Map<String, String> linkedHashMap5() {
        System.out.println("LinkedHashMap 5");
        Map<String, String> map = new LinkedHashMap<>();
        map.put("status", "Active");
        return map;
    }

    @Bean
    public Map<String, String> treeMap1() {
        System.out.println("TreeMap 1");
        Map<String, String> map = new TreeMap<>();
        map.put("language", "Java");
        return map;
    }

    @Bean
    public Map<String, String> treeMap2() {
        System.out.println("TreeMap 2");
        Map<String, String> map = new TreeMap<>();
        map.put("tool", "Spring");
        return map;
    }

    @Bean
    public Map<String, String> treeMap3() {
        System.out.println("TreeMap 3");
        Map<String, String> map = new TreeMap<>();
        map.put("level", "Beginner");
        return map;
    }

    @Bean
    public Map<String, String> treeMap4() {
        System.out.println("TreeMap 4");
        Map<String, String> map = new TreeMap<>();
        map.put("os", "Linux");
        return map;
    }

    @Bean
    public Map<String, String> treeMap5() {
        System.out.println("TreeMap 5");
        Map<String, String> map = new TreeMap<>();
        map.put("ide", "IntelliJ");
        return map;
    }
    @Bean
    public Hashtable<String, String> hashtable1() {
        System.out.println("Hashtable 1");
        Hashtable<String, String> table = new Hashtable<>();
        table.put("user", "Gayatri");
        return table;
    }

    @Bean
    public Hashtable<String, String> hashtable2() {
        System.out.println("Hashtable 2");
        Hashtable<String, String> table = new Hashtable<>();
        table.put("email", "gayatri@outlook.com");
        return table;
    }

    @Bean
    public Hashtable<String, String> hashtable3() {
        System.out.println("Hashtable 3");
        Hashtable<String, String> table = new Hashtable<>();
        table.put("course", "Java Full Stack");
        return table;
    }

    @Bean
    public Hashtable<String, String> hashtable4() {
        System.out.println("Hashtable 4");
        Hashtable<String, String> table = new Hashtable<>();
        table.put("location", "Hubballi");
        return table;
    }

    @Bean
    public Hashtable<String, String> hashtable5() {
        System.out.println("Hashtable 5");
        Hashtable<String, String> table = new Hashtable<>();
        table.put("status", "Learning");
        return table;
    }
    @Bean
    public String[] stringArray() {
        System.out.println("Array 1: String[]");
        return new String[]{"Java", "Spring", "Hibernate"};
    }

    @Bean
    public int[] intArray() {
        System.out.println("Array 2: int[]");
        return new int[]{10, 20, 30, 40, 50};
    }

    @Bean
    public double[] doubleArray() {
        System.out.println("Array 3: double[]");
        return new double[]{10.5, 20.7, 30.2};
    }

    @Bean
    public char[] charArray() {
        System.out.println("Array 4: char[]");
        return new char[]{'A', 'B', 'C'};
    }

    @Bean
    public Object[] objectArray() {
        System.out.println("Array 5: Object[]");
        return new Object[]{"Gayatri", 25, true};
    }
    @Bean
    public Byte byte1() {
        System.out.println("Byte 1");
        return 10;
    }

    @Bean
    public Byte byte2() {
        System.out.println("Byte 2");
        return 20;
    }

    @Bean
    public Short short1() {
        System.out.println("Short 1");
        return 100;
    }

    @Bean
    public Short short2() {
        System.out.println("Short 2");
        return 200;
    }

    @Bean
    public Integer int1() {
        System.out.println("Integer 1");
        return 1000;
    }

    @Bean
    public Integer int2() {
        System.out.println("Integer 2");
        return 2000;
    }

    @Bean
    public Long long1() {
        System.out.println("Long 1");
        return 10000L;
    }

    @Bean
    public Long long2() {
        System.out.println("Long 2");
        return 20000L;
    }

    @Bean
    public Float float1() {
        System.out.println("Float 1");
        return 10.5f;
    }

    @Bean
    public Float float2() {
        System.out.println("Float 2");
        return 20.5f;
    }

    @Bean
    public Double double1() {
        System.out.println("Double 1");
        return 99.99;
    }

    @Bean
    public Double double2() {
        System.out.println("Double 2");
        return 88.88;
    }

    @Bean
    public Character char1() {
        System.out.println("Character 1");
        return 'A';
    }

    @Bean
    public Character char2() {
        System.out.println("Character 2");
        return 'Z';
    }

    @Bean
    public Boolean bool1() {
        System.out.println("Boolean 1");
        return true;
    }

    @Bean
    public Boolean bool2() {
        System.out.println("Boolean 2");
        return false;
    }
}
