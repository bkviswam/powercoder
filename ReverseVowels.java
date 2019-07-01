
class ReverseVowels{

//Reverse vowles in a String  

 public ReverseVowels(){}
  //
  public static void main(String [] arg){
    String str = "leetcode";
		ReverseVowels rw = new ReverseVowels();
		System.out.println(rw.reverseVowels(str));
  }
  public boolean isVowel(char c){
    return (c=='A'||c='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u');
  }
  public String reverseVowels(String str){
    char[] arr = str.toCharArray();
    int start=0;
    int end=arr.length-1;
    while(start<end){
      if(!isVowel(arr[start])){
        start++;
        continue;
      }
      if(!isVowel(arr[end])){
        end--;
        continue;
      }
      //swap the arr[start] and arr[end]
       char temp = arr[start];
       arr[start]=arr[end];
       arr[end]=temp;
       start++;
       end--;
    }
    return new String(arr);
  }
}
