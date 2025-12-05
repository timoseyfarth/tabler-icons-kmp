package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CurrencyLitecoin: ImageVector
    get() {
        if (_CurrencyLitecoin != null) {
            return _CurrencyLitecoin!!
        }
        _CurrencyLitecoin = ImageVector.Builder(
            name = "Filled.CurrencyLitecoin",
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
                moveTo(18f, 19f)
                horizontalLineToRelative(-8.194f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.98f, -2.283f)
                lineToRelative(1.674f, -11.717f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 9f)
                lineToRelative(-9f, 4f)
            }
        }.build()

        return _CurrencyLitecoin!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyLitecoin: ImageVector? = null
