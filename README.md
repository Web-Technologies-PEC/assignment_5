# ASSIGNMENT 5

'Question 1. 1. Create two classes named Mammals and MarineAnimals. Create another class named BlueWhale which inherits both the above classes. Now, create a function in eachof these classes which prints "I am mammal", "I am a marine animal" and "I belong to boththe categories: Mammals as well as Marine Animals" respectively. Now,create an object for each of the above class and try calling

1-function of Mammals by the object of Mammal
2-function of MarineAnimal by the object of MarineAnimal
3-function of Blue Whale by the object of BlueWhale
4-function of each of its parent by the object of BlueWhale

Question 2. All the banks operating in India are controlled by RBI. RBI has set a well defined guideline (e.g. minimum interest rate, minimum balance allowed, maximum withdrawal limit etc) which all banks must follow. For example, suppose RBI has set minimum interest rate applicable to a saving bank account to be 4% annually; however, banks are free to use 4% interest rate or to set any rates above it.

Write a program to implement bank functionality in the above scenario. Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI,PNB etc). Assume and implement required member variables and functions in each class.

Question 3. We want to calculate the total marks of each student of a class in Physics, Chemistry and Mathematics and the average marks of the class. The number of students in the class are entered by the user. Create a class named Marks with data members for roll number, name and marks. Create three other classes inheriting the Marks class, namely

Physics, Chemistry and Mathematics, which are used to define marks in individual subject of each student. Roll number of each student will be generated automatically.

Question 4. Will the following code snippet compile fine? If yes, what will be the output of the following program?

public class Myclass {
static int a = 20;
Myclass() {
a++;
}
Void m1() {
a++;
System.out.println(a):
}
public static void main(String[]
args)
{
Myclass obj = new Myclass();
Myclass obj2 = new Myclass();
Myclass obj3 = new Myclass();
obj3.m1();
}
}
Question 5. What is the output of the following snippet code?

public class Myclass
{
final static int x;

static {
x = 10;
}
public static void main(String[]
args) {
System.out.println(x);
}
}
