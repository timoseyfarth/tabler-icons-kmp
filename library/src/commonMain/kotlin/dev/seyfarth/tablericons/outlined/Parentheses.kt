package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Parentheses: ImageVector
    get() {
        if (_Parentheses != null) {
            return _Parentheses!!
        }
        _Parentheses = ImageVector.Builder(
            name = "Filled.Parentheses",
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
                moveTo(7f, 4f)
                arcToRelative(12.25f, 12.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 4f)
                arcToRelative(12.25f, 12.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
            }
        }.build()

        return _Parentheses!!
    }

@Suppress("ObjectPropertyName")
private var _Parentheses: ImageVector? = null
