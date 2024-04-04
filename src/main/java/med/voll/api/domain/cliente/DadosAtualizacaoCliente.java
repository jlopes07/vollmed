package med.voll.api.domain.cliente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoCliente(
        @NotNull Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
