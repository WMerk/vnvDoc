#vnv – Verleihen, Dienstleistungen, verschenken
#Use-Case Specification: Register


## 1. Use-Case Name 
### 1.1 Brief Description
The use case allows the user to register for vnv. To operate this use case, the user first has to go to vnv website. 
Afterwards he can register by providing all relevant data.
If the registration is succesfull, he is able to use vnv.

## 2. Flow of Events
### 2.1 Basic Flow 
UML Diagram: 

![UML][]

### 2.2 Mock-Up
Mock-Up:

![Mock][]


## 3. Special Requirements
### 3.1 Both users are registered
The user needs an email address to register for vnv.

## 4. Preconditions
### 4.1 vnv website 
The user has to be on the vnv website.

## 5. Postconditions
### 5.1 Save user
The system needs to save the new user in the database. 
### 5.2 Send confirmation mail 
To confirm the user's mail address an email shall be send to the provided address. This is a seperate use case, which will be implemented later.

## 6. Extension Points
n/a

<!-- picture links -->
[UML]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/use%20cases/UML%20-%20register.png "UML Diagram"
[Mock]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/mockups/Register/Mockup_Register.png "Mock-Up"