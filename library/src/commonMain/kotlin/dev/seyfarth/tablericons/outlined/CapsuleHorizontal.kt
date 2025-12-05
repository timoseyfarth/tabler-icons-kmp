package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CapsuleHorizontal: ImageVector
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
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 6f)
                moveToRelative(0f, 6f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, -6f)
                horizontalLineToRelative(6f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 6f)
                verticalLineToRelative(0f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 6f)
                horizontalLineToRelative(-6f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, -6f)
                close()
            }
        }.build()

        return _CapsuleHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _CapsuleHorizontal: ImageVector? = null
