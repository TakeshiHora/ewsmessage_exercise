public class Tsunami implements Conversion {
    public String hexCode;
    public String preamble;
    public String messageType;
    public String reportClassification;
    public String disasterCategory;
    public String atMo;
    
    public Tsunami(String hexCode) {
        this.hexCode = hexCode;
        Integer bin = Integer.parseInt(this.hexCode, 16);
        String binCode = Integer.toBinaryString(bin);
    
        this.preamble = binCode.substring(0, 8);
        this.messageType = binCode.substring(8, 14);
        this.reportClassification = binCode.substring(14, 17);
        this.disasterCategory = binCode.substring(17, 21);
        this.atMo = binCode.substring(21, 25);
    }
    @Override
    public String preambleConversion(){
        return null;
    }
    @Override
    public String messageTypeConversion(){
        return null;
    }
    @Override
    public String reportCategoryConversion(){
        return null;
    }
    @Override
    public String disasterCategoryConversion(){
        return null;
    }
    @Override
    public String atMoConversion(){
        return null;
    }

}
