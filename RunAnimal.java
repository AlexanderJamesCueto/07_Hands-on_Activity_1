import java.util.Scanner;
public class RunAnimal{
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
		System.out.print("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
	String ch = sc.nextLine();
	if(ch.equalsIgnoreCase("B")){
		Bird bd = new Bird();
		bd.eat();
		bd.sleep();
		bd.makeSound();
}
	else if(ch.equalsIgnoreCase("C")){
		Cat ct = new Cat();
		ct.eat();
		ct.sleep();
		ct.makeSound();
}
	else if(ch.equalsIgnoreCase("D")){
		Dog dg = new Dog();
		dg.eat();
		dg.sleep();
		dg.makeSound();
}
	else{
		System.out.println("Invalid output");
}
	sc.close();
}
}


