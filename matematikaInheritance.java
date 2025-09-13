
package matematikaberaksi;

public class matematikaInheritance {
    public static void main(String[] args) {
        matematika mtk = new matematika();
        
        mtk.pertambahan(20,10);
        mtk.pengurangan(10,5);
        mtk.perkalian(10,3);
        mtk.pembagian(21,2);
        
        matematika2 mtk2 = new matematika2();
        mtk2.modulus(10, 3);
        
        
    }
    
}
