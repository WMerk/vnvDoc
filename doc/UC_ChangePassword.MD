#vnv – Verleihen, Dienstleistungen, verschenken
#Use-Case Specification: Change Password


## 1. Use-Case Name 
### 1.1 Brief Description
The use case allows the user to change his password. To operate this use case, the user first has to log in to vnv website. 

## 2. Flow of Events
### 2.1 Basic Flow 
UML Diagram: 

![UML][]

### 2.2 Mock-Up
Mock-Up:

![Mock][]

### 2.3 .feature file

![feature][]

## 3. Special Requirements
### 3.1 Account in vnv
The user needs to be registered in vnv.

## 4. Preconditions
### 4.1 vnv website 
The user has to be logged in the vnv website.

## 5. Postconditions
### 5.1 Update password
The system needs to save the change of the password in the database. 
### 5.2 Display success
After successful changing password the user gets a notification.

## 6. Extension Points
n/a

<!-- picture links -->
[UML]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/use%20cases/UML%20-%20change%20password.png "UML Diagram"
[Mock]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/mockups/EditProfile/Mockup_Passwort_aendern.png "Mock-Up"
[feature]: https://raw.githubusercontent.com/WMerk/vnvDoc/master/doc/feature/register.PNG "Feature file"
