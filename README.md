<H3>Customer Relationship Management (CRM) System </H3><br>
This is a Customer Relationship Management (CRM) system built using Spring Boot. It provides basic features to manage customers and users, including customer data CRUD (Create, Read, Update, Delete) operations and user registration with authentication.<br>

<H5>Features</H5><br>
<H6>Customer Management</H6><br>
Create Customer: Add a new customer with their details (first name, last name, email, phone number, and age).<br>
Update Customer: Modify an existing customer’s details (name, email, phone number).<br>
Delete Customer: Remove a customer by ID, first name, last name, email, or phone number.<br>
Get Customer: Fetch customer details by ID, first name, last name, email, phone number, or age.<br>
Search Customers: List all customers based on their first name, last name, age, email, or phone number.<br>
Bulk Create: Create multiple customers at once.<br>

<H6>User Authentication</H6><br>
User Registration: Register a new user with username and password.<br>
User Authentication: Login to the application with a registered username and password.<br>

<H6>Age-based Filtering</H6><br>
Get customers above or below a certain age threshold.<br>

<H6>Security</H6><br>
Spring Security with JWT (JSON Web Token) or basic authentication to secure the endpoints.<br>
BCryptPasswordEncoder for encrypting user passwords.<br>
