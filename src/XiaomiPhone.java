public class XiaomiPhone extends Phone{
    @Override
    public String Info() {
        return "Это специальный метод Info() для класса XiaomiPhone.\n"
                + "Модель: " + getModel()
                + "\t, номер: " + getNumber()
                + "\t, вес: " + getWeight()
                + "\t, ID телефона: " + getPhoneID();    }
}
