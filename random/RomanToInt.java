package random;

import java.util.Map;

public class RomanToInt {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s){
        int number = 0;
        byte[] chars = s.getBytes();
        Map<Character,Integer> romanMap = Map.of('I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000);
        for(int i=0;i<chars.length;i++){
            if(i+1 < chars.length && romanMap.get((char)chars[i]) < romanMap.get((char)chars[i+1]))
                number-=romanMap.get((char)chars[i]);
            else
                number+=romanMap.get((char)chars[i]);
        }
        return number;
     }
}
