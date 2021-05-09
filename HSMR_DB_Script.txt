CREATE TABLE "public"."Users"( 
	"Id" int NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
	"Email" varchar(50) NOT NULL,
	"Password" varchar(25) NOT NULL);

CREATE TABLE "public"."Admins"( 
	"Id" int NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
	"Username" varchar(25),
	"Password" varchar(25));

CREATE TABLE "public"."Candidates"( 
	"UserId" int NOT NULL,
	"FirstName" varchar(25) NOT NULL,
	"LastName" varchar(25) NOT NULL,
	"NationalityId" varchar(11) NOT NULL,
	"BirthDate" date NOT NULL);

CREATE TABLE "public"."Companies"( 
	"UserId" int NOT NULL,
	"CompanyName" varchar(255) NOT NULL,
	"WebAddress" varchar(50) NOT NULL,
	"PhoneNumber" varchar(12) NOT NULL,
	"IsActive" boolean NOT NULL);

CREATE TABLE "public"."CompanyActivationCodes"( 
	"Id" int NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
	"CompanyId" int NOT NULL,
	"ActivationCode" varchar(38) NOT NULL,
	"IsConfirmed" boolean NOT NULL,
	"ConfirmationDate" date);

CREATE TABLE "public"."CompanyActivationEmployees"( 
	"Id" int NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
	"CompanyId" int NOT NULL,
	"ConfirmedEmployeeId" int,
	"ConfirmationDate" date);

CREATE TABLE "public"."Employees"( 
	"UserId" int NOT NULL,
	"FirstName" varchar(25) NOT NULL,
	"LastName" varchar(25) NOT NULL);

CREATE TABLE "public"."JobTitles"( 
	"Id" int NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
	"Title" varchar(50) NOT NULL);

	
ALTER TABLE "public"."Admins" ADD CONSTRAINT "pk_Admin" PRIMARY KEY ("Id");
ALTER TABLE "public"."Candidates" ADD CONSTRAINT "pk_Candidate" PRIMARY KEY ("UserId");
ALTER TABLE "public"."Candidates" ADD CONSTRAINT "uc_NationalityId" UNIQUE ("NationalityId");
ALTER TABLE "public"."Companies" ADD CONSTRAINT "pk_Company" PRIMARY KEY ("UserId");
ALTER TABLE "public"."CompanyActivationCodes" ADD CONSTRAINT "pk_CompanyActivationCode" PRIMARY KEY ("Id");
ALTER TABLE "public"."CompanyActivationEmployees" ADD CONSTRAINT "pk_CompanyActivationEmployee" PRIMARY KEY ("Id");
ALTER TABLE "public"."Employees" ADD CONSTRAINT "pk_Employee" PRIMARY KEY ("UserId");
ALTER TABLE "public"."JobTitles" ADD CONSTRAINT "pk_JobTitle" PRIMARY KEY ("Id");
ALTER TABLE "public"."Users" ADD CONSTRAINT "pk_User" PRIMARY KEY ("Id");
ALTER TABLE "public"."JobTitles" ADD CONSTRAINT "uc_JobTitle" UNIQUE ("Title");
ALTER TABLE "public"."CompanyActivationCodes" ADD CONSTRAINT "fk_CompanyActivationCode_Company" FOREIGN KEY ("CompanyId") REFERENCES "public"."Companies" ( "UserId");
ALTER TABLE "public"."CompanyActivationEmployees" ADD CONSTRAINT "fk_CompanyActivationEmployee_Company" FOREIGN KEY ("CompanyId") REFERENCES "public"."Companies" ( "UserId");
ALTER TABLE "public"."Users" ADD CONSTRAINT "fk_User_Candidate" FOREIGN KEY ("Id") REFERENCES "public"."Candidates" ( "UserId");
ALTER TABLE "public"."Users" ADD CONSTRAINT "fk_User_Company" FOREIGN KEY ("Id") REFERENCES "public"."Companies" ( "UserId");
ALTER TABLE "public"."Users" ADD CONSTRAINT "fk_User_Employee" FOREIGN KEY ("Id") REFERENCES "public"."Employees" ( "UserId");
ALTER TABLE "public"."Companies" ALTER COLUMN "IsActive" SET DEFAULT false;