/*
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package petstoreserver

import (
	"encoding/json"
	"errors"
	"github.com/go-chi/chi/v5"
	"github.com/go-chi/chi/v5/middleware"
	"io/ioutil"
	"mime/multipart"
	"net/http"
	"os"
	"strconv"
	"strings"
)

// A Route defines the parameters for an api endpoint
type Route struct {
	Method	  string
	Pattern	 string
	HandlerFunc http.HandlerFunc
}

// Routes is a map of defined api endpoints
type Routes map[string]Route

// Router defines the required methods for retrieving api routes
type Router interface {
	Routes() Routes
}

const errMsgRequiredMissing = "required parameter is missing"

// NewRouter creates a new router for any number of api routers
func NewRouter(routers ...Router) chi.Router {
	router := chi.NewRouter()
	router.Use(middleware.Logger)
	for _, api := range routers {
		for _, route := range api.Routes() {
			var handler http.Handler
			handler = route.HandlerFunc
			router.Method(route.Method, route.Pattern, handler)
		}
	}

	return router
}

// EncodeJSONResponse uses the json encoder to write an interface to the http response with an optional status code
func EncodeJSONResponse(i interface{}, status *int, headers map[string][]string, w http.ResponseWriter) error {
	wHeader := w.Header()
	for key, values := range headers {
		for _, value := range values {
			wHeader.Add(key, value)
		}
	}
	wHeader.Set("Content-Type", "application/json; charset=UTF-8")
	if status != nil {
		w.WriteHeader(*status)
	} else {
		w.WriteHeader(http.StatusOK)
	}

	if i != nil {
		return json.NewEncoder(w).Encode(i)
	}

	return nil
}

// ReadFormFileToTempFile reads file data from a request form and writes it to a temporary file
func ReadFormFileToTempFile(r *http.Request, key string) (*os.File, error) {
	_, fileHeader, err := r.FormFile(key)
	if err != nil {
		return nil, err
	}

	return readFileHeaderToTempFile(fileHeader)
}

// ReadFormFilesToTempFiles reads files array data from a request form and writes it to a temporary files
func ReadFormFilesToTempFiles(r *http.Request, key string) ([]*os.File, error) {
	if err := r.ParseMultipartForm(32 << 20); err != nil {
		return nil, err
	}

	files := make([]*os.File, 0, len(r.MultipartForm.File[key]))

	for _, fileHeader := range r.MultipartForm.File[key] {
		file, err := readFileHeaderToTempFile(fileHeader)
		if err != nil {
			return nil, err
		}

		files = append(files, file)
	}

	return files, nil
}

// readFileHeaderToTempFile reads multipart.FileHeader and writes it to a temporary file
func readFileHeaderToTempFile(fileHeader *multipart.FileHeader) (*os.File, error) {
	formFile, err := fileHeader.Open()
	if err != nil {
		return nil, err
	}

	defer formFile.Close()

	fileBytes, err := ioutil.ReadAll(formFile)
	if err != nil {
		return nil, err
	}

	file, err := ioutil.TempFile("", fileHeader.Filename)
	if err != nil {
		return nil, err
	}

	defer file.Close()

	file.Write(fileBytes)

	return file, nil
}

// parseFloatParameter parses a string parameter to an int64.
func parseFloatParameter(param string, bitSize int, required bool) (float64, error) {
	if param == "" {
		if required {
			return 0, errors.New(errMsgRequiredMissing)
		}

		return 0, nil
	}

	return strconv.ParseFloat(param, bitSize)
}

// parseFloat64Parameter parses a string parameter to an float64.
func parseFloat64Parameter(param string, required bool) (float64, error) {
	return parseFloatParameter(param, 64, required)
}

// parseFloat32Parameter parses a string parameter to an float32.
func parseFloat32Parameter(param string, required bool) (float32, error) {
	val, err := parseFloatParameter(param, 32, required)
	return float32(val), err
}

// parseIntParameter parses a string parameter to an int64.
func parseIntParameter(param string, bitSize int, required bool) (int64, error) {
	if param == "" {
		if required {
			return 0, errors.New(errMsgRequiredMissing)
		}

		return 0, nil
	}

	return strconv.ParseInt(param, 10, bitSize)
}

// parseInt64Parameter parses a string parameter to an int64.
func parseInt64Parameter(param string, required bool) (int64, error) {
	return parseIntParameter(param, 64, required)
}

// parseInt32Parameter parses a string parameter to an int32.
func parseInt32Parameter(param string, required bool) (int32, error) {
	val, err := parseIntParameter(param, 32, required)
	return int32(val), err
}

// parseBoolParameter parses a string parameter to a bool
func parseBoolParameter(param string, required bool) (bool, error) {
	if param == "" {
		if required {
			return false, errors.New(errMsgRequiredMissing)
		}

		return false, nil
	}

	val, err := strconv.ParseBool(param)
	if err != nil {
		return false, err
	}

	return bool(val), nil
}

// parseFloat64ArrayParameter parses a string parameter containing array of values to []Float64.
func parseFloat64ArrayParameter(param, delim string, required bool) ([]float64, error) {
	if param == "" {
		if required {
			return nil, errors.New(errMsgRequiredMissing)
		}

		return nil, nil
	}

	str := strings.Split(param, delim)
	floats := make([]float64, len(str))

	for i, s := range str {
		if v, err := strconv.ParseFloat(s, 64); err != nil {
			return nil, err
		} else {
			floats[i] = v
		}
	}

	return floats, nil
}

// parseFloat32ArrayParameter parses a string parameter containing array of values to []float32.
func parseFloat32ArrayParameter(param, delim string, required bool) ([]float32, error) {
	if param == "" {
		if required {
			return nil, errors.New(errMsgRequiredMissing)
		}

		return nil, nil
	}

	str := strings.Split(param, delim)
	floats := make([]float32, len(str))

	for i, s := range str {
		if v, err := strconv.ParseFloat(s, 32); err != nil {
			return nil, err
		} else {
			floats[i] = float32(v)
		}
	}

	return floats, nil
}


// parseInt64ArrayParameter parses a string parameter containing array of values to []int64.
func parseInt64ArrayParameter(param, delim string, required bool) ([]int64, error) {
	if param == "" {
		if required {
			return nil, errors.New(errMsgRequiredMissing)
		}

		return nil, nil
	}

	str := strings.Split(param, delim)
	ints := make([]int64, len(str))

	for i, s := range str {
		if v, err := strconv.ParseInt(s, 10, 64); err != nil {
			return nil, err
		} else {
			ints[i] = v
		}
	}

	return ints, nil
}

// parseInt32ArrayParameter parses a string parameter containing array of values to []int32.
func parseInt32ArrayParameter(param, delim string, required bool) ([]int32, error) {
	if param == "" {
		if required {
			return nil, errors.New(errMsgRequiredMissing)
		}

		return nil, nil
	}

	str := strings.Split(param, delim)
	ints := make([]int32, len(str))

	for i, s := range str {
		if v, err := strconv.ParseInt(s, 10, 32); err != nil {
			return nil, err
		} else {
			ints[i] = int32(v)
		}
	}

	return ints, nil
}
