#vnv – Verleihen, Dienstleistungen, verschenken
#Use-Case Specification: Edit Profile


## 1. Use-Case Name 
### 1.1 Brief Description
The use case allows the user to edit his Mail address or his user name. To operate this use case, the user first has to log in to vnv website. 
Afterwards he can edit his profile.

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
### 3.1 Email address
The user needs an email address to register for vnv.

## 4. Preconditions
### 4.1 vnv website 
The user has to be logged in the vnv website.

## 5. Postconditions
### 5.1 Update user
The system needs to save the updates of the user in the database. 
### 5.2 Display changes
After successful updating profile the user is able to see the changes on the profile page.

## 6. Extension Points
n/a

<!-- picture links -->
[UML]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/use%20cases/UML%20-%20edit%20profile.png "UML Diagram"
[Mock]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/mockups/EditProfile/Mockup_Profil_editieren.png "Mock-Up"
[feature]: https://raw.githubusercontent.com/WMerk/vnvDoc/master/doc/feature/register.PNG "Feature file"
