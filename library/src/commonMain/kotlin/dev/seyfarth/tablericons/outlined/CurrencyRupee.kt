package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CurrencyRupee: ImageVector
    get() {
        if (_CurrencyRupee != null) {
            return _CurrencyRupee!!
        }
        _CurrencyRupee = ImageVector.Builder(
            name = "Filled.CurrencyRupee",
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
                moveTo(18f, 5f)
                horizontalLineToRelative(-11f)
                horizontalLineToRelative(3f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 8f)
                horizontalLineToRelative(-3f)
                lineToRelative(6f, 6f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 9f)
                lineToRelative(11f, 0f)
            }
        }.build()

        return _CurrencyRupee!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyRupee: ImageVector? = null
