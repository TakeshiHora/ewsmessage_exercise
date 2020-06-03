public class RadixConversion {
    //受信した信号のデータ　取り敢えず途中まで
    public String hexCode;
    public String preamble;
    public String messageType;
    public String disasterCategory;
    
    public RadixConversion(String hexCode){
        this.hexCode = hexCode;
    }
    /*
    進数変換
    */
    public String conversion(){
        Integer bin = Integer.parseInt(this.hexCode, 16);
        String binCode = Integer.toBinaryString(bin);
        
        //入力された文字列をスライスし切り出す
        this.preamble = binCode.substring(0, 8);
        this.messageType = binCode.substring(8, 14);
        this.disasterCategory = binCode.substring(14, 17);
        
        Integer dec = Integer.parseInt(this.disasterCategory, 2);
        String decCode = Integer.toString(dec);
        return decCode;
    }
}
