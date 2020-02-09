<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body style="background-color:brown">

<h3 style="color: blue;text-align: center;border: 10px;margin: 10px;background-color: cyan">USB FLASH-DRIVE DEPARTMENT OF AMAZON !!</h3>
<form action="save" method="POST">
<pre style="color: cyan"><b>
USB_FlashDrive ID :   <input type="text" name="fDriveId"/>
USB_FlashDrive CODE : <input type="text" name="fDriveCode"/>
USB_FlashDrive COST : <input type="text" name="fDriveCost"/>
USB_FlashDrive MODEL:
		 <input type="radio" name="fDriveModel" value="3.5">3.5
		 <input type="radio" name="fDriveModel" value="3.0"> 3.0
		 <input type="radio" name="fDriveModel" value="2.0"> 2.0
Description:
 	    	 <textarea name="fDriveDesc"></textarea>
 	    	  
BODY:
		 <select name="fDriveFormat">
		 <option>--select--</option>
		 <option>METALIC</option>
		 <option>PLASTIC</option>
		 </select>
CAPACITY:
		 <input type="checkbox" name="fDriveGrd" value="16GB"> 16 GB
		 <input type="checkbox" name="fDriveGrd" value="32GB"> 32 GB
		 <input type="checkbox" name="fDriveGrd" value="64GB"> 64 GB
		 <input type="checkbox" name="fDriveGrd" value="128GB"> 128 GB
BRANDS:
		 <select name="fDriveBrnd" multiple="multiple">
		 <option>HP</option>
		 <option>SONY</option>
		 <option>SANDISK</option>
		 <option>KINGSTON</option>
		  <option>TOSHIBA</option>
		 </select>

<input type="submit" value="Add FlashDrive to CART"/>
</b>
</pre>
</form>
</body>
</html>