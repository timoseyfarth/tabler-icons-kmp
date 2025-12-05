package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.TestPipe2: ImageVector
    get() {
        if (_TestPipe2 != null) {
            return _TestPipe2!!
        }
        _TestPipe2 = ImageVector.Builder(
            name = "Filled.TestPipe2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8f, 0f)
                verticalLineToRelative(-14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                close()
                moveTo(14f, 4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(4f)
                close()
            }
        }.build()

        return _TestPipe2!!
    }

@Suppress("ObjectPropertyName")
private var _TestPipe2: ImageVector? = null
