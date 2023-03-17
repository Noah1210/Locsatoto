INSERT INTO `202223_locsatoto_npardon`.`appartement` (`code`, `adresse`, `nom`, `tarif_mois`) VALUES ('A001', '28 rue bernard brunhes', 'les quatre vents', '800');
INSERT INTO `202223_locsatoto_npardon`.`appartement` (`code`, `adresse`, `nom`, `tarif_mois`) VALUES ('A002', '4 vallées des chaperons', 'le beau soleil', '1200');
INSERT INTO `202223_locsatoto_npardon`.`appartement` (`code`, `adresse`, `nom`, `tarif_mois`) VALUES ('A003', '15 Rue des Lilas', 'Tour Montparnasse', '6000');
INSERT INTO `202223_locsatoto_npardon`.`location` (`code`, `date_creation`, `appartement_code`) VALUES ('L001', now(), 'A001');
INSERT INTO `202223_locsatoto_npardon`.`location` (`code`, `date_creation`, `appartement_code`) VALUES ('L002', now(), 'A002');
INSERT INTO `202223_locsatoto_npardon`.`location` (`code`, `date_creation`, `appartement_code`) VALUES ('L003', now(), 'A003');