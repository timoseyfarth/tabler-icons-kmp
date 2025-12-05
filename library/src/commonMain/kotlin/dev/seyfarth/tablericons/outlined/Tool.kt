package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Tool: ImageVector
    get() {
        if (_Tool != null) {
            return _Tool!!
        }
        _Tool = ImageVector.Builder(
            name = "Filled.Tool",
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
                moveTo(7f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                lineToRelative(-3.5f, -3.5f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                lineToRelative(6f, 6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                lineToRelative(-6f, -6f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                lineToRelative(3.5f, 3.5f)
            }
        }.build()

        return _Tool!!
    }

@Suppress("ObjectPropertyName")
private var _Tool: ImageVector? = null
