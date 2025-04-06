package BinarySearch;

//find the smallest letter than target
public class smallestLetterCharacter {
    public static void main(String[] args) {
        char[] arr={'a','c','d','e','g','i'};
        System.out.println(nextGreatestLetter(arr,'a'));
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
        return (char) letters[start % letters.length];
    }
}


