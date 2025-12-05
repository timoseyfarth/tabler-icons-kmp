package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandCinema4D: ImageVector
    get() {
        if (_BrandCinema4D != null) {
            return _BrandCinema4D!!
        }
        _BrandCinema4D = ImageVector.Builder(
            name = "Filled.BrandCinema4D",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.65f, 6.956f)
                arcToRelative(5.39f, 5.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.494f, 7.495f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                moveToRelative(-9f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, -18f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.7f, 12.137f)
                arcToRelative(5.738f, 5.738f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5.737f, -5.737f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.7f, 12.338f)
                verticalLineToRelative(-1.175f)
                curveToRelative(0f, -0.47f, 0.171f, -0.92f, 0.476f, -1.253f)
                arcToRelative(1.56f, 1.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.149f, -0.52f)
                curveToRelative(0.827f, 0f, 1.523f, 0.676f, 1.62f, 1.573f)
                curveToRelative(0.037f, 0.344f, 0.055f, 0.69f, 0.055f, 1.037f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.662f, 6.4f)
                horizontalLineToRelative(1.175f)
                curveToRelative(0.47f, 0f, 0.92f, -0.176f, 1.253f, -0.49f)
                curveToRelative(0.333f, -0.314f, 0.52f, -0.74f, 0.52f, -1.184f)
                curveToRelative(0f, -0.852f, -0.676f, -1.57f, -1.573f, -1.67f)
                arcToRelative(9.496f, 9.496f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.037f, -0.056f)
            }
        }.build()

        return _BrandCinema4D!!
    }

@Suppress("ObjectPropertyName")
private var _BrandCinema4D: ImageVector? = null
