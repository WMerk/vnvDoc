![vnv][]
# Use-Case Specification: Delete account


## 1. Use-Case Name 
### 1.1 Brief Description
The use case allows the user to delete his account. To operate this use case, the user first has to be logged in. 
Afterwards he can navigate to 'Profil' than to 'Einstellungen' and 'Account löschen'. Here he can click a button to delete his account from the database.

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
n/a

## 4. Preconditions
### 4.1 Successful login 
The user has to be logged in to be able to delete his account.

## 5. Postconditions
### 5.1 Save request
The system deletes the user from the database. 
### 5.2 Notificate user 
A message will be shown to the user, that his account is removed from vnv. 

## 6. Extension Points
n/a

<!-- picture links -->
[UML]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/use%20cases/UML%20-%20delete%20account.png "UML Diagram"
[Mock]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/mockups/DeleteAccount/Mockup_Account_loeschen.png "Mock-Up"
[feature]: https://raw.githubusercontent.com/WMerk/vnvDoc/master/doc/feature/deleteUser.PNG "Feature file"
[vnv]: https://raw.githubusercontent.com/WMerk/vnvDoc/master/logo/logo_wide_big.png "vnv logo"