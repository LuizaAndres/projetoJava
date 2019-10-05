public class exemploFuncaoObjeto {
    public static void main(String[] args) {
        System.out.println("Hellow");
        chamadaDeFuncao();
    }
    private static void chamadaDeFuncao(String msg) {
        System.out.println("Hellow 2");
        System.out.println(msg);
    }
}