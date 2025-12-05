package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.WaveSawTool: ImageVector
    get() {
        if (_WaveSawTool != null) {
            return _WaveSawTool!!
        }
        _WaveSawTool = ImageVector.Builder(
            name = "Filled.WaveSawTool",
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
                moveTo(3f, 12f)
                horizontalLineToRelative(5f)
                lineToRelative(4f, 8f)
                verticalLineToRelative(-16f)
                lineToRelative(4f, 8f)
                horizontalLineToRelative(5f)
            }
        }.build()

        return _WaveSawTool!!
    }

@Suppress("ObjectPropertyName")
private var _WaveSawTool: ImageVector? = null
