public class SamsungPhone extends Phone {
    @Override
    public String Info() {
        return "Это специальный метод Info() для класса SamsungPhone.\n"
                + "Модель: " + getModel()
                + "\t, номер: " + getNumber()
                + "\t, вес: " + getWeight()
                + "\t, ID телефона: " + getPhoneID();
    }
}
