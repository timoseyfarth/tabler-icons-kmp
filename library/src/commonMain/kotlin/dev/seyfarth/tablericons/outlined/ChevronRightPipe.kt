package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ChevronRightPipe: ImageVector
    get() {
        if (_ChevronRightPipe != null) {
            return _ChevronRightPipe!!
        }
        _ChevronRightPipe = ImageVector.Builder(
            name = "Filled.ChevronRightPipe",
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
                moveTo(6f, 6f)
                lineToRelative(6f, 6f)
                lineToRelative(-6f, 6f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 5f)
                verticalLineToRelative(13f)
            }
        }.build()

        return _ChevronRightPipe!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronRightPipe: ImageVector? = null
