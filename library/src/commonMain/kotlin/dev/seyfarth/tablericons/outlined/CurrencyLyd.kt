package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CurrencyLyd: ImageVector
    get() {
        if (_CurrencyLyd != null) {
            return _CurrencyLyd!!
        }
        _CurrencyLyd = ImageVector.Builder(
            name = "Filled.CurrencyLyd",
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
                moveTo(11f, 15f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 5f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineToRelative(-2.764f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.789f, -1.106f)
                lineToRelative(-0.447f, -0.894f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 8f)
                lineToRelative(2.773f, 4.687f)
                curveToRelative(0.427f, 0.697f, 0.234f, 1.626f, -0.43f, 2.075f)
                arcToRelative(1.38f, 1.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.773f, 0.238f)
                horizontalLineToRelative(-2.224f)
                arcToRelative(0.93f, 0.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.673f, -0.293f)
                lineToRelative(-0.673f, -0.707f)
            }
        }.build()

        return _CurrencyLyd!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyLyd: ImageVector? = null
