package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ArrowBarToRightDashed: ImageVector
    get() {
        if (_ArrowBarToRightDashed != null) {
            return _ArrowBarToRightDashed!!
        }
        _ArrowBarToRightDashed = ImageVector.Builder(
            name = "Filled.ArrowBarToRightDashed",
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
                moveTo(14f, 12f)
                lineToRelative(-10f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 12f)
                lineToRelative(-4f, 4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 12f)
                lineToRelative(-4f, -4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 4f)
                lineToRelative(0f, 3f)
                moveToRelative(0f, 13f)
                lineToRelative(0f, -3f)
                moveToRelative(0f, -3.5f)
                lineToRelative(0f, -3f)
            }
        }.build()

        return _ArrowBarToRightDashed!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBarToRightDashed: ImageVector? = null
