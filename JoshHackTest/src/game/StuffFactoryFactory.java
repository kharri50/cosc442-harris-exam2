package game;



/**
 * The class <code>StuffFactoryFactory</code> implements static methods that return instances of the class <code>{@link StuffFactory}</code>.
 *
 * @generatedBy CodePro at 5/19/18 9:52 AM
 * @author kyleharris
 * @version $Revision: 1.0 $
 */
public class StuffFactoryFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 9:52 AM
	 */
	private StuffFactoryFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link StuffFactory}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 9:52 AM
	 */
	public static StuffFactory createStuffFactory() {
		return new StuffFactory(new World(new Tile[][][] {{{Tile.BOUNDS}}}));
	}
}