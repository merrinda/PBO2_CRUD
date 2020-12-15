/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_merri;


//import javax.persistence.Entity;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import project_merri.controller.AnggotaJpaController;
import project_merri.models.Anggota;

/**
 *
 * @author Merrinda Ratih Manjari
 */
public class Project_Merri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Project_MerriPU");
        /**
        melakukan inputan untuk database
        */
        Anggota anggota=new Anggota();
        AnggotaJpaController anggotactrl=new AnggotaJpaController(emf);
        
        anggota.setNik("6372020203990008");
        anggota.setNama("Muhammad Rizky Syahputra");
        anggota.setTtl("Medan, 02-03-1999");
        anggota.setAgama("Islam");
        anggota.setAlamat("Jl Ahlak Mulia");
        anggota.setGoldar("B+");
        anggota.setEmail("rizkyputra531.rp@gmail.com");
        anggota.setNoHp("085793780806");
        anggota.setStatus("Mahasiswa");
        
        try {
            anggotactrl.create(anggota);
        } catch (Exception ex) {
            Logger.getLogger(Project_Merri.class.getName()).log(Level.SERVE, null, ex);
        }
        
        
        
        
        
    }
    
}
