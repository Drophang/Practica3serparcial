public class ManejodeString {
    public static void main(String[] args) {
        String S = "Programacion orientada a obejetos";
        System.out.println("Tamaño " + S.length());
        S = S.replaceAll(" ","");
        System.out.println(S);
        S = S.toUpperCase();
        System.out.println(S);
        S = S + "12345";
        System.out.println(S);
        String Sub_S = S.substring(10,15);
        System.out.println(Sub_S);
        S = S.replace("o","O");
        S.compareTo("Programacion");
    }
}
