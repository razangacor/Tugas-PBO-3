
package matematikaberaksi;

public class matematika implements Imatematika{
    int a,b,c;
    
    @Override
    public Integer pertambahan(int a,int b){
        this.a = a;
        this.b = b;
        c = a+b;
        System.out.println("Pertambahan : "+ a + " + "+ b +" = "+c);
        return c;
    }
    
    @Override
    public Integer pengurangan(int a,int b){
        this.a = a;
        this.b = b;
        c = a-b;
        System.out.println("Pengurangan : "+ a + " + "+ b +" = "+c);
        return c;
    }
    @Override
    public Integer perkalian(int a,int b){
        this.a = a;
        this.b = b;
        c = a*b;
        System.out.println("Perkalian : "+ a + " + "+ b +" = "+c);
        return c;
    }
    @Override
    public Integer pembagian(int a,int b){
        this.a = a;
        this.b = b;
        c = a/b;
        System.out.println("Pembagian : "+ a + " + "+ b +" = "+c);
        return c;
    }
    
    
}
