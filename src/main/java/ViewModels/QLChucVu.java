/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author homna
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class QLChucVu {
    
    private UUID id;
    private String ma;
    private String ten;

    @Override
    public String toString() {
        return "QLChucVu{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + '}';
    }
    
    
}
