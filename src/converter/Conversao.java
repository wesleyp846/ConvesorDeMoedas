package converter;

public class Conversao {
    String result = "";
    String time_last_update_utc = "";
    String base_code = "";
    String target_code = "";
    Double conversion_rate = 0.0;
    Double conversion_result = 0.0;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getTime_last_update_utc() {
        return time_last_update_utc;
    }

    public void setTime_last_update_utc(String time_last_update_utc) {
        this.time_last_update_utc = time_last_update_utc;
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public void setTarget_code(String target_code) {
        this.target_code = target_code;
    }

    public Double getConversion_rate() {
        return conversion_rate;
    }

    public void setConversion_rate(Double conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    public Double getConversion_result() {
        return conversion_result;
    }

    public void setConversion_result(Double conversion_result) {
        this.conversion_result = conversion_result;
    }

    @Override
    public String toString() {
        return "Resultado da conversão \n" +
                "Data da convesão = " + time_last_update_utc + '\n' +
                "Moeda base = " + base_code + '\n' +
                "Moeda alvo = " + target_code + '\n' +
                "Taxa de convesão = " + conversion_rate + '\n' +
                "Valor convertido = " + conversion_result + '\n';
    }
}
