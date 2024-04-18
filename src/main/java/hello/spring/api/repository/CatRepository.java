package hello.spring.api.repository;

public class CatRepository {
  
  //write me an SQL to update cat name by id  
  public void updateNameById(String name, long id) {


    
    
    //write your code here

    //write me an sql for updating the name of the cat by id  
    String sql = "UPDATE cat SET name = ? WHERE id = ?";
    try (Connection conn = DriverManager.getConnection("jdbc:sqlite:cats.db");
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, name);
        pstmt.setLong(2, id);
        pstmt.executeUpdate();
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }


  
  }

}
