CREATE TABLE alumno (
  idalumno CHAR(15) NOT NULL,
  apoderado_idapoderado CHAR(15) NOT NULL,
  nombres VARCHAR(20) NOT NULL,
  apellidos VARCHAR(20) NOT NULL,
  sexo VARCHAR(20) NOT NULL,
  telefono VARCHAR(20) NOT NULL,
  direccion VARCHAR(50) NOT NULL,
  fechaNacimiento DATE NOT NULL,
  estado CHAR(1) NOT NULL DEFAULT 'S',
  PRIMARY KEY(idalumno),
  INDEX alumno_FKIndex1(apoderado_idapoderado)
);
CREATE TABLE apoderado (
  idapoderado CHAR(15) NOT NULL,
  nombres VARCHAR(20) NOT NULL,
  apellidos VARCHAR(20) NOT NULL,
  telefono VARCHAR(20) NOT NULL,
  direccion VARCHAR(50) NOT NULL,
  estadoCivil VARCHAR(20) NOT NULL,
  estado CHAR(1) NOT NULL DEFAULT 'S',
  PRIMARY KEY(idapoderado)
)
;

CREATE TABLE aula (
  idaula CHAR(15) NOT NULL,
  numeroAula INT NOT NULL,
  capacidad INT NOT NULL,
  estado CHAR(1) NOT NULL DEFAULT 'S',
  PRIMARY KEY(idaula)
)
;

CREATE TABLE curso (
  idcurso CHAR(15) NOT NULL,
  profesor_idprofesor CHAR(15) NOT NULL,
  nombre VARCHAR(30) NOT NULL,
  estado CHAR(1) NOT NULL DEFAULT 'S',
  PRIMARY KEY(idcurso),
  INDEX curso_FKIndex1(profesor_idprofesor)
)
;

CREATE TABLE detalleMatricula (
  matricula_idmatricula CHAR(15) NOT NULL,
  curso_idcurso CHAR(15) NOT NULL,
  PRIMARY KEY(matricula_idmatricula, curso_idcurso),
  INDEX matricula_has_curso_FKIndex1(matricula_idmatricula),
  INDEX matricula_has_curso_FKIndex2(curso_idcurso)
)
;

CREATE TABLE horario (
  idhorario CHAR(15) NOT NULL,
  grado VARCHAR(20) NOT NULL,
  turno VARCHAR(20) NOT NULL,
  fechaInicio DATE NOT NULL,
  horaEntrada VARCHAR(20) NOT NULL,
  horaSalida VARCHAR(20) NOT NULL,
  estado CHAR(1) NOT NULL DEFAULT 'S',
  PRIMARY KEY(idhorario)
)
;

CREATE TABLE matricula (
  idmatricula CHAR(15) NOT NULL,
  alumno_idalumno CHAR(15) NOT NULL,
  programacion_idprogramacion CHAR(15) NOT NULL,
  fecha DATE NOT NULL,
  estado CHAR(1) NOT NULL DEFAULT 'S',
  PRIMARY KEY(idmatricula),
  INDEX matricula_FKIndex2(programacion_idprogramacion),
  INDEX matricula_FKIndex3(alumno_idalumno)
)
;

CREATE TABLE profesor (
  idprofesor CHAR(15) NOT NULL,
  dni CHAR(8) NOT NULL,
  apellidos VARCHAR(30) NOT NULL,
  nombres VARCHAR(20) NOT NULL,
  telefono VARCHAR(20) NOT NULL,
  direccion CHAR(50) NOT NULL,
  estado CHAR(1) NOT NULL DEFAULT 'S',
  PRIMARY KEY(idprofesor)
)
;

CREATE TABLE programacion (
  idprogramacion CHAR(15) NOT NULL,
  horario_idhorario CHAR(15) NOT NULL,
  aula_idaula CHAR(15) NOT NULL,
  estado CHAR(1) NOT NULL DEFAULT 'S',
  PRIMARY KEY(idprogramacion),
  INDEX programacion_FKIndex1(aula_idaula),
  INDEX programacion_FKIndex3(horario_idhorario)
)
;


