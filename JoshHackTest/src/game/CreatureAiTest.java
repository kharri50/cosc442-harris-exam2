package game;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CreatureAiTest</code> contains tests for the class <code>{@link CreatureAi}</code>.
 *
 * @generatedBy CodePro at 5/19/18 8:49 AM
 * @author kyleharris
 * @version $Revision: 1.0 $
 */
public class CreatureAiTest {
	/**
	 * Run the CreatureAi(Creature) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCreatureAi_1()
		throws Exception {
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		CreatureAi result = new CreatureAi(creature);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the boolean canPickup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCanPickup_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canPickup();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2c90f9b0
		assertTrue(result);
	}

	/**
	 * Run the boolean canPickup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCanPickup_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canPickup();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5723b11f
		assertTrue(result);
	}

	/**
	 * Run the boolean canPickup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCanPickup_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canPickup();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@78ba6d10
		assertTrue(result);
	}

	/**
	 * Run the boolean canRangedWeaponAttack(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCanRangedWeaponAttack_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		other.x = 1;
		other.z = 1;
		other.y = 1;

		boolean result = fixture.canRangedWeaponAttack(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@539c999d
		assertTrue(result);
	}

	/**
	 * Run the boolean canRangedWeaponAttack(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCanRangedWeaponAttack_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		boolean result = fixture.canRangedWeaponAttack(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@77809806
		assertTrue(result);
	}

	/**
	 * Run the boolean canRangedWeaponAttack(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCanRangedWeaponAttack_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		boolean result = fixture.canRangedWeaponAttack(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5faead2b
		assertTrue(result);
	}

	/**
	 * Run the boolean canRangedWeaponAttack(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCanRangedWeaponAttack_4()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		other.x = 1;
		other.z = 1;
		other.y = 1;

		boolean result = fixture.canRangedWeaponAttack(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@540f37bb
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCanSee_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCanSee_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCanSee_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCanSee_4()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCanSee_5()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCanSee_6()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCanSee_7()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean canThrowAt(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCanThrowAt_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		other.x = 1;
		other.z = 1;
		other.y = 1;

		boolean result = fixture.canThrowAt(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@54ffe9ff
		assertTrue(result);
	}

	/**
	 * Run the boolean canThrowAt(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCanThrowAt_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		other.x = 1;
		other.z = 1;
		other.y = 1;

		boolean result = fixture.canThrowAt(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@59750b59
		assertTrue(result);
	}

	/**
	 * Run the boolean canThrowAt(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCanThrowAt_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		other.x = 1;
		other.z = 1;
		other.y = 1;

		boolean result = fixture.canThrowAt(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1261f3de
		assertTrue(result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCanUseBetterEquipment_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@29bd8170
		assertTrue(result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCanUseBetterEquipment_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3d6a3788
		assertTrue(result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCanUseBetterEquipment_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7f5d130a
		assertTrue(result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCanUseBetterEquipment_4()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@11a2e4e6
		assertTrue(result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCanUseBetterEquipment_5()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@61516e90
		assertTrue(result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testCanUseBetterEquipment_6()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6f56237e
		assertTrue(result);
	}

	/**
	 * Run the String getName(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");

		String result = fixture.getName(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String getName(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testGetName_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");

		String result = fixture.getName(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testGetWeaponToThrow_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3e89460f
		assertNotNull(result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testGetWeaponToThrow_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@168cd8c
		assertNotNull(result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testGetWeaponToThrow_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@19d5874c
		assertNotNull(result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testGetWeaponToThrow_4()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@612a0a18
		assertNotNull(result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testGetWeaponToThrow_5()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@140da78e
		assertNotNull(result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testGetWeaponToThrow_6()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2ba6b6da
		assertNotNull(result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testGetWeaponToThrow_7()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@c74ebdc
		assertNotNull(result);
	}

	/**
	 * Run the void hunt(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testHunt_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature target = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		target.x = 1;
		target.y = 1;

		fixture.hunt(target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@320ecffd
	}

	/**
	 * Run the void onEnter(int,int,int,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testOnEnter_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;
		Tile tile = Tile.BOUNDS;

		fixture.onEnter(x, y, z, tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void onEnter(int,int,int,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testOnEnter_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;
		Tile tile = Tile.BOUNDS;

		fixture.onEnter(x, y, z, tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void onGainLevel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testOnGainLevel_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.onGainLevel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@301b8f98
	}

	/**
	 * Run the void onNotify(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testOnNotify_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		String message = "";

		fixture.onNotify(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testOnUpdate_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.onUpdate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the Tile rememberedTile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testRememberedTile_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Tile result = fixture.rememberedTile(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@22cb5bfc
		assertNotNull(result);
	}

	/**
	 * Run the void setName(Item,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");
		String name = "";

		fixture.setName(item, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testUseBetterEquipment_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1b1cf219
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testUseBetterEquipment_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@45ca5a51
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testUseBetterEquipment_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1aa03cec
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testUseBetterEquipment_4()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@67b42a6a
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testUseBetterEquipment_5()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6e562357
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testUseBetterEquipment_6()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@18785209
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testUseBetterEquipment_7()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6ac39170
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testUseBetterEquipment_8()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@36d30b57
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testUseBetterEquipment_9()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@44a61695
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testUseBetterEquipment_10()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6db7a95d
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testUseBetterEquipment_11()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5330e374
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testUseBetterEquipment_12()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@aab2bd
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testUseBetterEquipment_13()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5007737c
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testUseBetterEquipment_14()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@22251a46
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testUseBetterEquipment_15()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1669c157
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testUseBetterEquipment_16()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@320bb35e
	}

	/**
	 * Run the void wander() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testWander_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.wander();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void wander() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testWander_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.wander();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@77e64753
	}

	/**
	 * Run the void wander() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testWander_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.wander();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1848a843
	}

	/**
	 * Run the void wander() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	@Test
	public void testWander_4()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.wander();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@47b3d143
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/18 8:49 AM
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
	 * @generatedBy CodePro at 5/19/18 8:49 AM
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
	 * @generatedBy CodePro at 5/19/18 8:49 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CreatureAiTest.class);
	}
}