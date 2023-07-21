class LocalGlobalVariable{
//Global Variable --declared inside class but outside block
int rollNo =25;
String name = "Amol Patil";


public void m1(){
System.out.println("m1 method called..");
LocalGlobalVariable v = new LocalGlobalVariable();
System.out.println(v.rollNo);
System.out.println(v.name);
}



public static void main(String[] args){
System.out.println("Main method called..");
LocalGlobalVariable v = new LocalGlobalVariable();
System.out.println("v.rollNo");
System.out.println("Roll No : "+v.rollNo);
System.out.println("Full Name is :"+v.name);
System.out.println("Local Varaibles ---Start");

// Local Variables are present inside blocks/method
int marks  = 85;
String subName = "Java";
System.out.println("Marks : "+marks);
System.out.println("Subject name : "+ subName);

System.out.println("Local Varaibles ---End");

v.m1();
System.out.println("Main method Completed...");
}


}