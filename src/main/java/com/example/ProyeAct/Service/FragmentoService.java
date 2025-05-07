/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProyeAct.Service;

import com.example.ProyeAct.Model.AutorP;
import com.example.ProyeAct.Model.AutoresFragmentos;
import com.example.ProyeAct.Model.DireccionesUri;
import com.example.ProyeAct.Model.DireccionesUrl;
import com.example.ProyeAct.Model.Entidad;
import com.example.ProyeAct.Model.EntidadesFragmento;
import com.example.ProyeAct.Model.Estrellas;
import com.example.ProyeAct.Model.EstrellasFragmento;
import com.example.ProyeAct.Model.FechaP;
import com.example.ProyeAct.Model.Fragmento;
import com.example.ProyeAct.Model.Kicker;
import com.example.ProyeAct.Model.Organizacion;
import com.example.ProyeAct.Model.Referencia;
import com.example.ProyeAct.Model.Rol;
import com.example.ProyeAct.Model.Seccion;
import com.example.ProyeAct.Model.SeccionFragmento;
import com.example.ProyeAct.Model.SubSeccion;
import com.example.ProyeAct.Model.Tematica;
import com.example.ProyeAct.Model.TematicaFragmento;
import com.example.ProyeAct.Model.Ubicacion;

import com.example.ProyeAct.Repository.AutorPRepository;
import com.example.ProyeAct.Repository.AutoresFragmentosRepository;
import com.example.ProyeAct.Repository.DireccionesUriRepository;
import com.example.ProyeAct.Repository.DireccionesUrlRepository;
import com.example.ProyeAct.Repository.EntidadRepository;
import com.example.ProyeAct.Repository.EntidadesFragmentoRepository;
import com.example.ProyeAct.Repository.EstrellasFragmentoRepository;
import com.example.ProyeAct.Repository.EstrellasRepository;
import com.example.ProyeAct.Repository.FechaPRepository;
import com.example.ProyeAct.Repository.KickerRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.ProyeAct.Repository.FragmentoRepository;
import com.example.ProyeAct.Repository.SeccionFragmentoRepository;
import com.example.ProyeAct.Repository.OrganizacionRepository;
import com.example.ProyeAct.Repository.ReferenciaRepository;
import com.example.ProyeAct.Repository.RolRepository;
import com.example.ProyeAct.Repository.SeccionRepository;
import com.example.ProyeAct.Repository.SubSeccionRepository;
import com.example.ProyeAct.Repository.TematicaFragmentoRepository;
import com.example.ProyeAct.Repository.TematicaRepository;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
//import java.util.Scanner;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.RestTemplate;

/**
 *
 * @author user
 */
@Service
public class FragmentoService {
    
    //@Value("${nyt.api.key}")
    
    @Autowired
    public FragmentoRepository fragmentoRepository;
    
    @Autowired
    public EstrellasRepository estrellasRepository;
    
    @Autowired
    public EstrellasFragmentoRepository estrellasFragmentoRepository;
    
    @Autowired
    public AutorPRepository autorPRepository;
    
    @Autowired
    public AutoresFragmentosRepository autoresFragmentosRepository;
    
    @Autowired
    public KickerRepository kickerRepository;
    
    @Autowired
    public OrganizacionRepository organizacionRepository;
    
    @Autowired
    public RolRepository rolRepository;
    
    @Autowired
    public SeccionRepository seccionRepository;
    
    @Autowired
    public SubSeccionRepository subSeccionRepository;
    
    @Autowired
    public SeccionFragmentoRepository seccionFragmentoRepository;
    
    @Autowired
    public TematicaRepository tematicaRepository;
    
    @Autowired
    public TematicaFragmentoRepository tematicaFragmentoRepository;
    
    @Autowired
    public EntidadRepository entidadesRepository;
    
    @Autowired
    public EntidadesFragmentoRepository entidadesFragmentoRepository;
    
    @Autowired
    public DireccionesUrlRepository direccionesUrlRepository;
    
    @Autowired
    public DireccionesUriRepository direccionesUriRepository;
    
    @Autowired
    public FechaPRepository fechaPRepository;
    
    @Autowired
    public ReferenciaRepository referenciaRepository;
    
    @Autowired
    public RestTemplate restTemplate;
    
    public void cargarDesdeApi(){
        /***
         * 
         *              RECORRIDO PARA HACER EL PROCEDIMIENTO MAS AGIL
         * 
         * 
        int fechafinal = 2025;
        for(int fechainicio= 1851; fechainicio<fechafinal;fechainicio++){
            
        String url1 = "https://api.nytimes.com/svc/archive/v1/"+fechainicio+"/1.json?api-key=ca5zm70vrlPdm8zRBlHDQZzPmucXD5Lc";
        
        }
        * 
        ***/
        
        //String url = "https://api.nytimes.com/svc/archive/v1/2024/1.json?api-key=ca5zm70vrlPdm8zRBlHDQZzPmucXD5Lc";
        try{
            URL url = new URL("https://api.nytimes.com/svc/archive/v1/2024/1.json?api-key=ca5zm70vrlPdm8zRBlHDQZzPmucXD5Lc");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            
            
            
            int responseCode = conn.getResponseCode();
            if(responseCode != 200){
                throw new RuntimeException("Ocurrio un error: "+responseCode);
            }else{
                StringBuilder informacion = new StringBuilder();
                /**
                 *                  PARA LEERLO TODO
                 * 
                Scanner scanner = new Scanner(url.openStream());
                
                while(scanner.hasNext()){
                    informacion.append(scanner.nextLine());
                }
                scanner.close();
                
                System.out.println(informacion);
                * 
                */ 
                
                String jsonString = informacion.toString();
                
                JSONObject jsonObject = new JSONObject(jsonString);
                JSONObject response = jsonObject.getJSONObject("response");
                JSONArray docs = response.getJSONArray("docs");

                for (int i = 0; i < docs.length(); i++) {
                    JSONObject article = docs.getJSONObject(i);
                    String headline = article.getJSONObject("headline").getString("main");
                    String url = article.getString("web_url");
                    String abstractText = article.optString("abstract", "");
                    String pubDate = article.getString("pub_date");

                    // Obtener multimedia (ejemplo: la imagen de tipo "xlarge")
                    JSONArray multimedia = article.getJSONArray("multimedia");
                    /**
                    *                       RECORRER PARA EXTRAER LA IMAGEN 
                    * 
                    *String imageUrl = "";
                    *for (int j = 0; j < multimedia.length(); j++) {
                    *    JSONObject media = multimedia.getJSONObject(j);
                    *    if ("xlarge".equals(media.getString("subtype"))) {
                    *        imageUrl = "https://www.nytimes.com/" + media.getString("url");
                    *        break;
                    *    }
                    *}
                    * 
                    */
                }
            }
            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        //ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);
        
        
        List<Map<String, Object>> resultados = (List<Map<String, Object>>) response.getBody().get("results");
        
        for(Map<String, Object> item : resultados){
                Z
            
        }
    
    }
    
    public String cargarDesdeApiTimesWire(){
                /***
         * 
         *              RECORRIDO PARA HACER EL PROCEDIMIENTO MAS AGIL
         * 
         * 
        int fechafinal = 2025;
        for(int fechainicio= 1851; fechainicio<fechafinal;fechainicio++){
            
        String url1 = "https://api.nytimes.com/svc/archive/v1/"+fechainicio+"/1.json?api-key=ca5zm70vrlPdm8zRBlHDQZzPmucXD5Lc";
        
        }
        * 
        ***/
        
        String url = "https://api.nytimes.com/svc/archive/v1/2024/1.json?api-key=ca5zm70vrlPdm8zRBlHDQZzPmucXD5Lc";
        ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);
    
        List<Map<String, Object>> resultados = (List<Map<String, Object>>) response.getBody().get("response");
        
        for(Map<String, Object> item : resultados){
            Fragmento frg = new Fragmento();
            
            /**
             * 
             *          FRAGMENTO
             * 
             */
            
            frg.setTitulo((String) item.get("title"));
            frg.setabstracto((String) item.get("abstract"));
            frg.setabstracto((String) item.get("abstract"));
            
            fragmentoRepository.save(frg);
            
            Seccion sc = new Seccion();
            SubSeccion sbc = new SubSeccion();
            
            sc.setNombreSeccion((String) item.get("section"));
            sbc.setNombreSeccion((String) item.get("subsection"));
            
            subSeccionRepository.save(sbc);
            seccionRepository.save(sc);
            
            DireccionesUri duri = new DireccionesUri();
            DireccionesUrl durl = new DireccionesUrl();
            
            duri.setdireccionUri((String) item.get("uri"));
            durl.setnombreUrl((String) item.get("url"));
            
            direccionesUriRepository.save(duri);
            direccionesUrlRepository.save(durl);
            
            /**
             * 
             *              FECHAS
             * 
             */
            
            /**
            *FechaP fecha = new FechaP();
            
            *fecha.setupdate_date();
            *fecha.setpub_date();
            *fecha.setcreate_date();
            */
            
            /**
             * 
             * 
             * 
             */
            
            Kicker kicker = new Kicker();
            
            kicker.setnombre((String) item.get("kicker"));
            kicker.setimpresion((String) item.get("subheadline"));
            kickerRepository.save(kicker);
            
            Tematica tema = new Tematica();
            TematicaFragmento tmFrg = new TematicaFragmento();
            
            
            
            List<String> des_facet = (List<String>) item.get("des_facet");
            
            for(String k : des_facet){
                tema.setnombreTematica(k);
                tmFrg.setidFragmento(frg);
                tmFrg.setidTematica(tema);
                
                tematicaFragmentoRepository.save(tmFrg);
                tematicaRepository.save(tema);
            }
            
            Entidad entidad = new Entidad();
            EntidadesFragmento frgent = new EntidadesFragmento();
            
            entidad.setnombreEntidad((String) item.get("org_facet"));
            
            entidadesFragmentoRepository.save(frgent);
            entidadesRepository.save(entidad);
            
            AutorP autor = new AutorP();
            autor.setnombreAutor((String) item.get("per_facet"));
            
            autorPRepository.save(autor);
            
            /**
            *Ubicacion ubic = new Ubicacion();
            *
            *ubic.setNombre((String) item.get("geo_facet"));
            */
            
        }
        
        return "La buena";
    }
    
    public String cargarDesdeApiMostPopular(){
                /***
         * 
         *              RECORRIDO PARA HACER EL PROCEDIMIENTO MAS AGIL
         * 
         * 
        int fechafinal = 2025;
        for(int fechainicio= 1851; fechainicio<fechafinal;fechainicio++){
            
        String url1 = "https://api.nytimes.com/svc/archive/v1/"+fechainicio+"/1.json?api-key=ca5zm70vrlPdm8zRBlHDQZzPmucXD5Lc";
        
        }
        * 
        ***/
        
        
        
                try{
  
                    URL url = new URL("https://api.nytimes.com/svc/mostpopular/v2/emailed/7.json?api-key=ca5zm70vrlPdm8zRBlHDQZzPmucXD5Lc");
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setRequestMethod("GET");
                    conn.connect();

                    int responseCode = conn.getResponseCode();
                    if(responseCode == HttpURLConnection.HTTP_OK)
                   {
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(conn.getInputStream())
                    );
                    String inputLine;
                    StringBuilder informacion = new StringBuilder();

                    while ((inputLine = in.readLine()) != null) {
                        informacion.append(inputLine);
                    }

                    in.close();

                    // Aquí tienes el JSON como String:
                    String jsonString = informacion.toString().substring(103);
                    //System.out.println("JSON recibido:");
                    //System.out.println(jsonString.toString());

                    // 1. Divide por el separador entre objetos

                    String json = jsonString.replace('"', ';');
                    //System.out.println(json);
                    String[] partes = json.split("\\;");
                    
                    for(int i = 0; i< 1000;i++){
                        
                        System.out.println(partes[i]);
                    }
                       System.out.println(json);
                    
                    
                    int j=0;
                    boolean val = false, 
                    val9n=false,
                    val9v=false,
                    val9r=false,
                    val9m=false,
                    val15o=false,
                    val15f=false,
                    val15m=false,
                    val15l=false,
                    val15q=false,
                    val15t=false,
                    val15r=false,
                    val15or=false,
                    val15ra=false,
                    val15re=false;

                    ArrayList<Integer>  array1 = new ArrayList<>();
            
                        String inicio = ":[";
                        String cierre = "],";
                        String llavedeapertura = "{";
                        String llavedeapertura1 = "}";
                        String dospuntos = ":";
                        String coma = ",";
                        String separador = "}],";
                        String palabra0 = "uri";
                        String palabra1 = "id";
                        String palabra2 = "asset_id";
                        String palabra3 = "source";
                        String palabra4 = "published_date";
                        String palabra5 = "updated";
                        String palabra6 = "section";
                        String palabra7 = "subsection";
                        String palabra8 = "nytsection";
                        String palabra9 = "adx_keywords";
                        
                        String palabra10 = "column";
                        String palabra11 = "byline";
                        String palabra12 = "type";
                        String palabra13 = "title";
                        String palabra14 = "abstract";
                        String palabra15 = "des_facet";
                        
                        String palabra16 = "org_facet";
                        String palabra17 = "per_facet";
                        String palabra18 = "geo_facet";

                        String palabra19 = "media";
                        String palabra19t = "type";
                        String palabra19s = "sybtype";
                        String palabra19c = "caption";
                        String palabra19cp = "copyright";
                        String palabra19afs = "approved_for_syndication";


                        String palabra20 = "media-metadata";
                        String palabra20u = "url";
                        String palabra20h = "height";
                        String palabra20w = "width";
                        String palabra20f = "width";

                        for(int i = 0; i < partes.length; i++){
                            
                            if(palabra0.equals(partes[i])){
                            
                                String x = partes[i+2];
                            }else if(palabra1.equals(partes[i])){
                            
                                String x1 = partes[i+2];
                            }else if(palabra2.equals(partes[i])){
                            
                                String x2 = partes[i+1].replace(":", "").replace(",", "");

                            }else if(palabra3.equals(partes[i])){
                            
                                String x3 = partes[i+1].replace(":", "").replace(",", "");

                            }else if(palabra4.equals(partes[i])){
                            
                                String x4 = partes[i+2];

                            }else if(palabra5.equals(partes[i])){
                            
                                String x5 = partes[i+2];

                            }else if(palabra6.equals(partes[i])){
                            
                                String x6 = partes[i+2];

                            }else if(palabra7.equals(partes[i])){
                            
                                String x7 = partes[i+2];

                            }else if(palabra8.equals(partes[i])){
                            
                                String x8 = partes[i+2];

                            }else if(palabra9.equals(partes[i])){
                            
                                String x9 = partes[i+2];
                                if(dospuntos.equals(partes[i+1])){
                                    val=true;
                                    j = i;
                                }
                                while((val==true)){
                                    /**
                                     * 
                                     *              AÑADIR
                                     * 
                                     */
                                    String x9a = partes[j];
                                    
                                    if(coma.equals(partes[j])){
                                        val = false;
                                    }
                                    j++;
                                }

                            }else if(palabra10.equals(partes[i])){
                            
                                String x10 = partes[i+1].replace(":", "").replace(",", "");

                            }else if(palabra11.equals(partes[i])){
                            
                                String x11 = partes[i+2];

                            }else if(palabra12.equals(partes[i])){
                            
                                String x12 = partes[i+2];

                            }else if(palabra13.equals(partes[i])){
                            
                                String x13 = partes[i+2];

                            }else if(palabra14.equals(partes[i])){
                            
                                String x14 = partes[i+2];

                            }else if(palabra15.equals(partes[i])){
                                
                                val=true;
                                j=i;
                                String x15 = partes[i+2];
                                
                                while((val==true)){
                                    if(coma.equals(partes[j])){
                                        
                                    }else if(cierre.equals(partes[j])){
                                        
                                        /*
                                        *
                                        *
                                        *
                                        */
                                        
                                        //partes[j-1];
                                        
                                        /**
                                         * 
                                         *          CIERRE
                                         * 
                                         */
                                        
                                        val=false;
                                    }else{
                                        /**
                                         * 
                                         *          AÑADIR
                                         * 
                                        */
                                    }
                                    j++;
                                }

                            }else if(palabra16.equals(partes[i])){
                            
                                String x16 = partes[i+1].replace(":[", "").replace("],", "");

                            }else if(palabra17.equals(partes[i])){
                            
                                String x17 = partes[i+1].replace(":[", "").replace("],", "");

                            }else if(palabra18.equals(partes[i])){
                            
                                String x18 = partes[i+1].replace(":[", "").replace("],", "");

                            }else if(palabra19.equals(partes[i])){
                                val=true;
                                j=i;
                                String x19 = partes[i+2];
                                
                                while((val==true)){
                                    if(palabra19t.equals(partes[j])){
                                        
                                        String x19t = partes[j+2];
                                    }else if(palabra19s.equals(partes[j])){
                                        
                                        String x19s = partes[j+2];
                                        
                                    }else if(palabra19c.equals(partes[j])){
                                        
                                        String x19c = partes[j+2];
                                        
                                    }else if(palabra19cp.equals(partes[j])){
                                        
                                        String x19cp = partes[j+2];
                                        
                                    }else if(palabra19afs.equals(partes[j])){
                                        
                                        String x19afs = partes[j+2];
                                        
                                    }else if(palabra20.equals(partes[j])){
                                        val=false;
                                    }
                                    j++;
                                }
                            }else if(palabra20.equals(partes[i])){
                                val=true;
                                j=i;
                                String x20 = partes[i+2];
                                while((val==true)){
                                    if(palabra20u.equals(partes[j])){
                                        
                                        String x20u = partes[j+2];
                                    }else if(palabra20h.equals(partes[j])){
                                        
                                        String x20h = partes[j+1].replace(":", "").replace(",", "");
                                        
                                    }else if(palabra20w.equals(partes[j])){
                                        
                                        String x20w = partes[j+1].replace(":", "").replace(",", "");
                                        
                                    }else if(palabra20f.equals(partes[j])){
                                        
                                        String x20f = partes[j+2];
                                        
                                    }
                                    
                                }
                            }


                        }

                    }
                    

                }catch(Exception ex){

                ex.printStackTrace();

                }
                
        String url = "https://api.nytimes.com/svc/archive/v1/2024/1.json?api-key=ca5zm70vrlPdm8zRBlHDQZzPmucXD5Lc";
        ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);
    
        List<Map<String, Object>> resultados = (List<Map<String, Object>>) response.getBody().get("results");
        
        for(Map<String, Object> item : resultados){
            /**
             * 
             *          FRAGMENTO
             * 
             */
            Fragmento frg = new Fragmento();
            
            frg.setTitulo((String) item.get("title"));
            frg.setabstracto((String) item.get("abstract"));
            
            fragmentoRepository.save(frg);
            
            Referencia rf = new Referencia();
            rf.setfuente((String) item.get("source"));
            
            referenciaRepository.save(rf);
            
            DireccionesUrl durl = new DireccionesUrl();
            DireccionesUri duri = new DireccionesUri();
            
            durl.setnombreUrl((String) item.get("Uri"));
            duri.setdireccionUri((String) item.get("Url"));
            
            direccionesUriRepository.save(duri);
            direccionesUrlRepository.save(durl);
            
            /**
             * 
             *              FECHA
             * 
             */
            
            /**
            FechaP fecha = new FechaP();
            
            fecha.setpub_date((D));
            */
            
            Seccion sc = new Seccion();
            SubSeccion sbsc = new SubSeccion();
            
            sc.setNombreSeccion((String) item.get("section"));
            sbsc.setNombreSeccion((String) item.get("subsection"));

            seccionRepository.save(sc);
            subSeccionRepository.save(sbsc);
            
            Estrellas str = new Estrellas();
            
            str.setnombre((String) item.get("adx_keywords"));
            estrellasRepository.save(str);
            
            Tematica tm = new Tematica();
            Entidad ent = new Entidad();
            
            tm.setnombreTematica((String) item.get("des_facet"));
            ent.setnombreEntidad((String) item.get("org_facet"));
            
            entidadesRepository.save(ent);
            tematicaRepository.save(tm);
            
        }
        
        return "La buenaaa";
   }
    
    public String cargarDesdeApiTopStories(){
        /***
         * 
         *              RECORRIDO PARA HACER EL PROCEDIMIENTO MAS AGIL
         * 
         * 
        int fechafinal = 2025;
        for(int fechainicio= 1851; fechainicio<fechafinal;fechainicio++){
            
        String url1 = "https://api.nytimes.com/svc/archive/v1/"+fechainicio+"/1.json?api-key=ca5zm70vrlPdm8zRBlHDQZzPmucXD5Lc";
        
        }
        * 
        ***/
        
        String url = "https://api.nytimes.com/svc/archive/v1/2024/1.json?api-key=ca5zm70vrlPdm8zRBlHDQZzPmucXD5Lc";
        ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);
    
        List<Map<String, Object>> resultados = (List<Map<String, Object>>) response.getBody().get("results");
        
        for(Map<String, Object> item : resultados){
            Fragmento frag = new Fragmento();
            
            frag.setTitulo((String) item.get("title"));
            frag.setabstracto((String) item.get("abstract"));
            
            fragmentoRepository.save(frag);
            
            
            Seccion sc = new Seccion();
            SubSeccion sbsc = new SubSeccion();
            SeccionFragmento scfrg = new SeccionFragmento();
            
            sc.setNombreSeccion((String) item.get("section"));
            sbsc.setNombreSeccion((String) item.get("subsection"));
            
            seccionRepository.save(sc);
            subSeccionRepository.save(sbsc);
            
            scfrg.setidFragmento(frag);
            scfrg.setidSeccion(sc);
            
            seccionFragmentoRepository.save(scfrg);
            
            
            DireccionesUrl durl = new DireccionesUrl();
            DireccionesUri duri = new DireccionesUri();
            
            durl.setnombreUrl((String) item.get("Url"));
            duri.setdireccionUri((String) item.get("Uri"));
            
            direccionesUrlRepository.save(durl);
            direccionesUriRepository.save(duri);
            
            /**
             * 
             *              FECHA
             * 
             */
            
            FechaP fecha = new FechaP();
            
            
            Kicker kicker = new Kicker();
            kicker.setnombre((String) item.get("Kicker"));
            kickerRepository.save(kicker);
            
            Tematica tm = new Tematica();
            tm.setnombreTematica((String) item.get("des_facet"));
            tematicaRepository.save(tm);
            
            TematicaFragmento tmfrag = new TematicaFragmento();
            tmfrag.setidFragmento(frag);
            tmfrag.setidTematica(tm);
            tematicaFragmentoRepository.save(tmfrag);
            
            Entidad ent = new Entidad();
            ent.setnombreEntidad((String) item.get("org_facet"));
            entidadesRepository.save(ent);
            
            EntidadesFragmento entfrag = new EntidadesFragmento();
            entfrag.setidEntidad(ent);
            entfrag.setidFragmento(frag);
            entidadesFragmentoRepository.save(entfrag);
            
        }
        return "La buenaa";
    }
    
    public Fragmento guardar(@RequestBody Fragmento articulo){
        return fragmentoRepository.save(articulo);
    }
    
    public List<Fragmento> listar(){
        return fragmentoRepository.findAll();
    }
    
    //
    //          NO QUIEROOOOOOOOOOOO
    //
    
    public Fragmento buscar(long id){
        return fragmentoRepository.findById(id).orElseThrow();
    }
    
    public Fragmento actualizar(long id, Fragmento resumen){
        Fragmento fragmento = fragmentoRepository.findById(id).orElseThrow();
        fragmento.setResumen(resumen.getResumen());
        return fragmentoRepository.save(fragmento);
    }
    
}
