class Recursao{

	public static boolean EhNegativo(int N){
	    return Negativo(N,N);
	}
	private static boolean Negativo(int A, int B){
        if (B==0) return false;
        if (A==0) return true;
        return Negativo(++A, --B);
	}
	public static boolean EhMaior(int A, int B){
		if (!EhNegativo(A)) // A+
		    if (!EhNegativo(B)) // B+
		        return MaiorPositivos(A,B);
		    else // B-
		        return true;
		else // A-
		    if (!EhNegativo(B)) // B+
		        return false;
		    else // B-
		        return MaiorNegativos(A,B);
	}
	private static boolean MaiorPositivos(int A, int B){
		   if (A==0) return false;
		   if (B==0) return true;
		   return MaiorPositivos(--A,--B);
	}
	private static boolean MaiorNegativos(int A, int B){
		   if (B==0) return false;
		   if (A==0) return true;
		   return MaiorNegativos(++A,++B);
	}
	public static boolean EhMaiorOuIgual(int A, int B){
		if (A==B) return true;
		return EhMaior(A,B);
	}

	public static boolean EhMenor(int A, int B){
		if (!EhNegativo(A)) // A+
		    if (!EhNegativo(B)) // B+
		        return MenorPositivos(A,B);
		    else // B-
		        return false;
		else // A-
		    if (!EhNegativo(B)) // B+
		        return true;
		    else // B-
		        return MenorNegativos(A,B);
	}
	private static boolean MenorPositivos(int A, int B){
		   if (B==0) return false;
		   if (A==0) return true;
		   return MenorPositivos(--A,--B);
	}

	private static boolean MenorNegativos(int A, int B){
		   if (A==0) return false;
		   if (B==0) return true;
		   return MenorNegativos(++A,++B);
	}
	public static boolean EhMenorOuIgual(int A, int B){
		if (A==B) return true;
		return EhMenor(A,B);
	}

   public static int SomaPositivos(int A, int B){
        if (B==0) return A;
        return (SomaPositivos( ++A, --B));
   }
}