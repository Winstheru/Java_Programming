public class SearchLongestName {
    public static void main(String[] args) {
        String[] name = {"Nakita","Joan","Ahmad"};
        String longest = name[0];
        for(int i = 0; i < name.length; i++){
            if(name[i].length() > longest.length()){
                longest = name[i];
            }
        }
        System.out.println("The Longest Name is " + longest);
    }
}
