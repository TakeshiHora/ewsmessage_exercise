import java.util.HashMap;
import java.util.Map;

public class DisasterType {
    private Integer disasterCode;
    
    public DisasterType(Integer disasterCode){
        this.disasterCode = disasterCode;
    }
    /*
    残骸
    Map<Integer, String> setDisasterTypeCode = new HashMap<Integer, String>();
     */
    public String conversion(){
        switch (this.disasterCode) {
            case 1:
                return "気象庁防災情報(緊急地震速報)";
            case 2:
                return "気象庁防災情報(震源)";
            case 3:
                return "気象庁防災情報(震度)";
            case 4:
                return "気象庁防災情報(南海トラフ地震)";
            case 5:
                return "気象庁防災情報(津波)";
            case 6:
                return "気象庁防災情報(北西太平洋津波)";
            case 7:
                return "unusual";
            case 8:
                return "気象庁防災情報(火山)";
            case 9:
                return "気象庁防災情報(降灰)";
            case 10:
                return "気象庁防災情報(気象)";
            case 11:
                return "気象庁防災情報(洪水)";
            case 12:
                return "気象庁防災情報(台風)";
            case 13:
                return "unusual";
            case 14:
                return "気象庁防災情報(海上)";
            default:
                return "該当なし";
        }
    }
}
