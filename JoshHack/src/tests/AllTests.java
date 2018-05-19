package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CreatureAiTest.class, CreatureTest.class, EatScreenTest.class, InventoryTest.class, WorldTest.class })

public class AllTests {

}
