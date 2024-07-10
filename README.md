ATM Interface Project
Overview
This repository contains the code for an ATM Interface project developed during my internship at [Company Name]. The project simulates basic ATM functionalities, including user authentication, balance inquiry, deposits, and withdrawals. The application is built using Java and follows object-oriented programming principles to ensure modularity and ease of maintenance.

Features
User Authentication: Secure login using a username and PIN.
Balance Inquiry: Display the current balance of the user.
Deposits: Allow users to deposit money into their account.
Withdrawals: Enable users to withdraw money, ensuring sufficient balance is available.
Transaction History: View a log of recent transactions.
Error Handling: Informative messages for incorrect PINs, insufficient funds, and other errors.
Technologies Used
Java: Core language used for development.
Swing: For building the graphical user interface.
File I/O: To handle user data and transaction history.
Installation and Setup
Clone the Repository:

bash
Copy code
git clone https://github.com/yourusername/atm-interface.git
cd atm-interface
Compile the Code:

bash
Copy code
javac -d bin src/*.java
Run the Application:

bash
Copy code
java -cp bin com.yourpackage.Main
Usage
Launch the Application:

Run the Main class to start the ATM interface.
Login:

Enter your username and PIN to access your account.
Perform Transactions:

Use the on-screen options to check your balance, make deposits, withdraw money, and view transaction history.
