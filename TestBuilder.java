import java.util.Scanner;


public class TestBuilder{

	public static void main(String[] args){

		Scanner readObj = new Scanner(System.in);
		int input = -1;

		WarriorBuilder maleWarriorBuilder = new MaleWarriorBuilder();
		WarriorBuilder femaleWarriorBuilder = new FemaleWarriorBuilder();
		WarriorDirector maleDirector = new WarriorDirector(maleWarriorBuilder);
		WarriorDirector femaleDirector = new WarriorDirector(femaleWarriorBuilder);


		boolean male = false;

		System.out.println("Select your character's sex.");
		System.out.println("0. Male");
		System.out.println("1. Female");
		input = readObj.nextInt();
		if(input == 0)
		{
			male = true;
		}
		else
		{
			System.out.println("Invalid input");
		}
		input = -1;
		System.out.println("Select your character's role.");
		System.out.println("0. Warrior");
		System.out.println("1. Thief");
		System.out.println("2. King");
		System.out.println("3. Queen");
		input = readObj.nextInt();
		int role = input;
		System.out.println("Select your character's hair color.");
		System.out.println("0. White");
		System.out.println("1. Blond");
		System.out.println("2. Black");
		System.out.println("3. Brown");
		System.out.println("4. Red");
		input = readObj.nextInt();
		int hairColor = input;
		System.out.println("Select your character's armor.");
		System.out.println("0. Clothes");
		System.out.println("1. Leather");
		System.out.println("2. Chain mail");
		System.out.println("3. Plate mail");
		input = readObj.nextInt();
		int armor = input;
		System.out.println("Select your character's weapon.");
		System.out.println("0. Dagger");
		System.out.println("1. Sword");
		System.out.println("2. Axe");
		System.out.println("3. Hammer");
		System.out.println("4. Bow");
		input = readObj.nextInt();
		int weapon = input;
		if(male)
		{
			maleDirector.build(role,hairColor,armor,weapon);
			Warrior warrior = maleWarriorBuilder.getWarrior();
			warrior.getSex();
			warrior.getRole();
			warrior.getHairColor();
			warrior.getArmor();
			warrior.getWeapon();
		}
		else
		{
			femaleDirector.build(role,hairColor,armor,weapon);
			Warrior warrior =femaleWarriorBuilder.getWarrior();
			warrior.getSex();
			warrior.getRole();
			warrior.getHairColor();
			warrior.getArmor();
			warrior.getWeapon();
		}
	}
}
