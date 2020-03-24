import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dictionary publicDictionary = Dictionary.newBuilder()
                .appendDictionary("i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "man go")
                .build();

        Dictionary userDictionary = Dictionary.newBuilder()
                .appendDictionary("i", "like", "sam", "sung", "mobile", "icecream", "man go", "mango")
                .build();

        WordSeg wordSegmenter = WordSeg.newBuilder()
                .withPublicDictionary(publicDictionary)
                .withUserDictionary(userDictionary)
                .build();

        List<String> result = wordSegmenter.wordBreak("ilikeicecreamandmango", WordSeg.SearchMode.ONLY_PUBLIC);

        System.out.println(result.toString());

    }

    private static void println(String input, Collection<String> collection) {
        System.out.println("input: ");
        System.out.println(input);
        System.out.println("output: ");
        collection.forEach(System.out::println);
        System.out.println();
    }
}