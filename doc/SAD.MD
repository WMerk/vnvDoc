![vnv][]
# Software Architecture Document


## 1. Introduction 
### 1.1 Purpose
This document provides a comprehensive architectural overview of the system, 
using a number of different architectural views to depict different aspects of the system. 
It is intended to capture and convey the significant architectural decisions which have been made on the system.

### 1.2 Scope
The scope of this SAD is to show the architecture of the vnv project. Affected are the class structure, the use cases and the data representation.

### 1.3 References
- [GitHub](https://github.com/WMerk/VnVProject)
- [Blog](https://vnvproject.wordpress.com/)
- [Overall Use case diagram](https://github.com/WMerk/VnVProject/blob/master/doc/use%20cases/SRS.png)
- [Software Requirements Specification](SRS.MD)
- [Test Plan](TestPlan.MD)
- [Function points](https://github.com/WMerk/vnvDoc/blob/master/doc/FP.pdf)
- [UC Delete friend](UC_DeleteFriend.MD)
- [UC Accept friend requests](UC_AcceptFriendRequest.MD)
- [UC List received friend requests](UC_ListReceivedFriendRequests.MD)
- [UC List sent friend requests](UC_ListSentFriendRequests.MD)
- [UC Add friend](UC_AddFriend.MD)
- [UC ChangePassword](UC_ChangePassword.MD)
- [UC Create new request](UC_CreateNewRequest.MD)
- [UC Create new offer](UC_CreateNewOffer.MD)
- [UC List requests](UC_ListRequests.MD)
- [UC List offers](UC_ListOffers.MD)
- [UC Search for offers or requests](UC_SearchOffersRequests.MD)
- [UC Edit status of offer / request](UC_EditStatus.MD)
- [UC DeleteAccount](UC_DeleteAccount.MD)
- [UC EditProfile](UC_EditProfile.MD)
- [UC Login](UC_Login.MD)
- [UC Register](UC_Register.MD)
- [UC Register/Login with Google](UC_RegisterLoginGoogle.MD)

## 2. Architectural Representation
vnv uses the MVVM-Pattern for its architecture design.

MVVM Diagram: 

![MVVM][]

## 3.Architectural Goals and Constraints 
We decided to use Spring for the back-end and AngularJs for the front-end of the web-project. 
Both components are coupled by the Rest-API. 

## 4. Use-Case View 
n/a

## 5. Logical View

![Overview][]


## 6. Process View
n/a

## 7. Deployment View

![Architecture][]

## 8. Implementation View
n/a

## 9. Data View
We're using two NoSQL databases to store our data. 
For friend-relations and friendrequests between users we use a graph database (Neo4j).
For all other data (e.g. Users, Posts, etc.) we use Redis. 
We simply store objects of the Entity class using [JOHM](https://github.com/agrison/johm).
Therefore we don't have a database schema, but a quick look on our Entities should be enough.
You can find our Entities [here](https://github.com/WMerk/vnv/tree/master/src/main/java/com/vnv/Entity).

## 10. Size and Performance
tbd

## 11. Quality
To ensure a high quality code we write and run tests.More detailed information on our testing can be find our [Test Plan](TestPlan.MD). However, the tests are automatically executed before a new version is deployed to the server. Our code is also aautomatically nalyzed and we can see from the metrics on [Sonarqube](https://sonarcloud.io/dashboard?id=de.dhbw.ka.vnv%3Avnvproject) how well our code is written and were we might want to improve the code quality. 

<!-- picture links -->
[MVVM]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/SAD/mvvm.png "MVVM Diagram"
[Architecture]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/SAD/ArchitectureDiagramm.png "Architecture"
[Overview]:  https://raw.githubusercontent.com/WMerk/vnvDoc/master/doc/UML/current_marked.png "Class Overview"
[vnv]: https://raw.githubusercontent.com/WMerk/vnvDoc/master/logo/logo_wide_big.png "vnv logo"
