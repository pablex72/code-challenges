class WhileDemo {
    public static void main(String[] args){

        String nome = "asdfghj";
        String[] noneArray = nome.split("");
        String nome1 = "";
        String[] nomeArray1 = new String[20];
        int count = 1;
        while (count < nome.length()) {

            nome1 = nome1 + noneArray[count];
            System.out.println(nome1);


            System.out.println("Count is: " + count);
            count++;
        }
    }
}