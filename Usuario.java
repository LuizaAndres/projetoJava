class Usuario{
    private int idU;
    private String userName;
    private String psw;
    private String nome;

    Usuario(int idU, String userName, String psw, String nome){
        this.idU=idU;
        this.userName=userName;
        this.psw=psw;
        this.nome=nome;

    }
    boolean autenticar(String USTeste, String pswTeste){
        return USTeste.equals(this.userName) && 
            pswTeste.equals(this.psw);
    }

    String nome(){
        return this.nome;

    }
    /**
     * @return the idU
     */
    public int getIdU() {
        return idU;
    }

}