class Animal{  
void eat(){System.out.println("eating");}  
}  
class Dog extends Animal{  
void eat(){System.out.println("eating fruits");}  
}  
class BabyDog extends Dog{  
void eat(){System.out.println("drinking milk");}  
public static void main(String args[]){  
Animal a1;  
a1=new Animal();  
a1=new Dog();  
a1=new BabyDog();  
a1.eat();  
a1.eat();  
a1.eat(); 
//hello 
}  
}  