INSERT INTO empleados (`id`, `apellido`, `dni`, `nombre`) VALUES ('1', 'betancur', '30677736', 'damian');
INSERT INTO empleados (`id`, `apellido`, `dni`, `nombre`) VALUES ('2', 'betancur', '4000000', 'damian');
INSERT INTO empleados (`id`, `apellido`, `dni`, `nombre`) VALUES ('3', 'betancur', '3067776', 'damian');
INSERT INTO empleados (`id`, `apellido`, `dni`, `nombre`) VALUES ('4', 'betancur', '3557736', 'damian');
INSERT INTO empleados (`id`, `apellido`, `dni`, `nombre`) VALUES ('5', 'betancur', '3557736', 'damian');

INSERT INTO estado_campos (`id`, `descripcion`) VALUES ('1', 'creado');
INSERT INTO estado_campos (`id`, `descripcion`) VALUES ('2', 'trabajado');
INSERT INTO estado_campos (`id`, `descripcion`) VALUES ('3', 'parcialmente trabajado');
INSERT INTO estado_campos (`id`, `descripcion`) VALUES ('4', 'desuso');


INSERT INTO campos (`id`, `numero_campo`, `estado_de_campo_id`) VALUES ('1', '0003', '1');

INSERT INTO tipos_suelos (`id`, `descripcion`) VALUES ('1', 'arenoso');
INSERT INTO tipos_suelos (`id`, `descripcion`) VALUES ('2', 'limoso');
INSERT INTO tipos_suelos (`id`, `descripcion`) VALUES ('3', 'arcilloso');
INSERT INTO tipos_suelos (`id`, `descripcion`) VALUES ('4', 'humifero');

INSERT INTO laboreos (`id`, `descripcion`) VALUES ('1', 'Arar');
INSERT INTO laboreos (`id`, `descripcion`) VALUES ('2', 'Rastrillar');
INSERT INTO laboreos (`id`, `descripcion`) VALUES ('3', 'Sembrar');
INSERT INTO laboreos (`id`, `descripcion`) VALUES ('4', 'Fumigar');
INSERT INTO laboreos (`id`, `descripcion`) VALUES ('5', 'Cosechar');

INSERT INTO cultivos (`id`,`nombre`) VALUES ('1','Soja');
INSERT INTO cultivos (`id`,`nombre`) VALUES ('2','Papa');

--- orden de laboreo para proyecto de cultivo de soja ---
INSERT INTO ordenes_laboreos (`id`,`numero_orden_laboreo`, `laboreo_id`) VALUES ('1','1','1');
INSERT INTO ordenes_laboreos (`id`,`numero_orden_laboreo`, `laboreo_id`) VALUES ('2','1','2');
INSERT INTO ordenes_laboreos (`id`,`numero_orden_laboreo`, `laboreo_id`) VALUES ('3','1','3');
INSERT INTO ordenes_laboreos (`id`,`numero_orden_laboreo`, `laboreo_id`) VALUES ('4','1','4');
INSERT INTO ordenes_laboreos (`id`,`numero_orden_laboreo`, `laboreo_id`) VALUES ('5','1','5');

--- orden de laboreo para proyecto de cultivo de papa ---

INSERT INTO ordenes_laboreos (`id`,`numero_orden_laboreo`, `laboreo_id`) VALUES ('6','2','2');
INSERT INTO ordenes_laboreos (`id`,`numero_orden_laboreo`, `laboreo_id`) VALUES ('7','2','3');
INSERT INTO ordenes_laboreos (`id`,`numero_orden_laboreo`, `laboreo_id`) VALUES ('8','2','5');

INSERT INTO cultivos_ordenes_laboreos (`cultivo_id`,`orden_laboreo_id`) VALUES ('1','1');
INSERT INTO cultivos_ordenes_laboreos (`cultivo_id`,`orden_laboreo_id`) VALUES ('2','2');




