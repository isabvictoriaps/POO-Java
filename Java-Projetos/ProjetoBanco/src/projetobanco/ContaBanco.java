package projetobanco;

public final class ContaBanco {
    
    public int numConta;
    protected String tipoConta;
    private String nomeCliente;
    private float saldo;
    private boolean statusConta;

    //Construtor 
     public ContaBanco() {
        this.saldo = 0;
        this.statusConta = false;
    }
    
    //Métodos
    
    public void estadoAtual() {
        System.out.println("--------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.tipoConta);
        System.out.println("Dono: " + this.getTipoConta());
        System.out.println("saldo: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatusConta());
    }

    public void abrirConta(String t) {
        this.setTipoConta(t);
        this.setStatusConta(true);

        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (saldo == 0) {
            System.out.println("Conta fechada com sucesso!");
        } else if (0 > saldo) {
            System.out.println("Impossível fechar conta. Conta em débito");
        } else {
            System.out.println("Impossível fechar a conta. Por gentila, retire o saldo");
        }
    }

    public void depositar(float v) {
        if (this.statusConta == true) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de " + this.nomeCliente);
        }
        else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }

    public void sacar(float v) {
        if (this.getStatusConta()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso na conta de " + this.nomeCliente);
            }
            else {
                System.out.println("Saldo insuficiente para saque");
            }
        }
        else{
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipoConta() == "CC") {
            v = 12;
        }
        else if (this.getTipoConta() == "CP"){
           v = 20;
        }
        
        if (this.getStatusConta()) {
        this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso");
        } else {
            System.out.println("Impossível pagar a mensalidade de uma conta fechada");
        }
    }

    // Métodos Especiais (Getter e Set)

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public final void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }
    
   
}

