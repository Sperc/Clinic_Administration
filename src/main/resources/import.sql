INSERT INTO app_user(password,username) VALUES ("admin","admin");
INSERT INTO role(name) VALUES ("ADMIN");
INSERT INTO user_role(user_id,role_id) VALUES (1,1);

INSERT INTO patient(id,first_name,last_name,birth_day,pesel) VALUES (1,"tomasz","Taksk","11-05-2201","123123123");
INSERT INTO patient(id,first_name,last_name,birth_day,pesel) VALUES (2,"wwsa","aasdasd","11-05-2201","123123123");

INSERT INTO contract_type(id,name,work_time,salary) VALUES (1,"etat",123,12000.0);

INSERT INTO warehouse_employees(id,max_number_of_employees) VALUES (1,40);

INSERT INTO employee(id,first_name,last_name,position,contract_type_id,warehouse_employees_id) VALUES (1,"Tomasz","Baran","lekarz",1,1);


