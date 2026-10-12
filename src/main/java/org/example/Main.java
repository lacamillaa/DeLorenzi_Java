import java.lang.Exception;
import static java.lang.IO.*;

void main() {
    f();
}

static void f() {
    g();
}

private static void g() {
    h();
}

private static void h() throws RuntimeException {
    throw new RuntimeException("Eccezione in arrivo");
}