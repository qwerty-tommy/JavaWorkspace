package week09;

@FunctionalInterface
public interface Factory<T extends Manageable> {
	public T create();
}
