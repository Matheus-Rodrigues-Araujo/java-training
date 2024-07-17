public class Main {
    public String name;
    protected int salary;

    public static void main(String[] args) {
        Ser meuSerPessoa = new Pessoa("Rodrigo", 40, "Almeida");
        System.out.println(meuSerPessoa.movimentar());
    }

    private void setSalary(){
        this.salary = 4000;
    }
    public int getSalary(){
        this.setSalary();
        return this.salary;
    }
}

