package dog;

public class AnimalTestDrive {

	public static void main(String[] args) {
		MyAnimalList list = new MyAnimalList();
		Dog a = new Dog();
		Cat c = new Cat();
		list.add(a);
		list.add(c);
		if(a.equals(c)) {
			System.out.print("true");
		}else {
			System.out.println("false");
		}
		System.out.println(c.getClass());
		System.out.println(c.hashCode());
		System.out.println(c.toString());

	}

}
