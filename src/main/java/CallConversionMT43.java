public class CallConversionMT43 {
    public static void main(String[] args){
        //引数は実際は入力値とする。入力方法は別途検討する
        RadixConversion mt43Code = new RadixConversion("9AADF2");
        //System.out.println(mt43Code.hexCode);
        
        //進数変換した結果で、通報区分を確認する
        DisasterType disasterType = new DisasterType(mt43Code.conversion());
        System.out.println(disasterType.conversion_logic());
        
        //通報区分が「震度」の場合に呼び出す処理を記述する
        EarthquakeEarlyWarning ew = new EarthquakeEarlyWarning(mt43Code.hexCode);
        
    }
}

