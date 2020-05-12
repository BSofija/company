INSERT INTO `employees`.`department` (`dept_number`, `dept_name`, `location`) VALUES ('1', 'administration', '1st floor');
INSERT INTO `employees`.`department` (`dept_number`, `dept_name`, `location`) VALUES ('2', 'marketing', '2nd floor');
INSERT INTO `employees`.`department` (`dept_number`, `dept_name`, `location`) VALUES ('3', 'sales ', '2nd floor');
INSERT INTO `employees`.`department` (`dept_number`, `dept_name`, `location`) VALUES ('4', 'it', '3rd floor');


INSERT INTO `employees`.`employee` (`id`, `email`, `first_name`, `last_name`, `salary`, `d_num_dept_number`) VALUES ('1', 'lwilstead0@icio.us', 'Lamond', 'Wilstead', '40000', '1');
INSERT INTO `employees`.`employee` (`id`, `email`, `first_name`, `last_name`, `salary`, `d_num_dept_number`) VALUES ('2', 'bcantle3@google.es', 'Bertha', 'Cantle', '50000', '4');
INSERT INTO `employees`.`employee` (`id`, `email`, `first_name`, `last_name`, `salary`, `d_num_dept_number`) VALUES ('3', 'pkemetzk@exblog.jp', 'Patrizius', 'Kemetz', '45000', '2');
INSERT INTO `employees`.`employee` (`id`, `email`, `first_name`, `last_name`, `salary`, `d_num_dept_number`) VALUES ('4', 'bshowenl@mit.edu', 'Bruis', 'Showen', '38000', '3');
INSERT INTO `employees`.`employee` (`id`, `email`, `first_name`, `last_name`, `salary`, `d_num_dept_number`) VALUES ('5', 'coldridgem@economist.com', 'Claudia', 'Oldridge', '45000', '2');
INSERT INTO `employees`.`employee` (`id`, `email`, `first_name`, `last_name`, `salary`, `d_num_dept_number`) VALUES ('6', 'cmellingsr@google.co.uk', 'Clyve', 'Mellings', '35000', '1');
INSERT INTO `employees`.`employee` (`id`, `email`, `first_name`, `last_name`, `salary`, `d_num_dept_number`) VALUES ('7', 'ascasey@symantec.com', 'Artur', 'Scase', '34000', '2');
INSERT INTO `employees`.`employee` (`id`, `email`, `first_name`, `last_name`, `salary`, `d_num_dept_number`) VALUES ('8', 'mmeringtonz@taobao.com', 'Moritz', 'Merington', '55000', '4');
INSERT INTO `employees`.`employee` (`id`, `email`, `first_name`, `last_name`, `salary`, `d_num_dept_number`) VALUES ('9', 'jminshall1g@privacy.gov.au', 'Josselyn', 'Minshall', '44600', '3');
INSERT INTO `employees`.`employee` (`id`, `email`, `first_name`, `last_name`, `salary`, `d_num_dept_number`) VALUES ('10', 'acraigheid1n@bbb.org', 'Adelbert', 'Craigheid', '45000', '2');


INSERT INTO `employees`.`client` (`company_name`) VALUES ('Zooveo');
INSERT INTO `employees`.`client` (`company_name`) VALUES ('Kwideo');
INSERT INTO `employees`.`client` (`company_name`) VALUES ('Myworks');
INSERT INTO `employees`.`client` (`company_name`) VALUES ('Realcube');


INSERT INTO `employees`.`project` (`p_number`, `p_name`, `client_company_name`, `d_num_dept_number`) VALUES ('1', 'WebApp', 'Zooveo', '1');
INSERT INTO `employees`.`project` (`p_number`, `p_name`, `client_company_name`, `d_num_dept_number`) VALUES ('2', 'BankingApp', 'Zooveo', '3');
INSERT INTO `employees`.`project` (`p_number`, `p_name`, `client_company_name`, `d_num_dept_number`) VALUES ('3', 'FinanceProject', 'Kwideo', '2');
INSERT INTO `employees`.`project` (`p_number`, `p_name`, `client_company_name`, `d_num_dept_number`) VALUES ('4', 'MarketingProject', 'Myworks', '2');
INSERT INTO `employees`.`project` (`p_number`, `p_name`, `client_company_name`, `d_num_dept_number`) VALUES ('5', 'Web project', 'Realcube', '4');


