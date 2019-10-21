
//先翻转整个句子每个字符，再各自翻转每个单词
public class Solution {
    public String ReverseSentence(String str) {
    if(str==null||str.trim().getClass().equals(""))
        return str;
    char[] c=str.toCharArray();
     
    reverse(c, 0, str.length()-1);
     
    int begin=0;
    int end=0;
    while(begin!=c.length){//若起始字符为空格，则begin和end都自加
        if(c[begin]==' '){
        begin++;
        end++;
        }
        else if(c[end]==' '){//遍历到终止字符为空格，就进行翻转
        reverse(c, begin, --end);
        begin=++end;
        }
        else if(end==c.length-1){//若遍历结束，就进行翻转
        reverse(c, begin,end);
        begin=++end;
        }
        else{//没有遍历到空格或者遍历结束，则单独对end自减
        end++;
        }
    }
     
    return String.valueOf(c);
    }
     
  //翻转句子
    private void reverse(char[] c,int begin,int end){
    while(begin<end){
        char temp=c[begin];
        c[begin]=c[end];
        c[end]=temp;
         
        begin++;
        end--;
    }
    }
}
