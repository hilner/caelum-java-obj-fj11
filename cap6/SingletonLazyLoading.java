public class SingletonLazyLoading {
	private static SingletonLazyLoading instance = null;

	private SingletonLazyLoading() {}

	public static synchronized SingletonLazyLoading getInstance() {
		if (instance == null) {
			instance = new SingletonLazyLoading();
		}

		return instance;
	}
}