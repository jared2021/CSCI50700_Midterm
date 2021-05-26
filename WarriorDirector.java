
public class WarriorDirector{

	private WarriorBuilder warriorBuilder;

	public WarriorDirector(WarriorBuilder warriorBuilder)
	{
		this.warriorBuilder = warriorBuilder;
	}

	public void build(int role, int hairColor, int armor, int weapon)
	{
		warriorBuilder.buildRole(role);
		warriorBuilder.buildHairColor(hairColor);
		warriorBuilder.buildArmor(armor);
		warriorBuilder.buildWeapon(weapon);
	}
}
