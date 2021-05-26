

public class Warrior {

	private int sex;
	private int role;
	private int hairColor;
	private int armor;
	private int weapon;

	public final int MALE = 0;
	public final int FEMALE = 1;

	public final int WARRIOR = 0;
	public final int THIEF = 1;
	public final int KING = 2;
	public final int QUEEN = 3;

	public final int WHITE = 0;
	public final int BLOND = 1;
	public final int BLACK = 2;
	public final int BROWN = 3;
	public final int RED = 4;

	public final int CLOTHES = 0;
	public final int LEATHER = 1;
	public final int CHAINMAIL = 2;
	public final int PLATEMAIL = 3;

	public final int DAGGER = 0;
	public final int SWORD = 1;
	public final int AXE = 2;
	public final int HAMMER = 3;
	public final int BOW = 4;

	public Warrior(int sex)
	{
		this.sex = sex;
	}

	public void buildRole(int role)
	{
		this.role = role;
	}

	public void buildHairColor(int hairColor)
	{
		this.hairColor = hairColor;
	}

	public void buildArmor(int armor)
	{
		this.armor = armor;
	}

	public void buildWeapon(int weapon)
	{
		this.weapon = weapon;
	}

	public void getSex()
	{
		if(sex == MALE)
		{
			System.out.println("Sex: Male");
		}
		else if(sex == FEMALE)
		{
			System.out.println("Sex: Female");
		}
	}

	public void getRole()
	{
		if(role == WARRIOR)
		{
			System.out.println("Role: Warrior");
		}
		else if(role == THIEF)
		{
			System.out.println("Role: Thief");
		}
		else if(role == KING)
		{
			System.out.println("Role: King");
		}
		else if(role == QUEEN)
		{
			System.out.println("Role: Queen");
		}
	}

	public void getHairColor()
	{
		if(hairColor == WHITE)
		{
			System.out.println("Hair Color: White");
		}
		else if(hairColor == BLOND)
		{
			System.out.println("Hair Color: Blond");
		}
		else if(hairColor == BLACK)
		{
			System.out.println("Hair Color: Black");
		}
		else if(hairColor == BROWN)
		{
			System.out.println("Hair Color: Brown");
		}
		else if(hairColor == RED)
		{
			System.out.println("Hair Color: Red");
		}
	}

	public void getArmor()
	{
		if(armor == CLOTHES)
		{
			System.out.println("Armor: Clothes");
		}
		else if(armor == LEATHER)
		{
			System.out.println("Armor: Leather");
		}
		else if(armor == CHAINMAIL)
		{
			System.out.println("Armor: Chain Mail");
		}
		else if(armor == PLATEMAIL)
		{
			System.out.println("Armor: Plate Mail");
		}
	}

	public void getWeapon()
	{
		if(weapon == DAGGER)
		{
			System.out.println("Weapon: Dagger");
		}
		else if(weapon == SWORD)
		{
			System.out.println("Weapon: Sword");
		}
		else if(weapon == AXE)
		{
			System.out.println("Weapon: Axe");
		}
		else if(weapon == HAMMER)
		{
			System.out.println("Weapon: Hammer");
		}
		else if(weapon == BOW)
		{
			System.out.println("Weapon: Bow");
		}
	}
}
