/*
利用者側の処理
 */
public class CallConversionMT43 {
    public static void main(String[] args) {
        //引数は実際は入力値とする。入力方法は別途検討する
        RadixConversion mt43Code = new RadixConversion("9AADF2C");
    
        //通報区分が「震度」の場合に呼び出す処理
        EarthquakeEarlyWarning earthquakeEarlyWarning = new EarthquakeEarlyWarning(mt43Code.hexCode);
        
        //通報区分が「震度」の場合に呼び出す処理
        Tsunami tsunami = new Tsunami(mt43Code.hexCode);
    }
}

