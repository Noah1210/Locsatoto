
INSERT INTO `appartement` (`code`, `adresse`, `nom`, `tarif_mois`) VALUES ('APP001', '15 avenue Charras 63000 Clermont ferrand', 'Bonaparte', '600');
INSERT INTO `appartement` (`code`, `adresse`, `nom`, `tarif_mois`) VALUES ('APP002', '13 Chemin fleuri 63000 Clermont ferrand', 'Belapart', '750');
INSERT INTO `appartement` (`code`, `adresse`, `nom`, `tarif_mois`) VALUES ('APP003', '65 rue Victor Hugo 63000 Clermont ferrand', 'Résidence des lapins', '350');
INSERT INTO `appartement` (`code`, `adresse`, `nom`, `tarif_mois`) VALUES ('APP004', '35 avenue Marechal Leclerc', 'Les bois verts', '1200');

INSERT INTO `equipement` (`nom`) VALUES ('Plaque de cuisson');
INSERT INTO `equipement` (`nom`) VALUES ('Hotte aspirante');
INSERT INTO `equipement` (`nom`) VALUES ('Four');
INSERT INTO `equipement` (`nom`) VALUES ('Micro-ondes');
INSERT INTO `equipement` (`nom`) VALUES ('Lave-vaisselle');
INSERT INTO `equipement` (`nom`) VALUES ('Réfrigérateur');
INSERT INTO `equipement` (`nom`) VALUES ('Aspirateur');
INSERT INTO `equipement` (`nom`) VALUES ('Téléviseur');
INSERT INTO `equipement` (`nom`) VALUES ('Lave-linge');
INSERT INTO `equipement` (`nom`) VALUES ('Table(s)');
INSERT INTO `equipement` (`nom`) VALUES ('Chaise(s)');
INSERT INTO `equipement` (`nom`) VALUES ('Plan de travail');
INSERT INTO `equipement` (`nom`) VALUES ('Canapé(s)');
INSERT INTO `equipement` (`nom`) VALUES ('Fauteuil(s)');
INSERT INTO `equipement` (`nom`) VALUES ('Buffet(s)');
INSERT INTO `equipement` (`nom`) VALUES ('Lit(s)');
INSERT INTO `equipement` (`nom`) VALUES ('Matelas');
INSERT INTO `equipement` (`nom`) VALUES ('Meuble de salle de bain');

INSERT INTO `etat` (`libelle`) VALUES ('Très bon');
INSERT INTO `etat` (`libelle`) VALUES ('Bon');
INSERT INTO `etat` (`libelle`) VALUES ('Moyen');
INSERT INTO `etat` (`libelle`) VALUES ('Mauvais');

INSERT INTO `inventaire` (`dtype`,  `commentaire`, `date_creation`) VALUES ('InventaireEntree',  'Appartement LOC0001 est propre', '2022-10-26 9:00');
INSERT INTO `inventaire` (`dtype`,  `commentaire`, `date_creation`) VALUES ('InventaireEntree',  'Appartement LOC0005 est neuf', '2022-11-28 14:00');
INSERT INTO `inventaire` (`dtype`, `commentaire`, `date_creation`) VALUES ('InventaireSortie',  'Appartement LOC0005 est beaucoup moins neuf', '2023-1-28 19:00');

INSERT INTO `location` (`code`, `date_creation`, `appartement_code` , `inventaire_entree_id`) VALUES ('LOC00001', '2022-10-25 08:33', 'APP001','1');
INSERT INTO `location` (`code`, `date_creation`, `appartement_code`) VALUES ('LOC00002', '2022-11-26 09:40', 'APP002');
INSERT INTO `location` (`code`, `date_creation`, `appartement_code`) VALUES ('LOC00003', '2019-1-16 19:40', 'APP003');
INSERT INTO `location` (`code`, `date_creation`, `appartement_code`) VALUES ('LOC00004', '2017-10-25 08:33', 'APP001');
INSERT INTO `location` (`code`, `date_creation`, `appartement_code` , `inventaire_entree_id` , `inventaire_sortie_id`) VALUES ('LOC00005', '2018-11-26 09:40', 'APP002','2' , '3');
INSERT INTO `location` (`code`, `date_creation`, `appartement_code`) VALUES ('LOC00006', '2018-1-16 19:40', 'APP003');
INSERT INTO `location` (`code`, `date_creation`, `appartement_code`) VALUES ('LOC00007', '2022-02-25 08:33', 'APP001');
INSERT INTO `location` (`code`, `date_creation`, `appartement_code`) VALUES ('LOC00008', '2022-03-26 09:40', 'APP002');
INSERT INTO `location` (`code`, `date_creation`, `appartement_code`) VALUES ('LOC00009', '2019-04-16 19:40', 'APP003');


INSERT INTO `appartement_equipements` (`appartement_code`, `equipements_nom`) VALUES ('APP001', 'Four');
INSERT INTO `appartement_equipements` (`appartement_code`, `equipements_nom`) VALUES ('APP001', 'Micro-ondes');
INSERT INTO `appartement_equipements` (`appartement_code`, `equipements_nom`) VALUES ('APP001', 'Lave-vaisselle');
INSERT INTO `appartement_equipements` (`appartement_code`, `equipements_nom`) VALUES ('APP002', 'Four');
INSERT INTO `appartement_equipements` (`appartement_code`, `equipements_nom`) VALUES ('APP002', 'Micro-ondes');
INSERT INTO `appartement_equipements` (`appartement_code`, `equipements_nom`) VALUES ('APP002', 'Lave-vaisselle');
INSERT INTO `appartement_equipements` (`appartement_code`, `equipements_nom`) VALUES ('APP002', 'Réfrigérateur');
INSERT INTO `appartement_equipements` (`appartement_code`, `equipements_nom`) VALUES ('APP003', 'Réfrigérateur');
INSERT INTO `appartement_equipements` (`appartement_code`, `equipements_nom`) VALUES ('APP003', 'Aspirateur');
INSERT INTO `appartement_equipements` (`appartement_code`, `equipements_nom`) VALUES ('APP003', 'Téléviseur');
INSERT INTO `appartement_equipements` (`appartement_code`, `equipements_nom`) VALUES ('APP004', 'Lave-linge');
INSERT INTO `appartement_equipements` (`appartement_code`, `equipements_nom`) VALUES ('APP004', 'Table(s)');
INSERT INTO `appartement_equipements` (`appartement_code`, `equipements_nom`) VALUES ('APP004', 'Aspirateur');
INSERT INTO `appartement_equipements` (`appartement_code`, `equipements_nom`) VALUES ('APP004', 'Téléviseur');
INSERT INTO `appartement_equipements` (`appartement_code`, `equipements_nom`) VALUES ('APP004', 'Fauteuil(s)');

INSERT INTO `evaluation` ( `commentaire`, `equipement_nom`, `etat_libelle`,`inventaire_id`) VALUES ( '', 'Four', 'Bon',1);
INSERT INTO `evaluation` ( `commentaire`, `equipement_nom`, `etat_libelle`,`inventaire_id`) VALUES ( '', 'Micro-ondes', 'Moyen',1);
INSERT INTO `evaluation` ( `commentaire`, `equipement_nom`, `etat_libelle`,`inventaire_id`) VALUES ( 'Moisissures', 'Lave-vaisselle', 'Moyen',1);

INSERT INTO `evaluation` ( `commentaire`, `equipement_nom`, `etat_libelle`,`inventaire_id`) VALUES ( 'Semble neuf', 'Four', 'Très bon',2);
INSERT INTO `evaluation` ( `commentaire`, `equipement_nom`, `etat_libelle`,`inventaire_id`) VALUES ('', 'Micro-ondes', 'Moyen',2);
INSERT INTO `evaluation` ( `commentaire`, `equipement_nom`, `etat_libelle`,`inventaire_id`) VALUES ( '', 'Lave-vaisselle', 'Moyen',2);
INSERT INTO `evaluation` ( `commentaire`, `equipement_nom`, `etat_libelle`,`inventaire_id`) VALUES ( '', 'Réfrigérateur', 'Bon',2);

INSERT INTO `evaluation` ( `commentaire`, `equipement_nom`, `etat_libelle`,`inventaire_id`) VALUES ( 'Plus de lumière', 'Four', 'Mauvais',3);
INSERT INTO `evaluation` ( `commentaire`, `equipement_nom`, `etat_libelle`,`inventaire_id`) VALUES ( '', 'Micro-ondes', 'Moyen',3);
INSERT INTO `evaluation` ( `commentaire`, `equipement_nom`, `etat_libelle`,`inventaire_id`) VALUES ( '', 'Lave-vaisselle', 'Mauvais',3);
INSERT INTO `evaluation` ( `commentaire`, `equipement_nom`, `etat_libelle`,`inventaire_id`) VALUES ( '', 'Réfrigérateur', 'Mauvais',3);