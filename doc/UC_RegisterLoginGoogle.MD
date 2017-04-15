# vnv – Verleihen, Dienstleistungen, verschenken
# Use-Case Specification: Register/Login with Google


## 1. Use-Case Name 
### 1.1 Brief Description
The use case allows the user to register and login via Google. To operate this use case, the user first has to go to the vnv website. 
Then he can register or login by providing hiss google credentials.
If the registration is succesfull, he is able to use vnv.

## 2. Flow of Events
### 2.1 Basic Flow 
UML Diagram: 

![UML][]

### 2.2 Mock-Up
Mock-Up:

![Mock][]

## 3. Special Requirements
### 3.1 Google Account
The user needs an Google account to register or login with Google.

## 4. Preconditions
### 4.1 vnv website 
The user has to be on the vnv website.

## 5. Postconditions
### 5.1 Register
#### 5.1.1 Save user
The system needs to save the new user in the database.
#### 5.1.2 Send friend requests
The system sends friend requests to the user's Google contacts.
#### 5.1.3 Send welcome mail 
An email shall be send to the provided address.
#### 5.1.4 Redirect
After succesfull registration the user is automatically logged in and is redirected to the Main page of the application.
### 5.2 Login
#### 5.2.1 Save session
The system needs to save the sessionId in the database. 
#### 5.2.2 Redirect
After a succesfull login the user is redirected to the main page of the application.

## 6. Extension Points
n/a

<!-- picture links -->
[UML]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/use%20cases/UML%20register%20Google.png "UML Diagram"
[Mock]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/mockups/GoogleLoginRegister/Mockup_GoogleLoginRegister.png "Mock-Up"
