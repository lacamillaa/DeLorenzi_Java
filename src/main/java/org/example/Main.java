import java.lang.Exception;
import static java.lang.IO.*;

void main() throws Exception {
    f();
}

static void f() throws Exception{
    g();
}

private static void g() throws Exception {
    h();
}

private static void h() throws Exception {
    throw new Exception("Eccezione in arrivo");
}