package est.usmba;

public class TestUnitaire {
    public static void main(String[] args) {
        System.out.println("===== Test unitaire Student =====");

        // Test 1 : Création d’un étudiant avec une note initiale
        try {
            Student s1 = new Student("S1", "Ali", 14.5);
            System.out.println("✅ Test 1 OK - Note initiale: " + s1.getGrade());
        } catch (Exception e) {
            System.out.println("❌ Test 1 KO - Erreur : " + e.getMessage());
        }

        // Test 2 : Mise à jour avec une note valide
        try {
            Student s2 = new Student("S2", "Sara", 10.0);
            s2.updateGrade(18.0);
            System.out.println("✅ Test 2 OK - Nouvelle note : " + s2.getGrade());
        } catch (Exception e) {
            System.out.println("❌ Test 2 KO - Erreur : " + e.getMessage());
        }

        // Test 3 : Mise à jour avec une note invalide (<0)
        try {
            Student s3 = new Student("S3", "Omar", 12.0);
            s3.updateGrade(-5.0);
            System.out.println("❌ Test 3 KO - Aucune exception levée !");
        } catch (IllegalArgumentException e) {
            System.out.println("✅ Test 3 OK - Exception attendue : " + e.getMessage());
        }

        // Test 4 : Mise à jour avec une note invalide (>20)
        try {
            Student s4 = new Student("S4", "Salma", 13.0);
            s4.updateGrade(25.0);
            System.out.println("❌ Test 4 KO - Aucune exception levée !");
        } catch (IllegalArgumentException e) {
            System.out.println("✅ Test 4 OK - Exception attendue : " + e.getMessage());
        }
    }
}
