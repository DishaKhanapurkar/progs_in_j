public class oneaway {
    public static void main(String args[]){
        System.out.println(oneditaway("pale","plea"));
            }
           static boolean oneditaway(String first , String second){
                if(first.length()==second.length()){
                    return oneditreplace(first,second);
                }
                else if(first.length()+1==second.length()){
                    return oneditinsert(first,second);

                }
                else if(first.length()-1==second.length()){
                    return oneditinsert(second,first);

                }
                return false;
            }
           static boolean oneditreplace(String s1,String s2){
                boolean  founddifference=false;
                for(int i=0;i<s1.length();i++){
                    if(s1.charAt(i)!=s2.charAt(i)){
                        if(founddifference){
                            return false;
                        }
                        founddifference=true;
                    }
                }
                return true;
            }
           static boolean oneditinsert(String s1,String s2){
                int index1=0;
                int index2=0;
                while(index2<s2.length() && index1 <s1.length()){
                    if(s1.charAt(index1)!=s2.charAt(index2)){
                        if(index1!=index2){
                            return false;
                        }
                        index2++;
                    }
                    else{
                        index1++;
                        index2++;
                    }
                }
                return true;
                }

            }

