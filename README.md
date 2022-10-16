# Reliable-storage-CloudProject

## Introduction
### Objective of Web Application.
Reliable Store is a web application hosted on the Amazon Web Server Cloud. This 3 tier web application enables users or admin to store or manage files securely inside the cloud. It has a single admin role with access to all of the user's data. An authorized user has the ability to download, update, upload and delete files. Admin can check the list of files uploaded by different users and delete them from the system if any file is no longer required without any permission. The Application will use all of the resources provided by the AWS, the user can log into the system at any time and manage his files. Because the application primarily makes use of cloud resources, no physical resources are required to handle the files.

## Feature list
•	Login Page
•	Sign in with Amazon Cognito
•	Upload files
•	Delete files
•	Download files
•	Update/Edit the files
•	List all the files
•	Admin Role
•	Admin can see all users upload file list.

![image](https://user-images.githubusercontent.com/40047632/196057713-6e135481-8c6c-4326-af1c-ac5d0ce2eb47.png)

## Software’s to download locally:
•	Java JDK 1.8.0
•	Intellij
•	MySQL workbench
•	Web Browser



## Local configuration
•	Clone the project from GitHub and change the following things
1.	AWS IAM Secret key and Access key
2.	Bucket name and endpoint
3.	AWS Cognito Client Secret and Client ID
•	Connect to Aurora Mysql workbench with AWS RDS Instance. Go to database in MySQL and  open connect to database enter endpoint path, port, username and password given on AWS RDS instance you created.
•	Create a web application in Intellij IDE and compile It on localhost.
