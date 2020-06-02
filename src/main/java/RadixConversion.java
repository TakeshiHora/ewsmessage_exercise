public class RadixConversion {
    private String hexCode;
    private String binCode;
    
    public RadixConversion(String hexCode){
        this.hexCode = hexCode;
    }
    /*
    進数変換
     */
    public String conversion(){
        Integer bin = Integer.parseInt(this.hexCode, 16);
        String binCode = Integer.toBinaryString(bin);
        this.binCode = binCode;
        
        Integer dec = Integer.parseInt(this.binCode, 2);
        String decCode = Integer.toString(dec);
        return decCode;
    }
}
