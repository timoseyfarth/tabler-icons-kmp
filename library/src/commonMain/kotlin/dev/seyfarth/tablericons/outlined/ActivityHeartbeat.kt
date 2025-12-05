package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ActivityHeartbeat: ImageVector
    get() {
        if (_ActivityHeartbeat != null) {
            return _ActivityHeartbeat!!
        }
        _ActivityHeartbeat = ImageVector.Builder(
            name = "Filled.ActivityHeartbeat",
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
                horizontalLineToRelative(4.5f)
                lineToRelative(1.5f, -6f)
                lineToRelative(4f, 12f)
                lineToRelative(2f, -9f)
                lineToRelative(1.5f, 3f)
                horizontalLineToRelative(4.5f)
            }
        }.build()

        return _ActivityHeartbeat!!
    }

@Suppress("ObjectPropertyName")
private var _ActivityHeartbeat: ImageVector? = null
