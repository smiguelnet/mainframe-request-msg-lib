package br.com.setia.mainframe.message.spec;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Define message attribute type
 *
 * @author Setia Tecnologia
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface SetiaMessageFieldAttr {

    SetiaMessageFieldType type() default SetiaMessageFieldType.ALFA;

    String field() default "";

    String description() default "";

    int size() default 0;

    int order() default 0;

    String completeWith() default "";

    String defaultValue() default "";

    /**
     * Types: PIC X / PIC 9
     */
    enum SetiaMessageFieldType {ALFA, NUMERIC}
}
