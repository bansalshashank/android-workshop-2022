package edu.shashank.ourfirstapp;

public class DataTypes {


// Java is a type strict language

    // Constant
    final String NAME = "Kriyanash";

    // Variable
    String name = "Shashank";


//    Name Convention
//    1. Should Start with a character
//    2. Shouldn't have any special characters except for _
//    3. In can be alpha numeric example name_12, na12me, name12
//    4. Variable names are case sensitive , NAME !=(not equal) name, NAME != NAMe
//    5. Variable names can't have space in between
//      Example of a variable -
//          [modifier (public/private/protected)] [data type] variable_name = value;

//    Types of Variables
//    1. Primitive Variable - int, float, boolean, char
//    2. Non Primitive - String, Array, Classes, ArrayList, HashList

//    Primitive data types
    public int number = 10;
    public float numberFloat = (float)10.25;
    public double numberDouble = 10.88845646546;
    public char character = 'C';
    public boolean isTrue = false;

//    Non - Primitive Data types
    public String myString = "Demo Text";
//    Array - Collection of same data type
    public int[] tableOfTen = {
            100, //tableOfTen[0]
            30, //tableOfTen[1]
            20, //tableOfTen[2]
            40, //tableOfTen[3]
            50 //tableOfTen[4]
    };

    public int arr[] = new int[5];


}
