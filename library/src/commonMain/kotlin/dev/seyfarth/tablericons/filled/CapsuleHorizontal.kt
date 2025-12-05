package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.CapsuleHorizontal: ImageVector
    get() {
        if (_CapsuleHorizontal != null) {
            return _CapsuleHorizontal!!
        }
        _CapsuleHorizontal = ImageVector.Builder(
            name = "Filled.CapsuleHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 5f)
                horizontalLineToRelative(-6f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 14f)
                horizontalLineToRelative(6f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, -7f)
                lineToRelative(-0.007f, -0.303f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.993f, -6.697f)
                close()
            }
        }.build()

        return _CapsuleHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _CapsuleHorizontal: ImageVector? = null
