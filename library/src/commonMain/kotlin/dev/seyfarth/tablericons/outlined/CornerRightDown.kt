package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CornerRightDown: ImageVector
    get() {
        if (_CornerRightDown != null) {
            return _CornerRightDown!!
        }
        _CornerRightDown = ImageVector.Builder(
            name = "Filled.CornerRightDown",
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
                horizontalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(10f)
                lineToRelative(-4f, -4f)
                moveToRelative(8f, 0f)
                lineToRelative(-4f, 4f)
            }
        }.build()

        return _CornerRightDown!!
    }

@Suppress("ObjectPropertyName")
private var _CornerRightDown: ImageVector? = null
