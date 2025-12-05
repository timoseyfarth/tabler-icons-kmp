package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CurrencyFlorin: ImageVector
    get() {
        if (_CurrencyFlorin != null) {
            return _CurrencyFlorin!!
        }
        _CurrencyFlorin = ImageVector.Builder(
            name = "Filled.CurrencyFlorin",
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
                moveTo(8f, 12f)
                horizontalLineToRelative(8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 19f)
                curveToRelative(1.213f, 0f, 2.31f, -0.723f, 2.788f, -1.838f)
                lineToRelative(4.424f, -10.324f)
                arcToRelative(3.033f, 3.033f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.788f, -1.838f)
            }
        }.build()

        return _CurrencyFlorin!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyFlorin: ImageVector? = null
