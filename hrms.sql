-- This script was generated by a beta version of the ERD tool in pgAdmin 4.
-- Please log an issue at https://redmine.postgresql.org/projects/pgadmin4/issues/new if you find any bugs, including reproduction steps.
BEGIN;


CREATE TABLE public.business_positions
(
    id smallint NOT NULL,
    name character varying(255),
    PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
);

CREATE TABLE public.departments
(
    id smallint NOT NULL,
    "Name" character varying(50) NOT NULL,
    PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
);

CREATE TABLE public.email_validations
(
    id integer NOT NULL,
    "UserEmail" character varying(50) NOT NULL,
    "ValidationCode" character varying(6) NOT NULL,
    PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
);

CREATE TABLE public.employees
(
    "Id" integer NOT NULL,
    "Name" character varying(50) NOT NULL,
    "Surname" character varying(50) NOT NULL,
    "IdentityNumber" character varying(11) NOT NULL,
    "BirthDay" date NOT NULL
)
WITH (
    OIDS = FALSE
);

CREATE TABLE public.employers
(
    id integer NOT NULL,
    "CompanyName" character varying(50) NOT NULL,
    "Website" character varying(100) NOT NULL,
    "Tel" character varying(10) NOT NULL,
    PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
);

CREATE TABLE public.system_persons
(
    id smallint NOT NULL,
    "Name" character varying(50) NOT NULL,
    "DepartmentId" smallint NOT NULL,
    PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
);

CREATE TABLE public.users
(
    "Id" integer NOT NULL,
    "Email" character varying NOT NULL,
    "PasswordHash" bytea NOT NULL,
    "PasswordSalt" bytea NOT NULL,
    PRIMARY KEY ("Id")
)
WITH (
    OIDS = FALSE
);

ALTER TABLE public.employees
    ADD FOREIGN KEY ("Id")
    REFERENCES public.users ("Id")
    NOT VALID;


ALTER TABLE public.employers
    ADD FOREIGN KEY (id)
    REFERENCES public.users ("Id")
    NOT VALID;


ALTER TABLE public.system_persons
    ADD FOREIGN KEY ("DepartmentId")
    REFERENCES public.departments (id)
    NOT VALID;


ALTER TABLE public.system_persons
    ADD FOREIGN KEY (id)
    REFERENCES public.users ("Id")
    NOT VALID;

END;