package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ArrowLeftDashed: ImageVector
    get() {
        if (_ArrowLeftDashed != null) {
            return _ArrowLeftDashed!!
        }
        _ArrowLeftDashed = ImageVector.Builder(
            name = "Filled.ArrowLeftDashed",
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
                horizontalLineToRelative(6f)
                moveToRelative(3f, 0f)
                horizontalLineToRelative(1.5f)
                moveToRelative(3f, 0f)
                horizontalLineToRelative(0.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 12f)
                lineToRelative(6f, 6f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 12f)
                lineToRelative(6f, -6f)
            }
        }.build()

        return _ArrowLeftDashed!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeftDashed: ImageVector? = null
