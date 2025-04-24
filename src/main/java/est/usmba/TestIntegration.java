package est.usmba;
public class TestIntegration {
    public static void main(String[] args) {
        System.out.println("===== Test d’intégration =====");

        // Création des objets
        Student student = new Student("S1", "Mohamed", 16.0);
        Course course = new Course("Mathématiques", "Pr. Youssef");
        NotificationService notifier = new NotificationService();
        EnrollmentService enrollment = new EnrollmentService(notifier);

        // Exécution
        enrollment.enroll(student, course);
        // Attendu : Affichage d’un message dans la console
    }
}
