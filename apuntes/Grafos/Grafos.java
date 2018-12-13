public interface GrafoTDA{
void InicializarGrafo();
// siempre que el grafo esté inicializado y no exista el nodo
void AgregarVertice(int v);
// siempre que el grafo esté inicializado y exista el nodo
void EliminarVertice (int v);
// siempre que el grafo esté inicializado
ConjuntoTDA Vertices();
// siempre que el grafo esté inicializado, no exista la arista, pero existan ambos nodos
void AgregarArista (int VO, int VD, int peso);
// siempre que el grafo esté inicializado y exista la arista
void EliminarArista(int VO, int VD);
// siempre que el grafo esté inicializado y existan los nodos
boolean ExisteArista (int VO, int VD);
// siempre que el grafo esté inicializado y exista la arista
int PesoArista (int VO, int VD);
}

class NodoVertice{
  int info;
  NodoArista OA;
  NodoVertice sig;
  }

class NodoArista{
  int peso;
  NodoVertice VD;
  NodoArista sig;
  }

  NodoVertice OV=null

  AgregarVertice(x){
  NodoVertice.nuevo=new NodoVertice(); //1
  nuevo.sig=ov;//2
  ov=nuevo;//3
  nuevo.info=x; //4
  nuevo.OA=null; //5
}

AgregarArista(VO,VD,peso){
NodoArista nuevo=new NodoArista();
NodoVertice VO=BuscarVertice(VO);//1
nuevo.sig=VO.OA//3
VO.OA=nuevo;//2
nuevo.peso=peso; //4
nuevo.VD=BuscarVertice(VD); //5
}

NodoVertice BuscarVertice(int v){
NodoVertice aux=ov;
while(aux!=null && aux.info!=v)
aux=aux.sig;
return aux;//devuelve vértice encontrado
}

boolean ExisteArista(int VO,int VD)
  NodoVertice VO=BuscarVertice(VO);
  NodoArista aux=VO.OA;
  while(aux!=null && aux.VD.info!=VD)
      aux=aux.sig;
  return (aux!=null);
}

int PesoArista(int VO,VD){
 NodoVertice VO=BuscarVertice(VO);
 NodoArista aux=VO;
 while(aux!=null&&aux.VD.info!=VD)
    aux=aux.sig;
 return(aux.peso);
}

void EliminarVertice(v){
  if(ov.info==v){
    ov=ov.sig;
  }
  else
  {
    NodoVertice aux=ov;
    while(aux.sig!=null && aux.sig.info!=v){
         aux=aux.sig;
      if(aux.sig!=null)
          aux.sig=aux.sig.sig;
      }
  }
  NodoVertice aux=ov;
  while(aux!=null){
    EliminarAristasEntrantes(aux.OA,v)
  }
}

void EliminarArista(int VO,intVD){
 NodoVertice VO=BuscarVertice(VO);
 EliminarAristasEntrantes(VO.OA.VD);
}

void EliminarAristasEntrantes(NodoArista OA,int v){
  if(OA.VD.info==v){
    OA=OA.sig;
  }else{
    NodoArista aux=OA;
    while(aux.sig!=null && aux.sig.VD.info!=v)
         aux=aux.sig;
    if(aux.sig!=null){
      aux.sig=aux.sig.sig;
    }
  }
}
