<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reminder</title>
<html>
	<head>
		<meta charset="UTF-8">
		<title>REMINDER APP</title>
		<link rel="stylesheet" href="/css/styles.css" />
	</head>
	<body>
		<div id="bodyWrapper">
			<div class="innerWrapper">
			
				<section id="header">
					<h1>Reminder App</h1>
					<ul id="mainMenu">
					  <li><a href="home.jsp">Inicio</a></li>
					  <li><a class="active" href="/newEmployee.jsp">Empleados</a></li>
					  <li><a href="#">Clientes</a></li>
					  <li><a href="#">Cerrar Sesión</a></li>
					</ul>
				</section>
			
				
				<section id="genericSection">
					<h2>Nuevo Empleado</h2>
					<form action="./EmpleadoServlet" method="post" id="formulario">
						<div class="form-group-wrapper">
							<span class="form-group">
								<label for="name">Nombre</label>
								<input type="text" name="nombre" id="nombre" required/>
							</span>
							<span class="form-group">
								<label for="apellidos">Apellido</label>
								<input type="text" name="apellidos" id="apellidos" required/>
							</span>
                                                       <span class="form-group">
								<label for="cedula">cedula</label>
								<input type="text" name="cedula" id="cedula" required/>
							</span>
                                                        <span class="form-group">
								<label for="correo">correo electronico</label>
								<input type="email" name="correo" id="correo" required/>
							</span>
                                                        <span class="form-group">
								<label for="telefono">telefono</label>
								<input type="text" name="telefono" id="telefono" required/>
							</span>
                                                        <span class="form-group">
                                                            
                                                       <datalist id="estado">
                                                            <option value="Activo">
                                                            <option value="Inactivo">
                                                            </datalist>
                                                            <label for="estado">Estado</label>
                                                            <input type="text" name="estado" id="estado" list="estado" required/>
                                                         </span>       
						</div>
                                <h2>Direccion</h2>
					 <div class="form-group-wrapper">
                                               <span class="form-group">
                                                    <label for="combo_paises">Pais</label>  
                                                        <select name="combo_Paises" id="comPais">
 
                                                            <option selected="selected" value="1">Republica Dominicana</option>
                                                            <option value="2">Afganistan</option>
                                                            <option value="3">Africa Central</option>
                                                            <option value="4">Albania</option>
                                                            <option value="5">Alemania</option>
                                                            <option value="6">Andorra</option>
                                                            <option value="7">Angola</option>
                                                            <option value="8">Anguilla</option>
                                                            <option value="9">Antartida</option>
                                                            <option value="10">Antigua y Barbuda</option>
                                                            <option value="11">Arabia Saudita</option>
                                                            <option value="12">Argelia</option>
                                                            <option value="13">Argentina</option>
                                                            <option value="14">Armenia</option>
                                                            <option value="15">Aruba</option>
                                                            <option value="16">Australia</option>
                                                            <option value="17">Austria</option>
                                                            <option value="18">Azerbaiyan</option>
                                                            <option value="19">Bahamas</option>
                                                            <option value="20">Bahrein</option>
                                                            <option value="21">Bangladesh</option>
                                                            <option value="22">Barbados</option>
                                                            <option value="23">Bielorrusia</option>
                                                            <option value="24">Belgica</option>
                                                            <option value="25">Belice</option>
                                                            <option value="26">Benin</option>
                                                            <option value="27">Bermuda</option>
                                                            <option value="28">Butan</option>
                                                            <option value="29">Bolivia</option>
                                                            <option value="30">Bosnia y Herzegovina</option>
                                                            <option value="31">Botswana</option>
                                                            <option value="32">Brasil</option>
                                                            <option value="33">Brunei</option>
                                                            <option value="34">Bulgaria</option>
                                                            <option value="35">Burkina Faso</option>
                                                            <option value="36">Burundi</option>
                                                            <option value="37">Camboya</option>
                                                            <option value="38">Camerun</option>
                                                            <option value="39">Canada</option>
                                                            <option value="40">Cabo Verde</option>
                                                            <option value="41">Ciudad del Vaticano</option>
                                                            <option value="42">Chad</option>
                                                            <option value="43">Chile</option>
                                                            <option value="44">China</option>
                                                            <option value="45">Colombia</option>
                                                            <option value="46">Comoras</option>
                                                            <option value="47">Congo</option>
                                                            <option value="48">Corea del Norte</option>
                                                            <option value="49">Corea del Sur</option>
                                                            <option value="50">Costa Rica</option>
                                                            <option value="51">Costa de Marfil</option>
                                                            <option value="52">Croacia</option>
                                                            <option value="53">Cuba</option>
                                                            <option value="54">Chipre</option>
                                                            <option value="55">Dinamarca</option>
                                                            <option value="56">Dominica</option>
                                                            <option value="57">Ecuador</option>
                                                            <option value="58">Egipto</option>
                                                            <option value="59">El Salvador</option>
                                                            <option value="60">Emiratos Arabes</option>
                                                            <option value="61">Eritrea</option>
                                                            <option value="62">Eslovaquia</option>
                                                            <option value="63">Eslovenia</option>
                                                            <option value="64">Espa&#241;a</option>
                                                            <option value="65">Estados Unidos</option>
                                                            <option value="66">Estonia</option>
                                                            <option value="67">Etiopia</option>
                                                            <option value="68">Fiji</option>
                                                            <option value="69">Filipinas</option>
                                                            <option value="70">Finlandia</option>
                                                            <option value="71">Francia</option>
                                                            <option value="72">Gabon</option>
                                                            <option value="73">Gambia</option>
                                                            <option value="74">Georgia</option>
                                                            <option value="75">Ghana</option>
                                                            <option value="76">Gibraltar</option>
                                                            <option value="77">Grecia</option>
                                                            <option value="78">Granada</option>
                                                            <option value="79">Groenlandia</option>
                                                            <option value="80">Guadalupe</option>
                                                            <option value="81">Guam</option>
                                                            <option value="82">Guatemala</option>
                                                            <option value="83">Guinea</option>
                                                            <option value="84">Guinea-bissau</option>
                                                            <option value="85">Guinea Ecuatorial</option>
                                                            <option value="86">Guyana</option>
                                                            <option value="87">Guyana Francesa</option>
                                                            <option value="88">Haiti</option>
                                                            <option value="89">Holanda</option>
                                                            <option value="90">Honduras</option>
                                                            <option value="91">Hong Kong</option>
                                                            <option value="92">Hungria</option>
                                                            <option value="93">India</option>
                                                            <option value="94">Indonesia</option>
                                                            <option value="95">Iran</option>
                                                            <option value="96">Irak</option>
                                                            <option value="97">Irlanda</option>
                                                            <option value="98">Isla Bouvet</option>
                                                            <option value="99">Isla de Coco</option>
                                                            <option value="100">Isla de Navidad</option>
                                                            <option value="101">Isla de Pascua</option>
                                                            <option value="102">Isla Norfolk</option>
                                                            <option value="103">Islandia</option>
                                                            <option value="104">Islas Cayman</option>
                                                            <option value="105">Islas Cook</option>
                                                            <option value="106">Islas Feroe</option>
                                                            <option value="107">Islas Heard y McDonald</option>
                                                            <option value="108">Islas Malvinas</option>
                                                            <option value="109">Islas Marianas del Norte</option>
                                                            <option value="110">Islas Marshall</option>
                                                            <option value="111">Islas Pitcairn</option>
                                                            <option value="112">Islas Salomon</option>
                                                            <option value="113">Islas Turcas y Caicos</option>
                                                            <option value="114">Islas Virgenes</option>
                                                            <option value="115">Israel</option>
                                                            <option value="116">Italia</option>
                                                            <option value="117">Jamaica</option>
                                                            <option value="118">Japon</option>
                                                            <option value="119">Jordania</option>
                                                            <option value="120">Kazakhstan</option>
                                                            <option value="121">Kenia</option>
                                                            <option value="122">Kiribati</option>
                                                            <option value="123">Kosovo</option>
                                                            <option value="124">Kuwait</option>
                                                            <option value="125">Kirguistan</option>
                                                            <option value="126">Laos</option>
                                                            <option value="127">Letonia</option>
                                                            <option value="128">Libano</option>
                                                            <option value="129">Lesoto</option>
                                                            <option value="130">Liberia</option>
                                                            <option value="131">Libia</option>
                                                            <option value="132">Liechtenstein</option>
                                                            <option value="133">Lituania</option>
                                                            <option value="134">Luxemburgo</option>
                                                            <option value="135">Macao</option>
                                                            <option value="136">Macedonia</option>
                                                            <option value="137">Madagascar</option>
                                                            <option value="138">Malawi</option>
                                                            <option value="139">Malasia</option>
                                                            <option value="140">Maldivas</option>
                                                            <option value="141">Mali</option>
                                                            <option value="142">Malta</option>
                                                            <option value="143">Martinica</option>
                                                            <option value="144">Mauritania</option>
                                                            <option value="145">Mauricio</option>
                                                            <option value="146">Mayotte</option>
                                                            <option value="147">Mexico</option>
                                                            <option value="148">Micronesia</option>
                                                            <option value="149">Moldavia</option>
                                                            <option value="150">Monaco</option>
                                                            <option value="151">Mongolia</option>
                                                            <option value="152">Montenegro</option>
                                                            <option value="153">Montserrat</option>
                                                            <option value="154">Marruecos</option>
                                                            <option value="155">Mozambique</option>
                                                            <option value="156">Myanmar</option>
                                                            <option value="157">Namibia</option>
                                                            <option value="158">Nauru</option>
                                                            <option value="159">Nepal</option>
                                                            <option value="160">Nicaragua</option>
                                                            <option value="161">Niger</option>
                                                            <option value="162">Nigeria</option>
                                                            <option value="163">Niue</option>
                                                            <option value="164">Noruega</option>
                                                            <option value="165">Nueva Caledonia</option>
                                                            <option value="166">Nueva Zelanda</option>
                                                            <option value="167">Oman</option>
                                                            <option value="168">Pakistan</option>
                                                            <option value="169">Palau</option>
                                                            <option value="170">Palestina</option>
                                                            <option value="171">Panama</option>
                                                            <option value="172">Papua Nueva Guinea</option>
                                                            <option value="173">Paraguay</option>
                                                            <option value="174">Peru</option>
                                                            <option value="175">Polinesia Francesa</option>
                                                            <option value="176">Polonia</option>
                                                            <option value="177">Portugal</option>
                                                            <option value="178">Puerto Rico</option>
                                                            <option value="179">Qatar</option>
                                                            <option value="180">Republica Checa</option>
                                                            <option value="181">Republica Dominicana</option>
                                                            <option value="182">Reino Unido</option>
                                                            <option value="183">Reunion</option>
                                                            <option value="184">Rumania</option>
                                                            <option value="185">Rusia</option>
                                                            <option value="186">Ruanda</option>
                                                            <option value="187">Sahara Occidental</option>
                                                            <option value="188">Samoa</option>
                                                            <option value="189">Santa Helena</option>
                                                            <option value="190">San Cristobal y Nieves</option>
                                                            <option value="191">Santa Lucia</option>
                                                            <option value="192">San Pedro y Miguelon</option>
                                                            <option value="193">San Vicente y las Granadinas</option>
                                                            <option value="194">Samoa</option>
                                                            <option value="195">San Marino</option>
                                                            <option value="196">Santo Tome y Principe</option>
                                                            <option value="197">Senegal</option>
                                                            <option value="198">Serbia y Montenegro</option>
                                                            <option value="199">Seychelles</option>
                                                            <option value="200">Sierra Leona</option>
                                                            <option value="201">Singapur</option>
                                                            <option value="202">Siria</option>
                                                            <option value="203">Somalia</option>
                                                            <option value="204">Sri Lanka</option>
                                                            <option value="205">Sudafrica</option>
                                                            <option value="206">Sudan</option>
                                                            <option value="207">Surinam</option>
                                                            <option value="208">Suazilandia</option>
                                                            <option value="209">Suecia</option>
                                                            <option value="210">Suiza</option>
                                                            <option value="211">Taiwan</option>
                                                            <option value="212">Tayikistan</option>
                                                            <option value="213">Tanzania</option>
                                                            <option value="214">Tailandia</option>
                                                            <option value="215">Timor Oriental</option>
                                                            <option value="216">Togo</option>
                                                            <option value="217">Tokelau</option>
                                                            <option value="218">Tonga</option>
                                                            <option value="219">Trinidad y Tobago</option>
                                                            <option value="220">Tunez</option>
                                                            <option value="221">Turquia</option>
                                                            <option value="222">Turkey</option>
                                                            <option value="223">Turkmenistan</option>
                                                            <option value="224">Tuvalu</option>
                                                            <option value="225">Uganda</option>
                                                            <option value="226">Ukrania</option>
                                                            <option value="227">Uruguay</option>
                                                            <option value="228">Uzbekistan</option>
                                                            <option value="229">Vanuatu</option>
                                                            <option value="230">Venezuela</option>
                                                            <option value="231">Vietnam</option>
                                                            <option value="232">Wallis y Futuna</option>
                                                            <option value="233">Yemen</option>
                                                            <option value="234">Yibuti</option>
                                                            <option value="235">Zambia</option>
                                                            <option value="236">Zimbaue</option>
                                                            <option value="237">Otro</option>
                                                    </select>   
                                               </span>
                                            </div>
                                            
                                            <span class="form-group">
				         <label for="provincia">Provincia</label>
                                                <select name="combo_Provincia" id="comProv" required>

                                                        <option value="1">Distrito Nacional</option>
                                                        <option value="2">Santo Domingo</option>
                                                        <option value="3">San Cristóbal</option>
                                                        <option value="4">La Romana</option>
                                                        <option value="5">Santiago</option>
                                                        <option value="6">Peravia</option>
                                                        <option value="7">San Pedro de Macorís</option>
                                                        <option value="8">Hermanas Mirabal</option>
                                                        <option value="9">Valverde</option>
                                                        <option value="10">Antigua y Barbuda</option>
                                                        <option value="11">Puerto Plata</option>
                                                        <option value="12">Duarte</option>
                                                        <option value="13">La Vega</option>
                                                        <option value="14">Monseñor Nouel</option>
                                                        <option value="15">Sánchez Ramírez</option>
                                                        <option value="16">Samaná</option>
                                                        <option value="17">María Trinidad Sánchez</option>
                                                        <option value="18">Barahona</option>
                                                        <option value="19">La Altagracia</option>
                                                        <option value="20">Azua</option>
                                                        <option value="21">Baoruco</option>
                                                        <option value="22">Monte Plata</option>
                                                        <option value="23">San José de Ocoa</option>
                                                        <option value="24">San Juan</option>
                                                        <option value="25">Hato Mayor</option>
                                                        <option value="26">Dajabón</option>
                                                        <option value="27">Monte Cristi</option>
                                                        <option value="28">Santiago Rodríguez</option>
                                                        <option value="29">El Seibo</option>
                                                        <option value="30">Elías Piña</option>
                                                        <option value="31">Independencia</option>
                                                        <option value="32">Pedernales</option>
                                                </select>
                                            </span>
                                            
                                           <span class="form-group">
                                               <label for="sector">sector</label>
                                                <input type="text" name="sector" id="sector" required/>
                                                   </span>
                                             <span class="form-group">
                                               <label for="calle">Calle/No./Apto</label>
                                                <input type="text" name="calle" id="calle" required/>
                                                   </span>
                                                <div class="form-group-wrapper">
                                                    <input type="submit" name="action" value="Enviar"/>

                                                    <input type="submit" name="action" value="Limpiar"/>
                                                </div>       
                                   </form>
                            </section> 
			</div>
                    <div><h3>${mensaje}</h3></div>
		</div>
	</body>
</html>