public class subsequnce11 {
    public static void printsub(String str,int idx, String newstring){
        if(idx==str.length()){
            System.out.println(newstring);
            return;
        }
        char currcahr=str.charAt(idx);
        printsub(str,idx+1,newstring+currcahr);
        printsub(str,idx+1,newstring+"-");

    }
    public static void Print(String strr,int count ,String newstring,int idx){

        if(idx==strr.length()){
            for(int i=0; i<count; i++){
                newstring+='y';
            }
            System.out.println(newstring);
            return;
        }

        char currcahr=strr.charAt(idx);
        if(currcahr=='y'){
            count++;
            Print(strr,count, newstring,idx+1);
        }
        else{
            newstring+=currcahr;
            Print(strr,count,newstring, idx+1);
        }

    }
    public static void main(String[] args) {
        String str="abc";
        String strr="aybcyyd";
        String srt="abngdjak";
       // printsub(str,0," ");
        Print(strr,0," ",0);

    }


}
