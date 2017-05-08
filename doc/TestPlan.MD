# vnv – Verleihen, Dienstleistungen, verschenken
# Test plan

## 1.	Introduction
### 1.1	Purpose
The purpose of the Iteration Test Plan is to gather all of the information necessary to plan and control the test effort for a given iteration. 
It describes the approach to testing the software.
This Test Plan for vnv supports the following objectives:
-	Identifies the items that should be targeted by the tests.
-	Identifies the motivation for and ideas behind the test areas to be covered.
-	Outlines the testing approach that will be used.
-	Identifies the required resources and provides an estimate of the test efforts.

### 1.2	Scope
This document describes the used tests, as they are unittests and functionality testing.

### 1.3	Intended Audience
This document is meant for internal use primarily.

### 1.4	Document Terminology and Acronyms
- **SRS**	Software Requirements Specification
- **vnv**	verleihen, Dienstleistungen, verschenken
- **n/a**	not applicable
- **tbd**	to be determined
- **AAI**	Authentication and Authorization Infrastructure

### 1.5	 References
- [GitHub](https://github.com/WMerk/VnVProject)
- [Blog](https://vnvproject.wordpress.com/)
- [Overall Use case diagram](https://github.com/WMerk/VnVProject/blob/master/doc/use%20cases/SRS.png)
- [Software Requirements Specification](SRS.MD)
- [Software Architecture Document](SAD.MD)
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

## 2.	Evaluation Mission and Test Motivation
### 2.1	Background
[Provide a brief description of the background surrounding why the test effort defined by this Test Plan will be undertaken. Include information such as the key problem being solved, the major benefits of the solution, the planned architecture of the solution, and a brief history of the project. Where this information is defined in other documents, you can include references to those other more detailed documents if appropriate. This section should only be about three to five paragraphs in length.]
### 2.2	Evaluation Mission
Our motivation in implementing tests came at an early stage to recognize the need for errors and to ensure the functionality and thus the outstanding quality of the software.
### 2.3	Test Motivators
Our testing is motivated by 
- quality risks 
- technical risks, 
- use cases 
- functional requirements

## 3.	Target Test Items
The listing below identifies those test items (software, hardware, and supporting product elements) that have been identified as targets for testing. This list represents what items will be tested. 

Items for Testing:
- java backend
- web frontend
- database operations

## 4.	Outline of Planned Tests
### 4.1	Outline of Test Inclusions
Unit testing the Java backend, functional testing of the Web frondend and Database Integrity Testing
### 4.2	Outline of Other Candidates for Potential Inclusion
Stress testing the application, unit testing the frontend or profile testing the java backend might be potential test cases but these are not in scope of our testing process yet.

## 5.	Test Approach
### 5.1	Testing Techniques and Types
#### 5.1.1	Function and Database Integrity Testing
|| |
|---|---|
|Technique Objective  	| Exercise target-of-test functionality, including navigation, data entry, processing, and retrieval to observe and log target behavior. |
|Technique 		|  Execute each use-case scenario’s individual use-case flows or functions and features, using valid and invalid data, to verify that: the expected results occur when valid data is used; the appropriate error or warning messages are displayed when invalid data is used; each business rule is properly applied. Selenium can simulate all user interactions like clicks, swipes and more. |
|Oracles 		|  user enter valid data, for example a valid username and a valid password   |
|Required Tools 	| Selenium + Cucumber	 |
|Success Criteria	|    successful senarios         |
|Special Considerations	|     -          |

#### 5.1.2	Unit Testing
|| |
|---|---|
|Technique Objective  	| Exercise functionality of model functions. Test for right data entry and right data output. |
|Technique 		|  Execute JUnit Test functions in UserTest.java |
|Oracles 		|  Each test expect the right value given in the assertequals function |
|Required Tools 	|  JUnit Test |
|Success Criteria	|    Testcoverage > 50%      |
|Special Considerations	|     -          |

#### 5.1.3	Business Cycle Testing
n/a

#### 5.1.4	User Interface Testing
n/a

#### 5.1.5	Performance Profiling 
n/a

#### 5.1.6	Load Testing
n/a

#### 5.1.7	Stress Testing
n/a
 
#### 5.1.8	Volume Testing
n/a

#### 5.1.9	Security and Access Control Testing
Unittests also cover access control. A given use case might only be performed by a given logged in user.

#### 5.1.10	Failover and Recovery Testing
n/a

#### 5.1.11	Configuration Testing
n/a

#### 5.1.12	Installation Testing
n/a

## 6.	Entry and Exit Criteria
### 6.1	Test Plan
#### 6.1.1	Test Plan Entry Criteria
Building a new version of the software will execute the testprocess.
#### 6.1.2	Test Plan Exit Criteria
When all tests pass without throwing an exception .

## 7.	Deliverables
### 7.1	Test Evaluation Summaries
n/a
### 7.2	Reporting on Test Coverage
n/a
### 7.3	Perceived Quality Reports
n/a
### 7.4	Incident Logs and Change Requests
n/a
### 7.5	Smoke Test Suite and Supporting Test Scripts
n/a
### 7.6	Additional Work Products
n/a
#### 7.6.1	Detailed Test Results
When executing functiontests cucumber will atomaticly generate a HTML test report
#### 7.6.2	Additional Automated Functional Test Scripts
n/a
#### 7.6.3	Test Guidelines
n/a
#### 7.6.4	Traceability Matrices
n/a
## 8.	Testing Workflow
At the moment tests are automatically run before deployment on the server. The application is build using maven. Building the application with maven install will run all feature tests and unittest and only build if the tests complete.

For the future this might be included in a continuous deployment circle.

## 9.	Environmental Needs
[This section presents the non-human resources required for the Test Plan.]
### 9.1	Base System Hardware
The following table sets forth the system resources for the test effort presented in this Test Plan.

| Resource | Quantity | Name and Type |
|---|---|---|
| Integration Server | 1 | Ubuntu Server |
| Server Name |  	| <Name> |
| Development Server	| 1 | <Server>	|
| Server Name |  | <Name> |
| Database | 2 | <Name>	|
| Docker buils Server | 1 | Ubuntu Server |
| Server Name |  	| <Name> |

### 9.2	Base Software Elements in the Test Environment
The following base software elements are required in the test environment for this Test Plan.

| Software Element Name | Version | Type and Other Notes |
|---|---|---|
| Windows | 10 | Operating System |
| Chrome |  58	| Internet Browser |
| Chromedriver |  11 | Application |

### 9.3	Productivity and Support Tools
The following tools will be employed to support the test process for this Test Plan.

| Tool Category or Type | Tool Brand Name | Vendor or In-house | Version |
|---|---|---|---|
| Test Management | Intellij | JetBrains | 17.2 |
| Project Management | YouTrack | JetBrains |  |
| DBMS tools |	 | 	 | 	 |
| Image builder | Docker | Docker | 	 |
| Image hoster | Docker Hub | Docker | 	 |

## 10.	Responsibilities, Staffing, and Training Needs
### 10.1	People and Roles
This table shows the staffing assumptions for the test effort.

Human Resources


| Role | Minimum Resources Recommended (number of full-time roles allocated) |	Specific Responsibilities or Comments |
|---|---|---|
| Test Manager | 1 | Provides management oversight. <br> Responsibilities include: <br> planning and logistics <br> agree mission <br> identify motivators<br> acquire appropriate resources<br> present management reporting<br> advocate the interests of test<br>evaluate effectiveness of test effort |
| Test Designer | 1 | Defines the technical approach to the implementation of the test effort. <br> Responsibilities include:<br> define test approach<br> define test automation architecture<br> verify test techniques<br> define testability elements<br> structure test implementation|
| Tester | 1 |	Implements and executes the tests.<br> Responsibilities include:<br> implement tests and test suites<br> execute test suites<br> log results<br> analyze and recover from test failures<br> document incidents|
| Test System Administrator | 1 | Ensures test environment and assets are managed and maintained.<br> Responsibilities include:<br> 	administer test management system<br> install and support access to, and recovery of, test environment configurations and test labs | 
| Database Administrator, Database Manager | 1 | Ensures test data (database) environment and assets are managed and maintained.<br> Responsibilities include:<br> support the administration of test data and test beds (database). |
| Implementer | 3| Implements and unit tests the test classes and test packages.<br> Responsibilities include:<br> creates the test components required to support testability requirements as defined by the designer |

### 10.2	Staffing and Training Needs
n/a
## 11.	Iteration Milestones

| Milestone | Planned Start Date | Actual Start Date | Planned End Date | Actual End Date |
|---|---|---|---|---|
| Have Unit Tests | 06.05.2017 | 06.05.2017 | 12.06.2017 | |
| Have Integration Tests | 06.05.2017 | 06.05.2017 | 12.06.2017 | |
| > 70% Test Coverage | 06.05.2017 | 06.05.2017 | 12.06.2017 | |
| Tests integrated in CI | 06.05.2017 | 06.05.2017 | 12.06.2017 | |
| Iteration ends |  | |  | |
		

## 12.	Risks, Dependencies, Assumptions, and Constraints
[List any risks that may affect the successful execution of this Test Plan, and identify mitigation and contingency strategies for each risk. Also indicate a relative ranking for both the likelihood of occurrence and the impact if the risk is realized.] 
Risk	Mitigation Strategy	Contingency (Risk is realized)
Prerequisite entry criteria is not met.	<Tester> will define the prerequisites that must be met before Load Testing can start.

<Customer> will endeavor to meet prerequisites indicated by <Tester>.	•	Meet outstanding prerequisites
•	Consider Load Test Failure
Test data proves to be inadequate.	<Customer> will ensure a full set of suitable and protected test data is available.

<Tester> will indicate what is required and will verify the suitability of test data.	•	Redefine test data
•	Review Test Plan and modify
•	components (that is, scripts)
•	Consider Load Test Failure
Database requires refresh.	<System Admin> will endeavor to ensure the Database is regularly refreshed as required by <Tester>.	•	Restore data and restart
•	Clear Database

[List any dependencies identified during the development of this Test Plan that may affect its successful execution if those dependencies are not honored. Typically these dependencies relate to activities on the critical path that are prerequisites or post-requisites to one or more preceding (or subsequent) activities You should consider responsibilities you are relying on other teams or staff members external to the test effort completing, timing and dependencies of other planned tasks, the reliance on certain work products being produced.] 
Dependency between	Potential Impact of Dependency	Owners
		
		
		

[List any assumptions made during the development of this Test Plan that may affect its successful execution if those assumptions are proven incorrect. Assumptions might relate to work you assume other teams are doing, expectations that certain aspects of the product or environment are stable, and so forth]. 
Assumption to be proven	Impact of Assumption being incorrect	Owners
		
		
		

[List any constraints placed on the test effort that have had a negative effect on the way in which this Test Plan has been approached.]
Constraint on	Impact Constraint has on test effort	Owners
		
		
		

## 13.	Management Process and Procedures
[Outline what processes and procedures are to be used when issues arise with the Test Plan and its enactment.]
### 13.1	Measuring and Assessing the Extent of Testing
[Outline the measurement and assessment process to be used to track the extent of testing.]
### 13.2	Assessing the Deliverables of this Test Plan
[Outline the assessment process for reviewing and accepting the deliverables of this Test Plan]

### 13.3	Problem Reporting, Escalation, and Issue Resolution
[Define how process problems will be reported and escalated, and the process to be followed to achieve resolution.]
### 13.4	Managing Test Cycles
[Outline the management control process for a test cycle.]
### 13.5	Traceability Strategies
[Consider appropriate traceability strategies for:
•	Coverage of Testing against Specifications — enables measurement the extent of testing
•	Motivations for Testing — enables assessment of relevance of tests to help determine whether to maintain or retire tests
•	Software Design Elements — enables tracking of subsequent design changes that would necessitate rerunning tests or retiring them
•	Resulting Change Requests — enables the tests that discovered the need for the change to be identified and re-run to verify the change request has been completed successfully]
### 13.6	Approval and Signoff
[Outline the approval process and list the job titles (and names of current incumbents) that initially must approve the plan, and sign off on the plans satisfactory execution.]
