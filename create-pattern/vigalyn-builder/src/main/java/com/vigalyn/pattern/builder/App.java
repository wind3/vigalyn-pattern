package com.vigalyn.pattern.builder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        PersonBuilder build = new ManBuilder();
        Person person = build.buildPerson();
       
        build = new WemonBuilder();
        person = build.buildPerson();
    }
}
