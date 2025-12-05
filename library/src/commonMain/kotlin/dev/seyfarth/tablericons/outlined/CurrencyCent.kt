package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CurrencyCent: ImageVector
    get() {
        if (_CurrencyCent != null) {
            return _CurrencyCent!!
        }
        _CurrencyCent = ImageVector.Builder(
            name = "Filled.CurrencyCent",
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
                moveTo(16.007f, 7.54f)
                arcToRelative(5.965f, 5.965f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.008f, -1.54f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.992f, 6f)
                curveToRelative(0f, 3.314f, 2.682f, 6f, 5.992f, 6f)
                arcToRelative(5.965f, 5.965f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -1.536f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 20f)
                verticalLineToRelative(-2f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 6f)
                verticalLineToRelative(-2f)
            }
        }.build()

        return _CurrencyCent!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyCent: ImageVector? = null
