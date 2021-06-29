INSERT INTO `institution`(`name`, `description`) VALUES ('Dbam o Zdrowie', 'Pomoc dzieciom z ubogich rodzin.');
INSERT INTO `institution`(`name`, `description`) VALUES ('A kogo', 'Pomoc wybudzaniu dzieci ze śpiączki.');
INSERT INTO `institution`(`name`, `description`) VALUES ('Dla dzieci', 'Pomoc osobom znajdującym się w trudnej sytuacji życiowej.');
INSERT INTO `institution`(`name`, `description`) VALUES ('Bez domu', 'Pomoc dla osób nie posiadających miejsca zamieszkania.');

INSERT INTO `donation`(`city`, `pick_up_comment`, `pick_up_date`, `pick_up_time`, `quantity`, `street`, `zip_code`) VALUES ( 'warszawa', 'comment1', '2021-05-20', '12:15', '4', 'Nowa', '00717');
INSERT INTO `donation`(`city`, `pick_up_comment`, `pick_up_date`, `pick_up_time`, `quantity`, `street`, `zip_code`) VALUES ( 'wrocław', 'comment2', '2021-06-16', '18:15', '6', 'Stara', '00818');

INSERT INTO `category`(`name`) VALUES ('ubrania, które nadają się do ponownego użycia');
INSERT INTO `category`(`name`) VALUES ('ubrania, do wyrzucenia');
INSERT INTO `category`(`name`) VALUES ('zabawki');
INSERT INTO `category`(`name`) VALUES ('książki');
INSERT INTO `category`(`name`) VALUES ('inne');