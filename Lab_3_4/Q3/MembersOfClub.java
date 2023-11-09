package Q3;

public class MembersOfClub extends Person {

  private String membership;
  private int amtPaid;

  public MembersOfClub() {}

  public MembersOfClub(
    int id,
    String name,
    String mobile,
    String email,
    String membership,
    int amtPaid
  ) {
    super(id, name, mobile, email);
    this.membership = membership;
    this.amtPaid = amtPaid;
  }

  public String getMembership() {
    return membership;
  }

  public void setMembership(String membership) {
    this.membership = membership;
  }

  public int getAmtPaid() {
    return amtPaid;
  }

  public void setAmtPaid(int amtPaid) {
    this.amtPaid = amtPaid;
  }

  public String toString() {
    return (
      super.toString() +
      " MEMBERSHIP: " +
      membership +
      ", AMOUNT PAID: " +
      amtPaid
    );
  }
}
