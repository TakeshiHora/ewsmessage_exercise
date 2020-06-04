/*
気象庁防災情報(震度)
 */
public class EarthquakeEarlyWarning implements Conversion{
    public String hexCode;
    public String preamble;
    public String messageType;
    public String reportClassification;
    public String disasterCategory;
    public String atMo;
    
    public EarthquakeEarlyWarning(String hexCode){
        this.hexCode = hexCode;
        Integer bin = Integer.parseInt(this.hexCode, 16);
        String binCode = Integer.toBinaryString(bin);
        
        this.preamble = binCode.substring(0, 8);
        this.messageType = binCode.substring(8, 14);
        this.reportClassification = binCode.substring(14, 17);
        this.disasterCategory = binCode.substring(17, 21);
        this.atMo = binCode.substring(21, 25);
    }
    /*
    一旦、2進数を10進数に変換し、値を返す処理を記述する
    同じ処理ばかりなので、何とかまとめたい
     */
    @Override
    public String preambleConversion(){
        Integer decPreamble = Integer.parseInt(this.preamble, 2);
        String conversionPreamble = Integer.toString(decPreamble);
        return "PAB: " + conversionPreamble;
    }
    @Override
    public String messageTypeConversion(){
        Integer decMessageType = Integer.parseInt(this.messageType, 2);
        String conversionMessageType = Integer.toString(decMessageType);
        return "MT: " + conversionMessageType;
    }
    @Override
    public String reportCategoryConversion(){
        Integer decReportClassification = Integer.parseInt(this.reportClassification, 2);
        String conversionReportClassification = Integer.toString(decReportClassification);
        
        switch (conversionReportClassification) {
            case "2":
                return "通報区分: Priority";
            case "7":
                return "通報区分: Training/Test";
            default:
                return "該当なし";
        }
    }
    @Override
    public String disasterCategoryConversion(){
        Integer decDisasterCategory = Integer.parseInt(this.disasterCategory, 2);
        String conversionDisasterCategory = Integer.toString(decDisasterCategory);
        
        switch (conversionDisasterCategory) {
            case "14":
                return "災害種別: 防災気象情報 (震度 )";
            default:
                return "該当なし";
        }
    }
    @Override
    public String atMoConversion(){
        Integer decAtmo = Integer.parseInt(this.atMo, 2);
        String conversionAtmo = Integer.toString(decAtmo);
        return "発表時刻: " + conversionAtmo;
    }
}
