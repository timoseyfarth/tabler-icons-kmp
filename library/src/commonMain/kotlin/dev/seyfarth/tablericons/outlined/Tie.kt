package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Tie: ImageVector
    get() {
        if (_Tie != null) {
            return _Tie!!
        }
        _Tie = ImageVector.Builder(
            name = "Filled.Tie",
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
                moveTo(12f, 22f)
                lineToRelative(4f, -4f)
                lineToRelative(-2.5f, -11f)
                lineToRelative(0.993f, -2.649f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.936f, -1.351f)
                horizontalLineToRelative(-3.114f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.936f, 1.351f)
                lineToRelative(0.993f, 2.649f)
                lineToRelative(-2.5f, 11f)
                lineToRelative(4f, 4f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 7f)
                horizontalLineToRelative(3f)
                lineToRelative(5f, 5.5f)
            }
        }.build()

        return _Tie!!
    }

@Suppress("ObjectPropertyName")
private var _Tie: ImageVector? = null
