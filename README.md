# java-desktop-current-account
- This project enables a company with different product stocks in different categories to easily sell to its customers. It does not include only the payment part, so the current account of the customer is not kept, and the information of which customer buys products from which category and when can be easily accessed.

- Users defined in the login form log in with their passwords. User passwords are encrypted with the MD5 algorithm. A form has been designed for the user who forgot his password. When the forgot password button is pressed, the e-mail address is checked and a new form is opened if it is correct. At the same time, the verification code is sent to the user's e-mail address. When the code is submitted and the code is saved in the database. In this way, the necessary comparison is made.

- The main form opens for the user who logs in with the correct e-mail address and password.

- On the category page, the user can perform rough operations related to the category.

- In the same way, on the product page, the user can perform the necessary crud functions related to the product.Data type validation has been done in data entries( such as whether the entered stockquantitity is a number).Additionally, the deletion of the product assigned a sale(not basket) is not allowed.

- On the sales management page, the user is allowed to select the customer first. As soon as the customer is selected, the category checkbox becomes active. When the category is selected, products belonging to that category are selected from the product table. The number of spinner components to be sold from the selected product is modeled according to the stock amount of the selected product. The number is selected and then added to the cart. If requested, the sale is confirmed.

- On the report page, the sales data of the desired date can be accessed according to the desired parameter. The model of the table is linked to the corresponding search text box. Therefore, when the parameter and date are changed, it is necessary to make a keyboard movement in the textbox.

- On the user settings page, User can change existing password.

### Languages, Technologies and Environments Used in this Project

| Java/JFrame  | OOP | SQLite | IntelliJ  |
| :------------: | :------------: | :------------: | :------------: |
|<img src="https://iskulubu.com/wp-content/uploads/2021/06/java.png" width="100">|<img src="https://ccweb.imgix.net/https%3A%2F%2Fd3f1iyfxxz8i1e.cloudfront.net%2Fcourses%2Fcourse_image%2F033d2bd4b880.jpg?ar=16%3A9&auto=format&cs=strip&fit=crop&h=380&ixlib=php-3.3.1&w=535&s=396bdea2da23cd72b8c6adf71525ab23" width="100">|<img src="https://csharpcorner-mindcrackerinc.netdna-ssl.com/UploadFile/55275a/windows-phone-8-1-sqlite-how-to-store-data-in-database/Images/SQLite.jpg" width="100">|<img src="https://www.yazilimevi.com/images/virtuemart/product/JetBrains-IntelliJ-IDEA-Ultimate-2018-indir.png" width="100">|

### Project Overview

| Login |
| ------------ |
|<img src="https://github.com/maruf04/java-desktop-current-account/blob/main/img/login.png" >|

| Change Password |
| ------------ |
|<img src="https://github.com/maruf04/java-desktop-current-account/blob/main/img/cp.png" >|

| Customer |
| ------------ |
|<img src="https://github.com/maruf04/java-desktop-current-account/blob/main/img/customer.png" >|

- With the Customer page, customers can add, delete, update and search the customer table.

| Salles Management |
| ------------ |
|<img src="https://github.com/maruf04/java-desktop-current-account/blob/main/img/salesM.png" >|

| Basket |
| ------------ |
|<img src="https://github.com/maruf04/java-desktop-current-account/blob/main/img/basket.png" >|

| Report |
| ------------ |
|<img src="https://github.com/maruf04/java-desktop-current-account/blob/main/img/report.png" >|

| Product |
| ------------ |
|<img src="https://github.com/maruf04/java-desktop-current-account/blob/main/img/products.png" >|

- With the Product page, customers can add, delete, update and search the customer table.


| User Settings |
| ------------ |
|<img src="https://github.com/maruf04/java-desktop-current-account/blob/main/img/userSt.png" >|

| Category |
| ------------ |
|<img src="https://github.com/maruf04/java-desktop-current-account/blob/main/img/categori.png" >|

- With the Category page, customers can add, delete, update and search the customer table.


#### Database Model
| Database Model |
| ------------ |
|<img src="https://github.com/maruf04/java-desktop-current-account/blob/main/img/sqluml.png" width="750">|
                
+ models
    + IUser
    + UserImpl
    + ICustomer
    + CustomerImpl
    + IBasket
    + BasketImpl
    + IOrder
    + OrderImpl
    + IProduct
    + ProductImpl
    + IProductCategory
    + ProductCategoryImpl
    + IReport
    + ReportImpl
+ props
    + Basket
    + ComboItem
    + Customer
    + Order
    + Product
    + ProductCategory
    + Report
    + User
+ utils
    * DB
    * Generator
    * Mail
    * Util
+ views
    * UserPanel
    * NewUser
    * UserChangePassword
    * UserForgetPassword
    * BasketScreen
    * MainApp
                    



### Demo Account
                    
 🔐 Email  | 🗝️Password
------------- | -------------
javaproject96@gmail.com  | JavaProject123



### Software Developers

<a href="https://github.com/aliigan" > Ali İĞAN</a>
|<a href="https://github.com/maruf04" > Maruf Akan</a>
|<a href="https://github.com/UlasGultekin" > Ulaş Güntekin</a>
|<a href="https://github.com/omerkircal" > Ömer Kırçal</a>


