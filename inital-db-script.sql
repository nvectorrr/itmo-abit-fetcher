--
-- PostgreSQL database dump
--

-- Dumped from database version 13.6
-- Dumped by pg_dump version 13.6

-- Started on 2023-07-06 23:53:38

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 6 (class 2615 OID 195089)
-- Name: default; Type: SCHEMA; Schema: -; Owner: -
--

CREATE SCHEMA "default";


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 202 (class 1259 OID 195106)
-- Name: applications; Type: TABLE; Schema: default; Owner: -
--

CREATE TABLE "default".applications (
    id uuid NOT NULL,
    contest text,
    exam_type text,
    diploma_average numeric,
    "position" integer,
    priority integer,
    ia_scores numeric,
    exam_scores numeric,
    send_agreement integer,
    total_scores numeric,
    is_send_original boolean,
    snils character varying(30),
    case_number character varying(50) NOT NULL,
    status text,
    educational_program_id uuid NOT NULL
);


--
-- TOC entry 201 (class 1259 OID 195098)
-- Name: educational_programs; Type: TABLE; Schema: default; Owner: -
--

CREATE TABLE "default".educational_programs (
    id uuid NOT NULL,
    name character varying(30) NOT NULL,
    full_name text NOT NULL,
    budget_quota integer NOT NULL,
    contract_quota integer NOT NULL,
    special_quota integer NOT NULL,
    target_reception integer,
    isu_id integer
);


--
-- TOC entry 2858 (class 2606 OID 195113)
-- Name: applications applications_pk; Type: CONSTRAINT; Schema: default; Owner: -
--

ALTER TABLE ONLY "default".applications
    ADD CONSTRAINT applications_pk PRIMARY KEY (id);


--
-- TOC entry 2856 (class 2606 OID 195105)
-- Name: educational_programs educational_programs_pk; Type: CONSTRAINT; Schema: default; Owner: -
--

ALTER TABLE ONLY "default".educational_programs
    ADD CONSTRAINT educational_programs_pk PRIMARY KEY (id);


--
-- TOC entry 2859 (class 2606 OID 195114)
-- Name: applications applications_educational_programs_id_fk; Type: FK CONSTRAINT; Schema: default; Owner: -
--

ALTER TABLE ONLY "default".applications
    ADD CONSTRAINT applications_educational_programs_id_fk FOREIGN KEY (educational_program_id) REFERENCES "default".educational_programs(id);


-- Completed on 2023-07-06 23:53:39

--
-- PostgreSQL database dump complete
--

