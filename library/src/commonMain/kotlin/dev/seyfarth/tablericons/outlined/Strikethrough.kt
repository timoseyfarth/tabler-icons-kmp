package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Strikethrough: ImageVector
    get() {
        if (_Strikethrough != null) {
            return _Strikethrough!!
        }
        _Strikethrough = ImageVector.Builder(
            name = "Filled.Strikethrough",
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
                moveTo(5f, 12f)
                lineToRelative(14f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 6.5f)
                arcToRelative(4f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -1.5f)
                horizontalLineToRelative(-1f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7f)
                horizontalLineToRelative(2f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 7f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(4f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -1.5f)
            }
        }.build()

        return _Strikethrough!!
    }

@Suppress("ObjectPropertyName")
private var _Strikethrough: ImageVector? = null
