package Page232;

public class ErrorInfo {
    String msgs[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"
    };
    int howbad[] = {3, 3, 2, 1};
    Err getErrorInfo(int i){
        if(i >= 0 & i < msgs.length){
            return new Err(msgs[i], howbad[i]);
        } else {
            return new Err("Несуществующий крд ошибки", 0);
        }
    }
}
