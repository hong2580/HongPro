import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A{
    public static void main(String[] args) {
        //输入
        String str1 = "ilikesamsungmobile";
        //字典
        String[] dic = {"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "mango"};
        List<String> dicList = Arrays.asList(dic);
        List<String> ans = new ArrayList<String>();


        StringBuffer sb = new StringBuffer(str1);
        int i=0;

        while (sb.length()>0){
            for(int j=1;j<=sb.length();j++){
                String s = sb.substring(0,j);
                if(dicList.contains(s)){
                    ans.add(s);
                    String ss = sb.substring(j,sb.length());
                    sb = new StringBuffer(ss);
                    j=1;
                }
            }
        }


        //输出
        for(int k=0;k<ans.size();k++){
            if(k!=ans.size()-1){
                System.out.print(ans.get(k)+" ");
            }else{
                System.out.print(ans.get(k));
            }
        }


    }
}