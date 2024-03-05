package med.voll.api.cliente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoCliente(
        @NotNull Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
