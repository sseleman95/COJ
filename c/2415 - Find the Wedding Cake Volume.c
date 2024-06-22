#include <stdio.h>
main(){
	int pruebas,pasteles,radio,altura;
	double volumen,suma=0,pi=3.141592653589793;
	scanf("%d",&pruebas);
	while(pruebas--){
		scanf("%d",&pasteles);
		for(int i=0;i<pasteles;i++){
			scanf("%d",&radio);
			scanf("%d",&altura);
			volumen=radio*radio*altura*pi;
			suma=suma+volumen;
		}
		printf("%.2f\n",suma);
		suma=0;
	}
}