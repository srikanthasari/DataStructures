package com.fime.org;

public class CoreConceptInDataStructue {
	int y = 1;
	static int i = 1;
	int[] k = { 1, 2, 3, 4 };

	public static void main(String[] args) {
		CoreConceptInDataStructue coreConceptInDataStructue = new CoreConceptInDataStructue();
		int[] x = { 1, 2, 3, 4 };
		System.out.println("Next value index0:" + x[0] + " Next value index1:" + x[1] + " Next value index2:" + x[2]
				+ " Next value index3:" + x[3]);

		System.out.println("Next value index0:" + coreConceptInDataStructue.k[0] + " Next value index1:"
				+ coreConceptInDataStructue.k[1] + " Next value index2:" + coreConceptInDataStructue.k[2]
				+ " Next value index3:" + coreConceptInDataStructue.k[3]);
		System.out.println("instance variable value :" + coreConceptInDataStructue.y);
/**
 * calling the method trough constructor
 */
		coreConceptInDataStructue.entityClassValuesShow();
		System.out.println("jhhjgg");
		/**
		 * callinSg the method
		 */
		entityClassValuesShow();
	}

	public static  void entityClassValuesShow() {
		EntityClass entityClass = new EntityClass(1, "ggg");
		System.out.println(entityClass);
		System.out.println("ii");

	}
}
