package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
class RegExpTest {
//    public static void main(String[] args) {
//        String str = "成都市(成华区)(武侯区)(高新区)";
//        Pattern p = Pattern.compile(".*?(?=\\()");
//        Matcher m = p.matcher(str);
//        if(m.find()) {
//            System.out.println(m.group());
//        }
//    }

    public static void main(String[] args) {
        for (int i=0; i< 3; i++){
            for(int j=0;j<2;j++){
                System.out.println("i:"+i);
                if(j==1){
                    break;
                }
            }
        }
    }
}
