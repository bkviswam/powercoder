package meta.loop;

public class ValidWordAbbr {
    public static void main(String[] args) {
        String word = "internationalization";
        String abbr = "i18n";
        ValidWordAbbr v = new ValidWordAbbr();
        System.out.println("is Equal : "+v.validate(word, abbr));
    }

    private boolean validate(String word, String abbr) {
        int i = 0, j=0;

        while(i<word.length() && j< abbr.length()){
            if(word.charAt(i) == abbr.charAt(j)){
                i++;
                j++;
            } else if(abbr.charAt(j) > '0' && abbr.charAt(j) <='9'){
                int start = j;
                while(j < abbr.length() && Character.isDigit(abbr.charAt(j))){
                    j++;
                }
                i += Integer.parseInt(abbr.substring(start, j));
            }else {
                return false;
            }
        }
        return word.length() == i && abbr.length() == j;
    }
}
