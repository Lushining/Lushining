package house;
//房屋列表：编号、房主、电话、地址、月租、状态
public class House {
    private int id;
    private String name;
    private String number;
    private String address;
    private int fare;
    private String situation;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getNumber() {return number;}
    public void setNumber(String number) {
        this.number = number;}
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}
    public int getFare() {return fare;}
    public void setFare(int fare) {this.fare = fare;}
    public String getSituation() {return situation;}
    public void setSituation(String situation) {this.situation = situation;}
    public House(int id, String name, String number,
                 String address, int fare, String situation) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.address = address;
        this.fare = fare;
        this.situation = situation;
    }
    @Override
    public String toString() {
        return id + "\t\t" + name + "\t\t" + number + "\t\t" +
                address + "\t\t" + fare + "\t\t" + situation ;
    }
}
