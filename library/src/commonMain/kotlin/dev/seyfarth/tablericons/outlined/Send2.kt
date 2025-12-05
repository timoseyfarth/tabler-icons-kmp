package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Send2: ImageVector
    get() {
        if (_Send2 != null) {
            return _Send2!!
        }
        _Send2 = ImageVector.Builder(
            name = "Filled.Send2",
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
                moveTo(4.698f, 4.034f)
                lineToRelative(16.302f, 7.966f)
                lineToRelative(-16.302f, 7.966f)
                arcToRelative(0.503f, 0.503f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.546f, -0.124f)
                arcToRelative(0.555f, 0.555f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.12f, -0.568f)
                lineToRelative(2.468f, -7.274f)
                lineToRelative(-2.468f, -7.274f)
                arcToRelative(0.555f, 0.555f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.12f, -0.568f)
                arcToRelative(0.503f, 0.503f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.546f, -0.124f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.5f, 12f)
                horizontalLineToRelative(14.5f)
            }
        }.build()

        return _Send2!!
    }

@Suppress("ObjectPropertyName")
private var _Send2: ImageVector? = null
