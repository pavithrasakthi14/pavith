String s ="aaabbbbccccccdd";
    String result="";
    StringBuilder sb = new StringBuilder(s);


    while(sb.length() != 0){
        int count = 0;
        char test = sb.charAt(0);
        while(sb.indexOf(test+"") != -1){
            sb.deleteCharAt(sb.indexOf(test+""));
            count++;
        }
      
        result=result+test+count;
    }
    System.out.println(result);         
}
}
