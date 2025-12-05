package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CurrencyHryvnia: ImageVector
    get() {
        if (_CurrencyHryvnia != null) {
            return _CurrencyHryvnia!!
        }
        _CurrencyHryvnia = ImageVector.Builder(
            name = "Filled.CurrencyHryvnia",
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
                moveTo(8f, 7f)
                arcToRelative(2.64f, 2.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.562f, -2f)
                horizontalLineToRelative(3.376f)
                arcToRelative(2.64f, 2.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.562f, 2f)
                arcToRelative(2.57f, 2.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.344f, 2.922f)
                lineToRelative(-5.876f, 2.938f)
                arcToRelative(3.338f, 3.338f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.78f, 3.64f)
                arcToRelative(3.11f, 3.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.05f, 2.5f)
                horizontalLineToRelative(2.888f)
                arcToRelative(2.64f, 2.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.562f, -2f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 10f)
                horizontalLineToRelative(12f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 14f)
                horizontalLineToRelative(12f)
            }
        }.build()

        return _CurrencyHryvnia!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyHryvnia: ImageVector? = null
