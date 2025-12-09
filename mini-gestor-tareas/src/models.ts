// export de un interfaz tarea con id, titulo, una descripcion que puede ser null y un booleano completado
export interface Tarea {
  id: number;
  titulo: string;
  descripcion?: string;
  completada: boolean;
}
// export de un tipo IdTarea de valor numero
export type IdTarea = number;
// export de un tipo FiltroTarea que puede ser uno de tres elementos "todas" o "pendientes" o "completadas"
export type FiltroTarea = "todas" | "pendientes" | "completadas";