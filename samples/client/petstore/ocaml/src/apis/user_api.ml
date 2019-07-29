(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

let create_user body =
    let open Lwt in
    let uri = Request.build_uri "/user" in
    let headers = Request.default_headers in
    let body = Request.write_json_body User.to_yojson body in
    Cohttp_lwt_unix.Client.call `POST uri ~headers ~body >>= fun (resp, body) ->
    Request.handle_unit_response resp

let create_users_with_array_input body =
    let open Lwt in
    let uri = Request.build_uri "/user/createWithArray" in
    let headers = Request.default_headers in
    let body = Request.write_json_body (JsonSupport.of_list_of User.to_yojson) body in
    Cohttp_lwt_unix.Client.call `POST uri ~headers ~body >>= fun (resp, body) ->
    Request.handle_unit_response resp

let create_users_with_list_input body =
    let open Lwt in
    let uri = Request.build_uri "/user/createWithList" in
    let headers = Request.default_headers in
    let body = Request.write_json_body (JsonSupport.of_list_of User.to_yojson) body in
    Cohttp_lwt_unix.Client.call `POST uri ~headers ~body >>= fun (resp, body) ->
    Request.handle_unit_response resp

let delete_user username =
    let open Lwt in
    let uri = Request.build_uri "/user/{username}" in
    let headers = Request.default_headers in
    let uri = Request.replace_path_param uri "username" (username) in
    Cohttp_lwt_unix.Client.call `DELETE uri ~headers >>= fun (resp, body) ->
    Request.handle_unit_response resp

let get_user_by_name username =
    let open Lwt in
    let uri = Request.build_uri "/user/{username}" in
    let headers = Request.default_headers in
    let uri = Request.replace_path_param uri "username" (username) in
    Cohttp_lwt_unix.Client.call `GET uri ~headers >>= fun (resp, body) ->
    Request.read_json_body_as (JsonSupport.unwrap User.of_yojson) resp body

let login_user username password =
    let open Lwt in
    let uri = Request.build_uri "/user/login" in
    let headers = Request.default_headers in
    let uri = Uri.add_query_param' uri ("username", username) in
    let uri = Uri.add_query_param' uri ("password", password) in
    Cohttp_lwt_unix.Client.call `GET uri ~headers >>= fun (resp, body) ->
    Request.read_json_body_as (JsonSupport.to_string) resp body

let logout_user () =
    let open Lwt in
    let uri = Request.build_uri "/user/logout" in
    let headers = Request.default_headers in
    Cohttp_lwt_unix.Client.call `GET uri ~headers >>= fun (resp, body) ->
    Request.handle_unit_response resp

let update_user username body =
    let open Lwt in
    let uri = Request.build_uri "/user/{username}" in
    let headers = Request.default_headers in
    let uri = Request.replace_path_param uri "username" (username) in
    let body = Request.write_json_body User.to_yojson body in
    Cohttp_lwt_unix.Client.call `PUT uri ~headers ~body >>= fun (resp, body) ->
    Request.handle_unit_response resp

