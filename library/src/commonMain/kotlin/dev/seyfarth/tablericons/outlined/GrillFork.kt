package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.GrillFork: ImageVector
    get() {
        if (_GrillFork != null) {
            return _GrillFork!!
        }
        _GrillFork = ImageVector.Builder(
            name = "Filled.GrillFork",
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
                lineToRelative(11.5f, 11.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.347f, 16.575f)
                lineToRelative(1.08f, 1.079f)
                arcToRelative(1.96f, 1.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.773f, 2.772f)
                lineToRelative(-1.08f, -1.079f)
                arcToRelative(1.96f, 1.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.773f, -2.772f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 7f)
                lineToRelative(3.05f, 3.15f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.1f, -4.1f)
                lineToRelative(-3.15f, -3.05f)
            }
        }.build()

        return _GrillFork!!
    }

@Suppress("ObjectPropertyName")
private var _GrillFork: ImageVector? = null
