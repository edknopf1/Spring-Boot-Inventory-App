<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.


Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.

### **_**Commit 10/7/2025 8:40 AM: editied mainscreen.html, line 14 and lines 21-39, altered the title to "Diamond Car Dealer", added 2 lists detailing the parts we sell and the products we sell.**_**
 




D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

### **_Commit 10/8/2025 10:15 AM: edited mainscreen.html to include button to the "About Us" page. Created new class called "AboutController.java" and created new html called "about.html". Wrote a small paragraph on about page describing the company and coded AboutController.java properly so button on mainscreen.html would link to about.html. Also included a link back to mainscreen.html on the about.html page._**


E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

### **_Commit 10/8/2025 5:00 PM: edited BootStrapData.java to add 5 parts (lines 44-125) and 5 products(lines 132-146) to sample inventory. Used an if statement for each parts and products to not create duplicates._**

### **_Commit 10/15/2025 3:54 PM: Had to fix code from previous commit as inventory values were duplicating, cleaned up code as well to make it more organized_**

Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.




F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
• The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

### **_Commit 10/15/2025 4:50 PM: Added 2 HTML pages titled "Failure" and "Success" that displays message of success or failure of purchase. Coded lines 177-193 in the AddProductController.java page to add the "Buy Now" button and to check if inventory is 0 to return the "Failure" page, and if there is inventory, it decrements the inventory by 1 and returns the "Success" page._**




G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

### **_Commit 10/16/2025 7:15 AM: Coded variables minInv and maxInv in Part class (lines 31-34) and gave them respective getters and setters (lines 97-111). Added Min Inventory and Max Inventory columns on mainscreen.html (lines 58-59, lines 68-69. Modified sample inventory to include Min and Max inventory fields (lines 52-53, 61,62, 72-73, 82-83, 92-93). Renamed database in application.properties. Added Min Inventory and Max Inventory fields to InhousePartForm and OutsourcedPartForm (lines 25-38 for each page). Created InventoryValidator and ValidInventory to throw error message on HTML pages if user enters Inv value higher than maxInv or lower than minInv._**



H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

### **_Commit 10/16/2025 5:30 PM: Altered EnufPartsValidator.java to throw an error message if associated parts with product dipped below the minInv value (line 37), error messages for adding and updating parts if inventory is above maxInv or below minInv was done in Part G. Also added the footer in productForm.html to link back to main screen._**


I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

### **_Commit 10/17/2025 7:05 AM: Added 2 unit tests in PartTest.java. testMinInv (lines 160 - 167) and testMaxInv (lines 169-176). Ran both tests and each returned as successful._**


J.  Remove the class files for any unused validators in order to clean your code.