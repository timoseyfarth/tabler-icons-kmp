package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CurrencyXrp: ImageVector
    get() {
        if (_CurrencyXrp != null) {
            return _CurrencyXrp!!
        }
        _CurrencyXrp = ImageVector.Builder(
            name = "Filled.CurrencyXrp",
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
                moveTo(5f, 5f)
                lineToRelative(3.585f, 3.585f)
                arcToRelative(4.83f, 4.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.83f, 0f)
                lineToRelative(3.585f, -3.585f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 19f)
                lineToRelative(3.585f, -3.585f)
                arcToRelative(4.83f, 4.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.83f, 0f)
                lineToRelative(3.585f, 3.584f)
            }
        }.build()

        return _CurrencyXrp!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyXrp: ImageVector? = null
