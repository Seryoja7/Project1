public class Example {
    private int member;

    public void setMember(int member) {
        this.member = member;
    }
    protected void format(){
        System.out.println("member: "+member);
    }
    void print(){
        System.out.println("member: "+member);
    }
}
