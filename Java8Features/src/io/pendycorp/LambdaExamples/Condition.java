package io.pendycorp.LambdaExamples;

/**
 * Functional Interface created to implement Lambda 
 * @author srinathpendyala
 *
 */
@FunctionalInterface
public interface Condition {

	boolean test(Person p);

}
