CREATE TABLE "public"."users"( 
	"Id" int NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
	"Email" varchar(50) NOT NULL,
	"Password" varchar(25) NOT NULL);

CREATE TABLE "public"."admins"( 
	"Id" int NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
	"Username" varchar(25),
	"Password" varchar(25));

CREATE TABLE "public"."candidates"( 
	"UserId" int NOT NULL,
	"FirstName" varchar(25) NOT NULL,
	"LastName" varchar(25) NOT NULL,
	"NationalityId" varchar(11) NOT NULL,
	"BirthDate" date NOT NULL);

CREATE TABLE "public"."companies"( 
	"UserId" int NOT NULL,
	"CompanyName" varchar(255) NOT NULL,
	"WebAddress" varchar(50) NOT NULL,
	"PhoneNumber" varchar(12) NOT NULL,
	"IsActive" boolean NOT NULL);

CREATE TABLE "public"."company_activation_codes"( 
	"Id" int NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
	"CompanyId" int NOT NULL,
	"ActivationCode" varchar(38) NOT NULL,
	"IsConfirmed" boolean NOT NULL,
	"ConfirmationDate" date);

CREATE TABLE "public"."company_activation_employees"( 
	"Id" int NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
	"CompanyId" int NOT NULL,
	"ConfirmedEmployeeId" int,
	"ConfirmationDate" date);

CREATE TABLE "public"."employees"( 
	"UserId" int NOT NULL,
	"FirstName" varchar(25) NOT NULL,
	"LastName" varchar(25) NOT NULL);

CREATE TABLE "public"."job_titles"( 
	"Id" int NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
	"Title" varchar(50) NOT NULL);

	
ALTER TABLE "public"."admins" ADD CONSTRAINT "pk_Admin" PRIMARY KEY ("Id");
ALTER TABLE "public"."candidates" ADD CONSTRAINT "pk_Candidate" PRIMARY KEY ("UserId");
ALTER TABLE "public"."candidates" ADD CONSTRAINT "uc_NationalityId" UNIQUE ("NationalityId");
ALTER TABLE "public"."companies" ADD CONSTRAINT "pk_Company" PRIMARY KEY ("UserId");
ALTER TABLE "public"."company_activation_codes" ADD CONSTRAINT "pk_CompanyActivationCode" PRIMARY KEY ("Id");
ALTER TABLE "public"."company_activation_employees" ADD CONSTRAINT "pk_CompanyActivationEmployee" PRIMARY KEY ("Id");
ALTER TABLE "public"."employees" ADD CONSTRAINT "pk_Employee" PRIMARY KEY ("UserId");
ALTER TABLE "public"."job_titles" ADD CONSTRAINT "pk_JobTitle" PRIMARY KEY ("Id");
ALTER TABLE "public"."users" ADD CONSTRAINT "pk_User" PRIMARY KEY ("Id");
ALTER TABLE "public"."job_titles" ADD CONSTRAINT "uc_JobTitle" UNIQUE ("Title");
ALTER TABLE "public"."company_activation_codes" ADD CONSTRAINT "fk_CompanyActivationCode_Company" FOREIGN KEY ("CompanyId") REFERENCES "public"."companies" ( "UserId");
ALTER TABLE "public"."company_activation_employees" ADD CONSTRAINT "fk_CompanyActivationEmployee_Company" FOREIGN KEY ("CompanyId") REFERENCES "public"."companies" ( "UserId");
ALTER TABLE "public"."users" ADD CONSTRAINT "fk_User_Candidate" FOREIGN KEY ("Id") REFERENCES "public"."candidates" ( "UserId");
ALTER TABLE "public"."users" ADD CONSTRAINT "fk_User_Company" FOREIGN KEY ("Id") REFERENCES "public"."companies" ( "UserId");
ALTER TABLE "public"."users" ADD CONSTRAINT "fk_User_Employee" FOREIGN KEY ("Id") REFERENCES "public"."employees" ( "UserId");
ALTER TABLE "public"."companies" ALTER COLUMN "IsActive" SET DEFAULT false;