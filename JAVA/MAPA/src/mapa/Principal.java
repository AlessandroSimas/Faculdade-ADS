
package mapa;


public class Principal {

    
    public static void main(String[] args) {
        Presidente p = new Presidente();
        Cliente c = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
        Cliente c4 = new Cliente();
        Secretaria s = new Secretaria();
        Secretaria s2 = new Secretaria();
        Vendedor v = new Vendedor();
        Vendedor v2 = new Vendedor();
        Vendedor v3 = new Vendedor();
        
        
        p.nome = "Asdrubal Leôncio Correa";
        p.documento = "123.456.758.90";
        p.salario = (12000);
        s.nome = "Fatima";
        s.documento = "333.444.555-66";
        s2.nome = "Ana";
        s2.documento = "567.765.567-77";
        s2.salario = (3200);
        v.nome = "Joao";
        v.setComissao(1230);
        v.documento = "101.101.105.-01";
        v2.nome = "Vanessa";
        v2.setComissao(1980);
        v2.documento = "222.222.222-22";
        v3.nome = "Carlos";
        v3.setComissao(2500);
        v3.documento = "444.777.444-77";
        c.nome = "Marcos";
        c.documento = "999.999.999-99";
        c2.nome = "Joana";
        c2.documento= "323.323.333-22";
        c3.nome = "Elisa";
        c3.documento = "666.777.666-77";
        c4.nome = "Lucas";
        c4.documento = "055.044.033-99";
        
              
        
        p.exibeDados();
        p.calculaSalarioAnual();
        s.exibeDados();
        s2.exibeDados();
        s2.calculaSalarioAnual();
        v.exibeDados();
        v2.exibeDados();
        v3.exibeDados();
        c.exibeDados();
        c2.exibeDados();
        c3.exibeDados();
        c4.exibeDados();
        c4.verificarSenha("123456");
        
        
        
    }

    
    
    
}
