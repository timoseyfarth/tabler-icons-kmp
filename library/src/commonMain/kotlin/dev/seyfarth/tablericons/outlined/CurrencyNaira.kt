package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CurrencyNaira: ImageVector
    get() {
        if (_CurrencyNaira != null) {
            return _CurrencyNaira!!
        }
        _CurrencyNaira = ImageVector.Builder(
            name = "Filled.CurrencyNaira",
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
                moveTo(7f, 18f)
                verticalLineToRelative(-10.948f)
                arcToRelative(1.05f, 1.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.968f, -0.51f)
                lineToRelative(6.064f, 10.916f)
                arcToRelative(1.05f, 1.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.968f, -0.51f)
                verticalLineToRelative(-10.948f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 10f)
                horizontalLineToRelative(14f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 14f)
                horizontalLineToRelative(14f)
            }
        }.build()

        return _CurrencyNaira!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyNaira: ImageVector? = null
