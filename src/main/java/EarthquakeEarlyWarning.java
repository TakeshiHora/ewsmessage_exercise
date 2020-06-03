
public class EarthquakeEarlyWarning {
    public String hexCode;
    public String reportCategory;
    public String disasterCategory;
    public String atMo;
    public String atD;
    public String atH;
    public String atMi;
    public String iT;
    
    
    public EarthquakeEarlyWarning(String hexCode){
        Integer bin = Integer.parseInt(hexCode, 16);
        String binCode = Integer.toBinaryString(bin);
        this.reportCategory = binCode.substring(14, 17);
        this.disasterCategory = binCode.substring(17, 21);
    }
    
    //ここは途中なので、書き直す必要ある。
    public String reportCategoryConversion(){
        switch (this.reportCategory) {
            case "3":
                return "3";
            default:
                return "該当なし";
        }
    }
    public String disasterCategoryConversion(){
        switch (this.disasterCategory) {
            case "14":
                return "14";
            default:
                return "該当なし";
        }
        
    }
}
