//Complete the class ArrayListMethods. It consists of four short methods
//to manipulate an array list of strings. The method header and javadoc
//are given to you.

// Need help starting this question? In the lesson titled
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 6 - Question 1" for some tips on
// how to begin.
package ArrayListPS6;

//Complete the class ArrayListMethods. It consists of four short methods
//to manipulate an array list of strings. The method header and javadoc
//are given to you.

// Need help starting this question? In the lesson titled
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 6 - Question 1" for some tips on
// how to begin.

import java.util.ArrayList;

public class ArrayListMethods
{
    ArrayList<String> list; //instance variable
    /**
     * Constructor for objects of class ArrayListMethods
     */
    public ArrayListMethods(ArrayList<String> arrayList)
    {
        // initialise instance variables
        list = arrayList;
    }

    /**
     * Determines if the array list is sorted (do not sort)
     * When Strings are sorted, they are in alphabetical order
     * Use the compareTo method to determine which string comes first
     * You can look at the String compareTo method in the Java API
     * @return true if the array list is sorted else false.
     */
    public boolean isSorted()
    {
        boolean sorted = true;
        int listSize = list.size();

        for(int i = 0; i < listSize-1; i++){
            String str1 = list.get(i);
            String str2 = list.get(i+1);

            if(str1.compareTo(str2) > 0 ){
                sorted = false;
                break;
            }
        }

        return sorted;
    }

    /**
     * Replaces all but the first and last elements with the larger of its two neighbors
     * You can use the compareTo() method to determine which string is larger (larger in alphabetical
     * order).
     * Example: if the list is originally
     *    ["cat", "ape", "dog", "horse", "zebra"]
     * after this method it should be:
     *    ["cat", "dog", "horse", "zebra", "zebra"]
     */
    public void replaceWithLargerNeighbor()
    {
        // TODO: Replace all but the first and last elements with the larger of its two neighbors
        int listSize = list.size();

        for(int i = 1; i < listSize-1; i++){
            String before = list.get(i-1);
            String target = list.get(i);
            String after = list.get(i+1);

            //check which neighbor is greater
            if(before.compareTo(after) > 0 ){
                //if before, check against target
                if(target.compareTo(before) < 0){
                    list.remove(i);
                    list.add(i,before);
                }
            }

            else {
                if(target.compareTo(after) < 0){
                    list.remove(i);
                    list.add(i,after);
                }
            }
        }

    }

    /**
     * Gets the number of duplicates in the list.
     * Be careful to only count each duplicate once. Start at index 0. (Does it match any of the other elements?)
     * Get the next word. It is at index i. (Does it match any of the words with index > i?)
     * @return the number of duplicate words in the list
     */
    public int countDuplicates()
    {
        int duplicates = 0;

        // TODO: Write the code to get the number of duplicates in the list
        int listSize = list.size();

        for(int i = 0; i < listSize; i++){
            String str1 = list.get(i);
            for(int j = i+1; j < listSize; j++){
                if (i == j){
                    continue;
                }
                String str2 = list.get(j);

                if (str1.compareTo(str2) == 0 ){
                    duplicates++;
                }
            }
        }

        return duplicates;
    }

    /**
     * Moves any word that starts with x, y, or z to the front of the ArrayList, but
     * otherwise preserves the order
     * Example: if the list is orginially
     *   ["ape", "dog", "xantus", "zebra", "cat", "yak"]
     * after this method is called it should be
     *   ["xantus", "zebra", "yak", "ape", "dog", "cat"]
     */
    public void xyzToFront()
    {
        int insertAt = 0;
        int listSize = list.size();

        // TODO:  Move any word that starts with x, y, or z to the front of the ArrayList, but otherwise preserves the order

        for (int i = 0; i < listSize; i++){
            String each = list.get(i);
            if(each.startsWith("x") || each.startsWith("y") || each.startsWith("z")){
                list.remove(i);
                list.add(insertAt, each);
                insertAt++;
            }
        }
    }

    /**
     * gets the string representation of this array list
     * @returns the string representation of this array list in
     * standard collection format
     */
    public String toString()
    {
        return list.toString();
    }
}
