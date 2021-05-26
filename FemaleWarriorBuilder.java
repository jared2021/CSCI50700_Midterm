
public class FemaleWarriorBuilder implements WarriorBuilder{

	private final Warrior warrior = new Warrior(1);

	@Override
	public void buildRole(int role)
	{
		warrior.buildRole(role);
	}

	@Override
	public void buildHairColor(int hairColor)
	{
		warrior.buildHairColor(hairColor);
	}

	@Override
	public void buildArmor(int armor)
	{
		warrior.buildArmor(armor);
	}

	@Override
	public void buildWeapon(int weapon)
	{
		warrior.buildWeapon(weapon);
	}

	@Override
	public Warrior getWarrior()
	{
		return warrior;
	}
}
