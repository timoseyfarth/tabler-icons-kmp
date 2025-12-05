package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ArrowsSort: ImageVector
    get() {
        if (_ArrowsSort != null) {
            return _ArrowsSort!!
        }
        _ArrowsSort = ImageVector.Builder(
            name = "Filled.ArrowsSort",
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
                moveTo(3f, 9f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
                moveToRelative(-4f, -4f)
                verticalLineToRelative(14f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 15f)
                lineToRelative(-4f, 4f)
                lineToRelative(-4f, -4f)
                moveToRelative(4f, 4f)
                verticalLineToRelative(-14f)
            }
        }.build()

        return _ArrowsSort!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsSort: ImageVector? = null
