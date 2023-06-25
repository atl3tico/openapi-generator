// <auto-generated>
/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.ComponentModel.DataAnnotations;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Fruit
    /// </summary>
    public partial class Fruit : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Fruit" /> class.
        /// </summary>
        /// <param name="apple"></param>
        /// <param name="cultivar">cultivar</param>
        /// <param name="lengthCm">lengthCm</param>
        /// <param name="origin">origin</param>
        /// <param name="color">color</param>
        [JsonConstructor]
        public Fruit(Apple apple, string cultivar, decimal lengthCm, string origin, string color)
        {
            Apple = apple;
            Cultivar = cultivar;
            LengthCm = lengthCm;
            Origin = origin;
            Color = color;
            OnCreated();
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="Fruit" /> class.
        /// </summary>
        /// <param name="banana"></param>
        /// <param name="cultivar">cultivar</param>
        /// <param name="lengthCm">lengthCm</param>
        /// <param name="origin">origin</param>
        /// <param name="color">color</param>
        [JsonConstructor]
        public Fruit(Banana banana, string cultivar, decimal lengthCm, string origin, string color)
        {
            Banana = banana;
            Cultivar = cultivar;
            LengthCm = lengthCm;
            Origin = origin;
            Color = color;
            OnCreated();
        }

        partial void OnCreated();

        /// <summary>
        /// Gets or Sets Apple
        /// </summary>
        public Apple Apple { get; set; }

        /// <summary>
        /// Gets or Sets Banana
        /// </summary>
        public Banana Banana { get; set; }

        /// <summary>
        /// Gets or Sets Cultivar
        /// </summary>
        [JsonPropertyName("cultivar")]
        public string Cultivar { get; set; }

        /// <summary>
        /// Gets or Sets LengthCm
        /// </summary>
        [JsonPropertyName("lengthCm")]
        public decimal LengthCm { get; set; }

        /// <summary>
        /// Gets or Sets Origin
        /// </summary>
        [JsonPropertyName("origin")]
        public string Origin { get; set; }

        /// <summary>
        /// Gets or Sets Color
        /// </summary>
        [JsonPropertyName("color")]
        public string Color { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Fruit {\n");
            sb.Append("  Color: ").Append(Color).Append("\n");
            sb.Append("  Cultivar: ").Append(Cultivar).Append("\n");
            sb.Append("  LengthCm: ").Append(LengthCm).Append("\n");
            sb.Append("  Origin: ").Append(Origin).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            // Cultivar (string) pattern
            Regex regexCultivar = new Regex(@"^[a-zA-Z\s]*$", RegexOptions.CultureInvariant);
            if (false == regexCultivar.Match(this.Cultivar).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Cultivar, must match a pattern of " + regexCultivar, new [] { "Cultivar" });
            }

            // Origin (string) pattern
            Regex regexOrigin = new Regex(@"^[A-Z\s]*$", RegexOptions.CultureInvariant | RegexOptions.IgnoreCase);
            if (false == regexOrigin.Match(this.Origin).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Origin, must match a pattern of " + regexOrigin, new [] { "Origin" });
            }

            yield break;
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="Fruit" />
    /// </summary>
    public class FruitJsonConverter : JsonConverter<Fruit>
    {
        /// <summary>
        /// Deserializes json to <see cref="Fruit" />
        /// </summary>
        /// <param name="utf8JsonReader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <returns></returns>
        /// <exception cref="JsonException"></exception>
        public override Fruit Read(ref Utf8JsonReader utf8JsonReader, Type typeToConvert, JsonSerializerOptions jsonSerializerOptions)
        {
            int currentDepth = utf8JsonReader.CurrentDepth;

            if (utf8JsonReader.TokenType != JsonTokenType.StartObject && utf8JsonReader.TokenType != JsonTokenType.StartArray)
                throw new JsonException();

            JsonTokenType startingTokenType = utf8JsonReader.TokenType;

            string cultivar = default;
            decimal? lengthCm = default;
            string origin = default;
            string color = default;

            while (utf8JsonReader.Read())
            {
                if (startingTokenType == JsonTokenType.StartObject && utf8JsonReader.TokenType == JsonTokenType.EndObject && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (startingTokenType == JsonTokenType.StartArray && utf8JsonReader.TokenType == JsonTokenType.EndArray && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (utf8JsonReader.TokenType == JsonTokenType.PropertyName && currentDepth == utf8JsonReader.CurrentDepth - 1)
                {
                    string propertyName = utf8JsonReader.GetString();
                    utf8JsonReader.Read();

                    switch (propertyName)
                    {
                        case "cultivar":
                            cultivar = utf8JsonReader.GetString();
                            break;
                        case "lengthCm":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                lengthCm = utf8JsonReader.GetDecimal();
                            break;
                        case "origin":
                            origin = utf8JsonReader.GetString();
                            break;
                        case "color":
                            color = utf8JsonReader.GetString();
                            break;
                        default:
                            break;
                    }
                }
            }

            if (cultivar == null)
                throw new ArgumentNullException(nameof(cultivar), "Property is required for class Fruit.");

            if (lengthCm == null)
                throw new ArgumentNullException(nameof(lengthCm), "Property is required for class Fruit.");

            if (origin == null)
                throw new ArgumentNullException(nameof(origin), "Property is required for class Fruit.");

            if (color == null)
                throw new ArgumentNullException(nameof(color), "Property is required for class Fruit.");

            Utf8JsonReader appleReader = utf8JsonReader;
            if (Client.ClientUtils.TryDeserialize<Apple>(ref appleReader, jsonSerializerOptions, out Apple apple))
                return new Fruit(apple, cultivar, lengthCm.Value, origin, color);

            Utf8JsonReader bananaReader = utf8JsonReader;
            if (Client.ClientUtils.TryDeserialize<Banana>(ref bananaReader, jsonSerializerOptions, out Banana banana))
                return new Fruit(banana, cultivar, lengthCm.Value, origin, color);

            throw new JsonException();
        }

        /// <summary>
        /// Serializes a <see cref="Fruit" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="fruit"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public override void Write(Utf8JsonWriter writer, Fruit fruit, JsonSerializerOptions jsonSerializerOptions)
        {
            System.Text.Json.JsonSerializer.Serialize(writer, fruit.Apple, jsonSerializerOptions);

            System.Text.Json.JsonSerializer.Serialize(writer, fruit.Banana, jsonSerializerOptions);

            writer.WriteStartObject();

            writer.WriteString("cultivar", fruit.Cultivar);
            writer.WriteNumber("lengthCm", fruit.LengthCm);
            writer.WriteString("origin", fruit.Origin);
            writer.WriteString("color", fruit.Color);

            writer.WriteEndObject();
        }
    }
}