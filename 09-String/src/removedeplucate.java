public class removedeplucate {
    static void main(String[] args) {
        String s1 ="aacddgggfdcabbb";
        String s2="";
        for (char c1:s1.toCharArray()){
            if(s2.indexOf(c1)!=-1){
                continue;
            }else {
                s2+=c1;
            }

        }
        System.out.println(s2);
    }
}
