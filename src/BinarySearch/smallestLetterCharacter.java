package BinarySearch;

//You're given a sorted array of characters  you need to find the smallest character that is greater than the given target. If there's no greater character, the answer should wrap around and return the first character of the array.
public class smallestLetterCharacter {
    public static void main(String[] arxgs) {
        char[] arr={'a','d','e','h','i','k','m'};
        System.out.println(nextGreatestLetter(arr,'e'));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // suppose if we say end instaed start then it will return actual element
        return  letters[start % letters.length]; // to return first character if no smallest character present greatest than given character as start % letters.length will provide same answer
    }
}


