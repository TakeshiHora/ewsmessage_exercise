public class RadixConversion {
    //受信した信号のデータ　取り敢えず途中まで動かしてみる
    public String hexCode;
    
    public String preamble;
    public String messageType;
    public String reportClassification;
    public String disasterCategory;
    public String atMo;
    
    public RadixConversion(String hexCode){
        this.hexCode = hexCode;
    }
    //16進数を2進数に変換
    public String hexadecimalToBinaryconversion(){
        Integer bin = Integer.parseInt(this.hexCode, 16);
        String binCode = Integer.toBinaryString(bin);
        
        //入力された文字列をスライスし切り出す
        this.preamble = binCode.substring(0, 8);
        this.messageType = binCode.substring(8, 14);
        this.reportClassification = binCode.substring(14, 17);
        this.disasterCategory = binCode.substring(17, 21);
        this.atMo = binCode.substring(21, 25);
        
    //2進数を10進数に変換
        Integer dec = Integer.parseInt(this.reportClassification, 2);
        String decCode = Integer.toString(dec);
        return decCode;
    }
}
