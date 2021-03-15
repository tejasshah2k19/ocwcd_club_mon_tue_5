package com.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.bean.UserBean;
import com.dao.UserDao;

public class SaveUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = "";
		File f = null;
		if (ServletFileUpload.isMultipartContent(request)) {
			try {
		
				
				List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
			
				
				// email , file
				File f1 = null;
				for (FileItem item : multiparts) {
					if (item.isFormField()) {
						
						
						
						if (item.getFieldName().equals("email")) {
							email = item.getString();
							System.out.println("email => " + item.getString());
						}
						f1 = new File(
								"D:\\Tejas Shah\\Dropbox\\Tejas Shah's Workplace\\work\\ocwcd_sat3_sun11\\WebContent\\images\\"
										+ item.getString());
						f1.mkdir();
					} else {
						

						f = new File(f1, "profile.jpg");

						item.write(f);
						
						FileInputStream fis = new FileInputStream(f);
					
						byte b [] = new byte[(int)f.length()];
						fis.read(b);

						
					}
				}

				request.setAttribute("msg", "FileUploaded....");
				UserDao dao = new UserDao();
				UserBean userBean = new UserBean();
				userBean.setEmail(email);
				userBean.setFirstName("abcd");
				userBean.setPassword("xyz");
				
				
				userBean.setProfilePic("images/" + email + "/profile.jpg");
				dao.insertUser(userBean);
				
				

			} catch (Exception e) {
				request.setAttribute("msg", "RunTimeError" + e.getMessage());
				e.printStackTrace();
			}
		} else {
			request.setAttribute("msg", "Invalid Request....");
		}

		request.getRequestDispatcher("FHome.jsp").forward(request, response);
	}

}
