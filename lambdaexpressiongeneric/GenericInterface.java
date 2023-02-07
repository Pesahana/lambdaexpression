package lambdaexpressiongeneric;


@FunctionalInterface
public interface GenericInterface<T> {

	T func(T t);
	
}
