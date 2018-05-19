package tests;
import org.junit.*;

import java.awt.Color;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import game.*;
import ui.*
;/**
 * The class <code>CreatureTest</code> contains tests for the class <code>{@link Creature}</code>.
 *
 * @generatedBy CodePro at 5/19/18 9:29 AM
 * @author kyleharris
 * @version $Revision: 1.0 $
 */
public class CreatureTest {
	/**
	 * Run the Creature(World,char,Color,String,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testCreature_1()
		throws Exception {
		World world = new World(new Tile[][][] {});
		char glyph = '';
		Color color = new Color(1);
		String name = "";
		int maxHp = 1;
		int attack = 1;
		int defense = 1;

		Creature result = new Creature(world, glyph, color, name, maxHp, attack, defense);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@79750dcc
		assertNotNull(result);
	}

	/**
	 * Run the Item armor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testArmor_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		Item result = fixture.armor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2dbff626
		assertNotNull(result);
	}

	/**
	 * Run the int attackValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testAttackValue_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		int result = fixture.attackValue();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the int attackValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testAttackValue_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		int result = fixture.attackValue();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testCanSee_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@75955b4
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testCanSee_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@77276727
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testCanSee_3()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@14d2d93
		assertTrue(result);
	}

	/**
	 * Run the String causeOfDeath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testCauseOfDeath_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		String result = fixture.causeOfDeath();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2a2f6ef9
		assertNotNull(result);
	}

	/**
	 * Run the Color color() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testColor_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		Color result = fixture.color();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testCreature_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Creature result = fixture.creature(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@20404cf6
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testCreature_3()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Creature result = fixture.creature(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@44aaef2c
		assertNotNull(result);
	}

	/**
	 * Run the int defenseValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testDefenseValue_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		int result = fixture.defenseValue();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the int defenseValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testDefenseValue_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		int result = fixture.defenseValue();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the String details() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testDetails_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		String result = fixture.details();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@75adef9f
		assertNotNull(result);
	}

	/**
	 * Run the void doAction(String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testDoAction_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		String message = "";

		fixture.doAction(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@b9afeae
	}

	/**
	 * Run the void doAction(String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testDoAction_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		String message = "";

		fixture.doAction(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3f62c7e2
	}

	/**
	 * Run the void doAction(String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testDoAction_3()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		String message = "";

		fixture.doAction(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@64b0c963
	}

	/**
	 * Run the void doAction(Item,String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testDoAction_4()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 0, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		Item item = new Item('', new Color(1), "", "");
		String message = "";

		fixture.doAction(item, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4f1fb445
	}

	/**
	 * Run the void doAction(Item,String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testDoAction_5()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		Item item = new Item('', new Color(1), "", "");
		String message = "";

		fixture.doAction(item, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@34c1896d
	}

	/**
	 * Run the void doAction(Item,String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testDoAction_6()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		Item item = new Item('', new Color(1), "", "");
		String message = "";

		fixture.doAction(item, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@146d0ed7
	}

	/**
	 * Run the void doAction(Item,String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testDoAction_7()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		Item item = new Item('', new Color(1), "", "");
		String message = "";

		fixture.doAction(item, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6eea9f19
	}

	
	/**
	 * Run the List<Effect> effects() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testEffects_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		List<Effect> result = fixture.effects();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1a4e85bc
		assertNotNull(result);
	}

	/**
	 * Run the int food() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testFood_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		int result = fixture.food();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6676ca83
		assertEquals(0, result);
	}

	/**
	 * Run the void gainXp(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testGainXp_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.gainXp(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@410956db
	}

	/**
	 * Run the void gainXp(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testGainXp_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.gainXp(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7bbd5a0
	}

	/**
	 * Run the char glyph() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testGlyph_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		char result = fixture.glyph();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(' ', result);
	}

	/**
	 * Run the int hp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testHp_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		int result = fixture.hp();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the Inventory inventory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testInventory_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		Inventory result = fixture.inventory();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the boolean isPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testIsPlayer_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '@', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		boolean result = fixture.isPlayer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@73f6570d
		assertTrue(result);
	}

	/**
	 * Run the boolean isPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testIsPlayer_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		boolean result = fixture.isPlayer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3a4b0ac4
		assertTrue(result);
	}

	/**
	 * Run the Item item(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testItem_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Item result = fixture.item(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6f397193
		assertNotNull(result);
	}

	/**
	 * Run the Item item(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testItem_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Item result = fixture.item(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6c37d969
		assertNotNull(result);
	}

	/**
	 * Run the int level() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testLevel_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		int result = fixture.level();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@24aef354
		assertEquals(0, result);
	}

	/**
	 * Run the int mana() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testMana_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		int result = fixture.mana();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4d752213
		assertEquals(0, result);
	}

	/**
	 * Run the int maxFood() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testMaxFood_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		int result = fixture.maxFood();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6fac5a0c
		assertEquals(0, result);
	}

	/**
	 * Run the int maxHp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testMaxHp_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		int result = fixture.maxHp();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the int maxMana() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testMaxMana_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		int result = fixture.maxMana();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@47921812
		assertEquals(0, result);
	}

	

	/**
	 * Run the void modifyAttackValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testModifyAttackValue_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		int value = 1;

		fixture.modifyAttackValue(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void modifyDefenseValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testModifyDefenseValue_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		int value = 1;

		fixture.modifyDefenseValue(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void modifyDetectCreatures(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testModifyDetectCreatures_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		int amount = 1;

		fixture.modifyDetectCreatures(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7565321d
	}

	/**
	 * Run the void modifyFood(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testModifyFood_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '@', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		int amount = 1;

		fixture.modifyFood(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@73a7a240
	}

	/**
	 * Run the void modifyMana(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testModifyMana_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		int amount = 1;

		fixture.modifyMana(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@50ea7dcd
	}

	/**
	 * Run the void modifyMaxHp(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testModifyMaxHp_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		int amount = 1;

		fixture.modifyMaxHp(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void modifyMaxMana(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testModifyMaxMana_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		int amount = 1;

		fixture.modifyMaxMana(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5b3ae28a
	}

	/**
	 * Run the void modifyRegenHpPer1000(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testModifyRegenHpPer1000_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		int amount = 1;

		fixture.modifyRegenHpPer1000(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@28a65fdb
	}

	/**
	 * Run the void modifyRegenManaPer1000(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testModifyRegenManaPer1000_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		int amount = 1;

		fixture.modifyRegenManaPer1000(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5562f0c5
	}

	/**
	 * Run the void modifyVisionRadius(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testModifyVisionRadius_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		int value = 1;

		fixture.modifyVisionRadius(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void moveBy(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testMoveBy_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		int mx = 0;
		int my = 0;
		int mz = 1;

		fixture.moveBy(mx, my, mz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@65d24c94
	}


	/**
	 * Run the void moveBy(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testMoveBy_3()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		int mx = 0;
		int my = 1;
		int mz = -1;

		fixture.moveBy(mx, my, mz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@ed5f6e
	}

	/**
	 * Run the String name() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testName_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		String result = fixture.name();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String nameOf(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testNameOf_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		Item item = new Item('', new Color(1), "", "");

		String result = fixture.nameOf(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@aa0a068
		assertNotNull(result);
	}

	/**
	 * Run the void notify(String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testNotify_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		String message = "";

		fixture.notify(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7035e9b2
	}

	/**
	 * Run the Tile realTile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testRealTile_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Tile result = fixture.realTile(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@761b5fee
		assertNotNull(result);
	}

	/**
	 * Run the void setCreatureAi(CreatureAi) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testSetCreatureAi_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		CreatureAi ai = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.setCreatureAi(ai);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void summon(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testSummon_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.summon(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4575705c
	}

	
	
	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testTile_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Tile result = fixture.tile(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@528f7284
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testTile_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Tile result = fixture.tile(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@558410fb
		assertNotNull(result);
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@121529a1
	}

	/**
	 * Run the int visionRadius() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testVisionRadius_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		int result = fixture.visionRadius();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the Item weapon() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testWeapon_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		Item result = fixture.weapon();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@22272d91
		assertNotNull(result);
	}

	/**
	 * Run the int xp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Test
	public void testXp_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.x = 1;
		fixture.y = 1;

		int result = fixture.xp();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@19fe28ea
		assertEquals(0, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/19/18 9:29 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CreatureTest.class);
	}
}