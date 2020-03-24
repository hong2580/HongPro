import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TestA {
    private Dictionary publicDictionary;
    private Dictionary userDictionary;
    private WordSeg wordSeg;

    @Before
    public void init() {
        publicDictionary = Dictionary.newBuilder()
                .appendDictionary("i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "man go")
                .build();

        userDictionary = Dictionary.newBuilder()
                .appendDictionary("i", "like", "sam", "sung", "mobile", "icecream", "man go", "mango")
                .build();

        wordSeg = WordSeg.newBuilder()
                .withPublicDictionary(publicDictionary)
                .withUserDictionary(userDictionary)
                .build();
    }


    @org.junit.Test
    public void testWordBreak1() {
        List<String> result = wordSeg.wordBreak("ilikesamsungmobile", WordSeg.SearchMode.ONLY_PUBLIC);
        Assert.assertTrue(result.size() == 2);
        Assert.assertEquals("i like sam sung mobile", result.get(0));
        Assert.assertEquals("i like samsung mobile", result.get(1));

        result = wordSeg.wordBreak("ilikeicecreamandmango", WordSeg.SearchMode.ONLY_PUBLIC);
        Assert.assertTrue(result.size() == 1);
        Assert.assertEquals("i like ice cream and man go", result.get(0));
    }


}
