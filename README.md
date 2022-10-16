# Reliable-storage-CloudProject

## Introduction
### Objective of Web Application.
Reliable Store is a web application hosted on the Amazon Web Server Cloud. This 3 tier web application enables users or admin to store or manage files securely inside the cloud. It has a single admin role with access to all of the user's data. An authorized user has the ability to download, update, upload and delete files. Admin can check the list of files uploaded by different users and delete them from the system if any file is no longer required without any permission. The Application will use all of the resources provided by the AWS, the user can log into the system at any time and manage his files. Because the application primarily makes use of cloud resources, no physical resources are required to handle the files.

## Feature list
1. Login Page
2. Sign in with Amazon Cognito
3. Upload files
4. Delete files
5. Download files
6. Update/Edit the files
7. List all the files
8. Admin Role
9. Admin can see all users upload file list.

![image](https://user-images.githubusercontent.com/40047632/196057713-6e135481-8c6c-4326-af1c-ac5d0ce2eb47.png)

## Software’s to download locally:
1. Java JDK 1.8.0
2. Intellij
3. MySQL workbench
4. Web Browser



## Local configuration
1. Clone the project from GitHub and change the following things
   1. AWS IAM Secret key and Access key
   2. Bucket name and endpoint
   3. AWS Cognito Client Secret and Client ID
2. Connect to Aurora Mysql workbench with AWS RDS Instance. Go to database in MySQL and  open connect to database enter endpoint path, port, username and password   given on AWS RDS instance you created.
3. Create a web application in Intellij IDE and compile It on localhost.
