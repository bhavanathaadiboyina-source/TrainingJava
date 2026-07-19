    // BAD: Array with fixed size
    private Product[] items = new Product[10]; //Maax 10 items only!
    //GOOD: ArrayList with dynamic size
    private List<Product> items = new ArrayList<>();  //unlimted items!
    public void addProduct(Product product){
        items.add(product); 
    }

}
//Adding elements
student.add("Alice");
student.add("Bob");
student.add("Charlie");
student.add("Diana");
System.out.println("Students:"+ students);
// Add at specific position
students.add(1, "Eve"); // insert at index 1
System.out.println("After insertion:"+ students);
//Add all from another collection
list<String> moreStudents = ArrayList("frank","mike");
students.addall(morestudents): list1.addall(list2)
// Accessing elements
String first = student.get(0);
String third = student.get(2);
System.out.println("First:"+ first+"Third:"+third);
// Remove elements
students.remove(1);
student.remove("Bob");
System.out.println("After removals:"+ students);
//Remove all elements matching a condition
student.removeIf(name -> name.startWith("F"));
System.out.println("After removeIf:"+ students);
//Checking contents
boolean hasAlice = students.contains("Alice");
boolean hadBob = students.contains("Bob");
System.out.println("Contains Alice?"+ hasAlice);
System.out.prinln("Contain Bob?"+ hadBob);2w wb 
int index = students.indexOf("Charlie");55esre
System.out.println1("Charlie at index:"+index");
//Size and capacity
int size = students.size();
boolean empty = students.isEmpty();
System.out.println("Size:"+size+","Empty:"+empty);
//Iteration - Multiple ways
System.out.println("/n--- For-each loop (Modern)---");
for(String student: students){
    System.out.println("Student:"+ student);
}
System.out.println("/n--- Traditional for loop---");
for (int i=0;i<student.size();i++){
    System,out.println("Student #"+ i + ":"+student.get(i));
}
System.out.println("/n-- Iterator (Professional)---");
Iterator<String> iterator =  students.iterator();
While(iterator.hasNext()){
    String student = iterator.next();
    System.out.println("Student:"+ student);
}

System.out.println("/n-- Lambda(no function name) forEach (java 8+) ---");     
student.forEach(student -> System.out.println("Student:"+ student));
// Clearing the list
student.clear();
System.out.println("After clear:"+ students);
System.out.prinln("Is empty?" + students.isEmpty());  
