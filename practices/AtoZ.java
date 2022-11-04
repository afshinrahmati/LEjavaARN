class AtoZ{
    public static void main(String[] args){

      char c;
        int i = 1;
    for(c = 'A'; c <= 'Z'; ++c)
    if(++i % 2 == 0){
      System.out.print(c + " " + i);

    }
    }
}