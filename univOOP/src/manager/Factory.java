package manager;

@FunctionalInterface
public interface Factory<T extends Manageable> {
	public T create();
}
