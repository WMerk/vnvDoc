#vnv – Verleihen, Dienstleistungen, verschenken
#Use-Case Specification: Login


## 1. Use-Case Name 
### 1.1 Brief Description
The use case allows the user to log into vnv. 
To operate this use case, the user has to be registered and go to the vnv website. 
Afterwards he can login by providing his mail address and password.
If the login is succesfull, he is able to use vnv.

## 2. Flow of Events
### 2.1 Basic Flow 
UML Diagram: 

![UML][]

### 2.2 Mock-Up
Mock-Up:

![Mock][]


## 3. Special Requirements
### 3.1 User has to be registered
The user has to be registered before he can login.

## 4. Preconditions
### 4.1 vnv website 
The user has to be on the vnv website.

## 5. Postconditions
### 5.1 Save session
The system needs to save the sessionId in the database. 
### 5.2 Redirect
After a succesfull login the user is redirected to the main page of the application.

## 6. Extension Points
n/a

<!-- picture links -->
[UML]: https://raw.githubusercontent.com/WMerk/vnvDoc/master/doc/use%20cases/UML%20-%20login.png "UML Diagram"
[Mock]: https://raw.githubusercontent.com/WMerk/VnVDoc/master/doc/mockups/Login/Mockup_Login.png "Mock-Up"