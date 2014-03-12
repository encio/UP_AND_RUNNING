
<%@ page import= "java.sql.*"%>
<%@ page import= "java.io.*"%>
<%@ page import= "com.mysql.*"%>

<tours>
	<%
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs= null;
	
	try{
	conn = DriverManager.getConnection("jdbc:mysql://localhost/explorecalifornia",
										"dbuser", "dbpass");
	stmt = conn.createStatement();
	
	rs = stmt.executeQuery("Select * from tours");
			
		while(rs.next()){
		%>
			<tour>
				<tourId> <% out.print(rs.getInt("tourId")); %></tourId>
				<packageId><% out.print(rs.getInt("packageId"));%></packageId>
				<blurb><% out.print(rs.getString("blurb"));%></blurb>
				<description><% out.print(rs.getString("description"));%></description>
				<price><% out.print(rs.getDouble("price"));%></price>
				<difficulty><% out.print(rs.getString("difficulty"));%></difficulty>
				<graphic><% out.print(rs.getString("graphic"));%></graphic>
				<length><% out.print(rs.getInt("length"));%></length>
				<region><% out.print(rs.getString("region"));%></region>
				<keywords><% out.print(rs.getString("keywords"));%></keywords>
			</tour>
		<%
	
		}
	}catch(SQLException e){
		out.print(e.getMessage());
		
	}finally{
		
		if(conn!= null){
			conn.close();
		}
		if(stmt!= null){
			stmt.close();
		}
		if(rs!= null){
			rs.close();
		}
	}
		
	%>
	
</tours>