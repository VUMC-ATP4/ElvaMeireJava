package classroomSix;

public class Customer {
    private String name;
    private Boolean member = false;
    private String memberType;

    public Customer (String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public String getMemberType() {
        return memberType;
    }

    public String isMember(){
        return memberType;
    }

    public void setMember(Boolean member){
        this.member = member;
    }

    public void setMemberType(String memberType){
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", member=" + member +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}








