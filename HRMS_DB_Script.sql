CREATE TABLE "public"."users"( 
	"id" int NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
	"email" varchar(50) NOT NULL,
	"password" varchar(25) NOT NULL);

CREATE TABLE "public"."admins"( 
	"id" int NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
	"username" varchar(25),
	"password" varchar(25));

CREATE TABLE "public"."candidates"( 
	"user_id" int NOT NULL,
	"first_name" varchar(25) NOT NULL,
	"last_name" varchar(25) NOT NULL,
	"nationality_id" varchar(11) NOT NULL,
	"birth_date" date NOT NULL);

CREATE TABLE "public"."companies"( 
	"user_id" int NOT NULL,
	"company_name" varchar(255) NOT NULL,
	"web_address" varchar(50) NOT NULL,
	"phone_number" varchar(12) NOT NULL,
	"is_active" boolean NOT NULL);

CREATE TABLE "public"."company_activation_codes"( 
	"id" int NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
	"company_id" int NOT NULL,
	"activation_code" varchar(38) NOT NULL,
	"is_confirmed" boolean NOT NULL,
	"confirmation_date" date);

CREATE TABLE "public"."company_activation_employees"( 
	"id" int NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
	"company_id" int NOT NULL,
	"confirmed_employee_id" int,
	"confirmation_date" date);

CREATE TABLE "public"."employees"( 
	"user_id" int NOT NULL,
	"first_name" varchar(25) NOT NULL,
	"last_name" varchar(25) NOT NULL);

CREATE TABLE "public"."job_titles"( 
	"id" int NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
	"job_title" varchar(50) NOT NULL);

	
ALTER TABLE "public"."admins" ADD CONSTRAINT "pk_admin" PRIMARY KEY ("id");
ALTER TABLE "public"."candidates" ADD CONSTRAINT "pk_candidate" PRIMARY KEY ("user_id");
ALTER TABLE "public"."candidates" ADD CONSTRAINT "uc_nationality_id" UNIQUE ("nationality_id");
ALTER TABLE "public"."companies" ADD CONSTRAINT "pk_Company" PRIMARY KEY ("user_id");
ALTER TABLE "public"."company_activation_codes" ADD CONSTRAINT "pk_company_activation_code" PRIMARY KEY ("id");
ALTER TABLE "public"."company_activation_employees" ADD CONSTRAINT "pk_company_activation_employee" PRIMARY KEY ("id");
ALTER TABLE "public"."employees" ADD CONSTRAINT "pk_employee" PRIMARY KEY ("user_id");
ALTER TABLE "public"."job_titles" ADD CONSTRAINT "pk_job_title" PRIMARY KEY ("id");
ALTER TABLE "public"."users" ADD CONSTRAINT "pk_user" PRIMARY KEY ("id");
ALTER TABLE "public"."job_titles" ADD CONSTRAINT "uc_job_title" UNIQUE ("job_title");
ALTER TABLE "public"."company_activation_codes" ADD CONSTRAINT "fk_company_activation_code_company" FOREIGN KEY ("company_id") REFERENCES "public"."companies" ( "user_id");
ALTER TABLE "public"."company_activation_employees" ADD CONSTRAINT "fk_company_activation_employee_company" FOREIGN KEY ("company_id") REFERENCES "public"."companies" ( "user_id");
ALTER TABLE "public"."users" ADD CONSTRAINT "fk_user_candidate" FOREIGN KEY ("id") REFERENCES "public"."candidates" ( "user_id");
ALTER TABLE "public"."users" ADD CONSTRAINT "fk_user_company" FOREIGN KEY ("id") REFERENCES "public"."companies" ( "user_id");
ALTER TABLE "public"."users" ADD CONSTRAINT "fk_user_employee" FOREIGN KEY ("id") REFERENCES "public"."employees" ( "user_id");
ALTER TABLE "public"."companies" ALTER COLUMN "is_active" SET DEFAULT false;