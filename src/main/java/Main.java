import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dictionary pubDictionary = Dictionary.newBuilder()
                .appendDictionary("i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "man go")
                .build();

        Dictionary userDictionary = Dictionary.newBuilder()
                .appendDictionary("i", "like", "sam", "sung", "mobile", "icecream", "man go", "mango")
                .build();

        WordSeg swordSeg = WordSeg.newBuilder()
                .withPublicDictionary(pubDictionary)
                .withUserDictionary(userDictionary)
                .build();

        List<String> result = swordSeg.wordBreak("ilikeicecreamandmango", WordSeg.SearchMode.ONLY_PUBLIC);

        System.out.println("input: ");
        System.out.println("ilikeicecreamandmango");
        System.out.println("output: ");
        result.forEach(System.out::println);
        System.out.println();
    }


}