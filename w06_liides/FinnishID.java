import java.time.LocalDate;

public class FinnishID implements PersonalCodeBehaviour{
    public String code; 
    
    public FinnishID(String code) {
        this.code = code;
    }

    @Override
    public String getGender() {
        String gender = "";
        if (Integer.parseInt(code.substring(7,10))%2==0){
            gender = "N";
        } else {
            gender = "M";
        }
        return gender;
    }

    @Override
    public int getFullYear() {
        int year = 0;
        if(code.substring(6, 7).equals("+")){
            year = 1800 + Integer.parseInt(code.substring(4,6));
        }
        else if(code.substring(6, 7).equals("-")){
            year = 1900 + Integer.parseInt(code.substring(4,6));
        }else if(code.substring(6, 7).equals("A")){
            year = 2000 + Integer.parseInt(code.substring(4,6));
        }
        return year;
    }

    @Override
    public String getDOB() {
        String dob = Integer.toString(getFullYear())+"-"+code.substring(2, 4)+"-"+code.substring(0, 2);
        return dob;
    }
    @Override
    public int getAge() {
        LocalDate date = LocalDate.now();
        String dat = String.valueOf(date);
        int age = Integer.parseInt(dat.substring(0, 4))-getFullYear();
        return age;
    }
    @Override
    public String getMonth() {
        String[] months = new String[]{"jaanuar", "veebruar", "märts", "aprill", "mai", "juuni", "juuli", "august", "september", "oktoober", "november", "detsember"};
        String month = months[Integer.parseInt(code.substring(2, 4))-1];
        return month;
    }
    @Override
    public int getDay() {
        int day = Integer.parseInt(code.substring(0, 2));
        return day;
    }
    @Override
    public int untilNextBirthday() {
        LocalDate date = LocalDate.now();
        String dat = String.valueOf(date);
        int unb = (Integer.parseInt(code.substring(2, 4))*30+Integer.parseInt(code.substring(0, 2))+365)-(Integer.parseInt(dat.substring(5,7))*30+Integer.parseInt(dat.substring(8,10)));
        if(unb>365){
            unb-=365;
        }
        return unb;
    }
    
}
