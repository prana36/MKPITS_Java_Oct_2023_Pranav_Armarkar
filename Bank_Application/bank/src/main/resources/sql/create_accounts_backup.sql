CREATE TABLE web_bank.accounts (
  id INT NOT NULL AUTO_INCREMENT,
  user_id INT NOT NULL,
  account_type ENUM("Saving","Current") NOT NULL,
  rate_of_interest DECIMAL(3,1) NOT NULL,
  balance DECIMAL(15,2)) NOT NULL,
  updated_by INT NULL,
  updated_at DATETIME NULL,
  PRIMARY KEY (id),
  INDEX US_idx (user_id ASC) VISIBLE,
  CONSTRAINT US
    FOREIGN KEY (user_id)
    REFERENCES web_bank.users (id)
    ON DELETE NO ACTION
    ON UPDATE no action);