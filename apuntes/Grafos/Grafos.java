public interface Grafo {
  //Vertices
  AgregarVertice(int x);
  EliminarVertice(int x);
  ConjuntoTDA Vertice();
//Aristas
void AgregarArista(int vo, int vd, int peso);
void EliminarArista(int vo, int vd);
boolean ExisteArista(int vo, int vd);
int PesoArista(int vo,int vd);
}

  int info;
  NodoArista OA;
  NodoVertice sig;
  }

class NodoArista{
  int peso;
  NodoVertice VD;
  NodoArista sig;
  }
veri
NodoVertice Buscar(x){
  NodoVertice aux=ov;
  while(aux!=nul && aux.info!=x)
    aux=aux.sig;
  return aux;
}

AgregarVertice(x){
  NodoVertice.nuevo=new NodoVertice();
  nuevo.sig=ov;
  ov=nuevo;
  nuevo.info=x; //4
  nuevo.OA=null; //5
}



AgregarArista(VO,VD,Peso){
  NodoArista nuevo=new Arista();
  NodoVertice no=Buscar(VO);//1
  nuevo.sig=OA//2
  NO.OA=nuevo;//3
  nuevo.peso=peso; //4
  nuevo.VD=Buscar(VD); //5
}

EliminarVertice(v){
  if(ov.info==v){
    ov=ov.sig;
  }
  else
  {
    NodoVertice aux=ov;
    while(aux.sig!=null && aux.sig.info!=v){
      aux=aux.sig;
      if(aux.sig!=null){
      aux.sig=aux.sig.sig;
      }
    }
  }
  NodoVertice aux=ov;
  while(aux!=null){
    EliinarAristasEntrantes(aux.OA,v)
  }
}

EliminarAristasEntrantes(NodoArista OA,int v){
  if(OA.VD.info==v){
    OA=OA.sig;
  }
  else{
    NodoArista aux=OA;
    while(aux.sig!=null && aux.sig.VD.info!=v)
        aux=aux.sig;
    if(aux.sig!=null){
      aux.sig=aux.sig.sig;
    }
  }
}
