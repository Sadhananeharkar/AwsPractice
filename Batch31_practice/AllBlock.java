class AllBlock{

AllBlock()
{
System.out.println("Default Constructor called");
}

public void m1(){
System.out.println("m1 method called");
}

public void m2(){
System.out.println("m2 method called");
}

public static void main(String[] args){

System.out.println("main Method called....");
//className refenceName = new defaultConstructor
AllBlock ab = new AllBlock();
ab.m1();
ab.m2();
AllBlock ablock = new AllBlock();
ablock.m1();
ablock.m2();

AllBlock allBlock = new AllBlock();
allBlock.m1();
allBlock.m2();

}



}